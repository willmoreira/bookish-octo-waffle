/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;
import api.dao.ComentarioDAO;
import api.dao.UsuarioDAO;
import api.modelo.Comentario;
import api.modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author william
 */
public class ComentarioDAOMysqlDB implements ComentarioDAO{
    
    Connection conn;

    public ComentarioDAOMysqlDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bdBlog?" +
                                   "user=root&password=fatec");
            System.out.println("Conectado.. Usuario DAO...");
        } catch (Exception e){
            System.out.print("Erro de conexão...UsuarioDAOMYSQL");
        }
    }
    
    @Override
    public Comentario insert(Comentario comentarios) {
        Comentario c = null;
        try{
            PreparedStatement query = conn.prepareStatement("insert into  comentario (idpost, comentario , idusuario) values(?,?,?)");
            query.setLong(1,c.getIdPost());
            query.setString(2, c.getComentario());
            query.setLong(3, c.getIdUsuario());
            
           
            query.execute();
            query.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return c;
    }

    
    public void delete(Long idComentario) {
        
            Comentario c = null;
          
        try{        
            PreparedStatement query = conn.prepareStatement("select * from comentario where id = ?");  

            query.setLong(1, idComentario);
            ResultSet rs = query.executeQuery();
            System.out.println("Consulta feita com sucesso...");
            rs.next();
            c = new Comentario();
            c.setIdComentario(rs.getInt(1));/* pode ser que esteja errado o int ou String no banco  */
            c.setIdPost(rs.getInt(2));
            c.setIdUsuario(rs.getInt(3));
            c.setComentario(rs.getString(4));
           
            if(idComentario.equals(c.getIdComentario())){
                 try
                    {
                         PreparedStatement comandoSQLDelete = conn.prepareStatement("delete from comentario where id = ?");  
                         comandoSQLDelete.setLong(1, idComentario);
                         comandoSQLDelete.execute();
                         System.out.println("Excluido com sucesso!");
                         comandoSQLDelete.close();
                         query.close();
                          rs.close();
                     }
                catch (Exception e){
                          System.out.print("\nErro de conexão...metodo deletarMedico");
                }
            }
       } catch(Exception e) {
          System.out.print(e.getMessage());
       }
    }


    @Override
    public List<Comentario> findAll() {
        Comentario c = null;
        try{        
            PreparedStatement comandoSQLp = conn.prepareStatement("select * from bdBlog.usuario"); 
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();
            c = new Comentario();
            c.setIdComentario(rs.getInt(1));
            c.setIdPost(rs.getInt(2));
            c.setIdUsuario(rs.getInt(3));
            c.setComentario(rs.getString(4));
            
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return (List) c;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id usuario ");
        }
        return (List) c;       
    }

    @Override
    public Comentario update(Comentario comentarioAnt, Comentario comentarioAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

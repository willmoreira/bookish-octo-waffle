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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author william
 */
public class ComentarioDAOMysqlDB implements ComentarioDAO{
    
    Connection conn;

    public ComentarioDAOMysqlDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bdBlog?" +
                                   "user=root&password=fatec");
            System.out.println("Conectado.. Usuario DAO...");
        } catch (Exception e){
            System.out.print("Erro de conexão...UsuarioDAOMYSQL");
            e.printStackTrace();
        }
    }
    
    @Override
    public Comentario insert(Comentario comentario) {
        
        try{
            PreparedStatement query = conn.prepareStatement("insert into  comentario (idpost, comentario , idusuario) values(?,?,?)");
            query.setLong(1,comentario.getIdPost());
            query.setString(2, comentario.getComentario());
            query.setLong(3, comentario.getIdUsuario());
            query.executeUpdate();
            query.close();
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(Long idComentario) {
        
           
                 try
                    {
                         PreparedStatement comandoSQLDelete = conn.prepareStatement("delete from comentario where idcomentario = ?");  
                         comandoSQLDelete.setLong(1, idComentario);
                         comandoSQLDelete.executeUpdate();
                         System.out.println("Excluido com sucesso!");
                         comandoSQLDelete.close();
                         
                         
                     }
                catch (Exception e){
                           e.printStackTrace();
                          System.out.print("\nErro de conexão...deletar comentario");
                }
 }
    @Override
    public void update(Comentario comentario) {
        Long id = comentario.getIdComentario();
       
        
        try{
            PreparedStatement query = conn.prepareStatement("update comentario set idpost=?, comentario=? , idusuario=? where idcomentario=?  ");
            query.setLong(1,comentario.getIdPost());
            query.setString(2, comentario.getComentario());
            query.setLong(3, comentario.getIdUsuario());
            query.setLong(4,id);
            query.executeUpdate();
            query.close();
            conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }  
    }
    


    @Override
    public List<Comentario> findAll() {
        List <Comentario> listComent = new ArrayList<>(); 
        Comentario c = null;
        try{        
            PreparedStatement comandoSQLp = conn.prepareStatement("select * from bdBlog.comentario"); 
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..aqui manezao comentario find all");
            //rs.next();
            /*c.setIdComentario(rs.getInt(1));
            c.setIdPost(rs.getInt(2));
            c.setIdUsuario(rs.getInt(3));*/
            while(rs.next()){
            c = new Comentario();

            c.setComentario(rs.getString("comentario"));
            listComent.add (c);
            }
            
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            //rs.close();
            //conn.close();
            return listComent;
                       

        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find all comentario ");
          e.printStackTrace();
        }
       return null;      
    }

    @Override
    public Comentario findByIdUserComentario(Long IdUsuario) {
        Comentario c = null;
        try{        
            PreparedStatement comandoSQLp = conn.prepareStatement("select * from bdBlog.usuario where email = ?");  
            comandoSQLp.setString(1, IdUsuario.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();
            c = new Comentario();
            c.setComentario(rs.getString(1));
            c.setIdComentario(rs.getLong(3));
            c.setIdPost(rs.getInt(4));
            c.setIdUsuario(rs.getInt(5));
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return c;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id usuario ");
        }
        return c;        
    }

    public Comentario findByIdComentario(Long IdComentario) {
        Comentario c = null;
        try{        
            PreparedStatement comandoSQLp = conn.prepareStatement("select * from bdBlog.comentario where idcomentario=?");  
            comandoSQLp.setString(1, IdComentario.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..buscar comentario pelo id");
            while(rs.next()){
            c = new Comentario();
            c.setComentario(rs.getString("comentario"));
            c.setIdComentario(rs.getLong("idcomentario"));
            c.setIdPost(rs.getInt("idpost"));
            c.setIdUsuario(rs.getInt("idusuario"));
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            //comandoSQLp.close();
            //rs.close();
            //conexao.close();
            //return c;
            }  
        }
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id usuario ");
        }
        return c;        
    }

    @Override
    public List<Comentario> findByIdPost(Long idPost) {
        
       String sql = "SELECT * FROM comentario INNER JOIN post ON comentario.idcomentario = post.idcomentario";
        
        
        
        
        
        List <Comentario> listComent = new ArrayList<>(); 
        Comentario c = null;
        try{        
            PreparedStatement comandoSQLp = conn.prepareStatement("select * from bdBlog.comentario"); 
            ResultSet rs = comandoSQLp.executeQuery();       
            System.out.println("Conectei..");
           
            c = new Comentario();
            
            while(rs.next()){
            c.setComentario(rs.getString("comentario"));
            c.setIdComentario(rs.getLong("idcomentario"));
            c.setIdPost(rs.getInt("idpost"));
            c.setIdUsuario(rs.getInt("idusuario"));
            listComent.add (c);
            }           
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return listComent;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id usuario ");
          e.printStackTrace();
        }
        return (List) c; 
    }
    

    
}

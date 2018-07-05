/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.dao;
import api.dao.UsuarioDAO;
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
public class UsuarioDAOMysqlDB  implements UsuarioDAO{
    Connection conn;
    
    public UsuarioDAOMysqlDB(){
        try{
                Class.forName("com.mysql.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bdBlog?" + "user=root&password=fatec");
            System.out.println("Conectado.. Usuario DAO...");
        } catch (Exception e){
            System.out.print("Erro de conexão...UsuarioDAOMYSQL");
        }
    }

    @Override
    public Usuario insert(Usuario usuario) {
        Usuario u = null;
        try{
            PreparedStatement query = conn.prepareStatement("insert into  usuario (nome, cpf , senha, email, tipouser, assunto ) values(?,?,?,?,?,?)");
            query.setString(1, u.getNome());
            query.setLong(2, u.getCpf());
            query.setString(3, u.getSenha());
            query.setString(4, u.getEmail());
            query.setLong(5, u.getTipoUser());
            query.setString(6, u.getAssunto());
            query.execute();
            query.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return u;
    }

    @Override
    public Usuario findById(Long id) {
        Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conn.prepareStatement("select * from bdBlog.usuario where id = ?");  
            comandoSQLp.setString(1, id.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNome(rs.getString(2));
            u.setCpf(rs.getLong(3));
            u.setSenha(rs.getString(4));
            u.setEmail(rs.getString(5));
            u.setAssunto(rs.getString(7));
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id usuario /n" ); 
                   e.printStackTrace();
        }
        return u;        
    }

    @Override
    public Usuario findByEmail(String emailUsuario) {
         Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conn.prepareStatement("select * from bdBlog.usuario where email = ?");  
            comandoSQLp.setString(1, emailUsuario.toString());
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNome(rs.getString(2));
            u.setCpf(rs.getLong(3));
            u.setSenha(rs.getString(4));
            u.setEmail(rs.getString(5));
            u.setAssunto(rs.getString(7));
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id usuario ");
        }
        return u;        
    }
    @Override
    public List<Usuario> findAll() {
         Usuario u = null;
        try{        
            PreparedStatement comandoSQLp = conn.prepareStatement("select * from bdBlog.usuario"); 
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei..");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNome(rs.getString(2));
            u.setCpf(rs.getLong(3));
            u.setSenha(rs.getString(4));
            u.setEmail(rs.getString(5));
            u.setAssunto(rs.getString(7));
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            return (List) u;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexão...Find by id usuario ");
        }
        return (List) u;       
    }

    @Override
    public Usuario update(Usuario usuarioAnt, Usuario usuarioAt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void delete(Long id) {
    Usuario u = null;
          
        try{        
            PreparedStatement query = conn.prepareStatement("select * from usuario where id = ?");  
            query.setLong(1, (Long) id);
            ResultSet rs = query.executeQuery();
            System.out.println("Consulta feita com sucesso...");
            rs.next();
            u = new Usuario();
            u.setId(rs.getLong(1));
            u.setNome(rs.getString(2));
            u.setCpf(rs.getLong(3));
            u.setSenha(rs.getString(4));
            u.setEmail(rs.getString(5));
            u.setTipoUser(rs.getLong(6));
            u.setAssunto(rs.getString(7));
            if(id.equals(u.getId())){
                 try
                    {
                         PreparedStatement comandoSQLDelete = conn.prepareStatement("delete from medico where id = ?");  
                         comandoSQLDelete.setLong(1, id);
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

    
} 
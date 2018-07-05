/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import core.dao.UsuarioDAOMysqlDB;

/**
 *
 * @author william
 */
public class ServicoUsuarioImpl implements ServicoUsuario{
    UsuarioDAOMysqlDB userDao = new UsuarioDAOMysqlDB();
    
    
    public Usuario insert(Usuario usuario) {
        Usuario user = userDao.insert(usuario);
        

       return user;
    }
    
    public Usuario delete(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Usuario findByNomeUsuario(String nomeUsuario) {
        
        Usuario userEmail = userDao.findByEmail(nomeUsuario);
        return userEmail;
    }    
    
    public Usuario findByid(Long id ){
        return userDao.findById(id);
        
    
    }

    public Usuario findByID(Long id) {
        UsuarioDAOMysqlDB userDao = new UsuarioDAOMysqlDB();
        System.out.println("deuruim servico ****");
        return userDao.findById(id);
        
    }
    
    
}

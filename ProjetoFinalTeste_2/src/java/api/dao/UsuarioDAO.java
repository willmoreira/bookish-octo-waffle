/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dao;

import api.modelo.Usuario;
import java.util.List;

/**
 *
 * @author william
 */
public interface UsuarioDAO {
    public Usuario insert(Usuario usuario);
    public Usuario findById(Long id);
    public Usuario findByEmail(String emailUsuario);
    public List<Usuario> findAll();
    public Usuario update(Usuario usuarioAnt, Usuario usuarioAt);
    public void delete(Long id); 
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.dao;

import api.modelo.Comentario;
import api.modelo.Usuario;
import java.util.List;

/**
 *
 * @author william
 */
public interface ComentarioDAO {
    public Comentario insert(Comentario comentario);
    public void delete(Long idComentario);   
    public Comentario update(Comentario comentarioAnt, Comentario comentarioAt);
    public List<Comentario> findAll();

    
    
    
    
}

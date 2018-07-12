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
    public void update(Comentario comentario);
    public List<Comentario> findAll();
    public Comentario findByIdUserComentario(Long IdUsuario);
    public Comentario findByIdComentario(Long idComentario);
    public List <Comentario> findByIdPost(Long idPost);
   
    
}

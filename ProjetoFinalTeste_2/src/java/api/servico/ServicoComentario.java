/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Comentario;
import java.util.List;

/**
 *
 * @author william
 */
public interface ServicoComentario {
    
    public  void insert(Comentario comentario);
    public Comentario delete(Long id);
    public Comentario findByIdComentario(Long IdComentario);
    public Comentario findByIdUserComentario(Long IdUsuario);
    public List <Comentario> findAll();
    public List <Comentario> findIdPost(Long IdPost);
    public void update(Comentario comentario);
}

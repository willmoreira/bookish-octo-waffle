/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.servico;

import api.modelo.Comentario;

/**
 *
 * @author william
 */
public interface ServicoComentario {
    
    public Comentario insert(Comentario comentarios);
    public Comentario delete(Comentario comentarios);
    public Comentario findByIdComentario(Comentario comentarios);
}

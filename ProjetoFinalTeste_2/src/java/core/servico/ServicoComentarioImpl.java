/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.servico;

import api.modelo.Comentario;
import api.servico.ServicoComentario;
import core.dao.ComentarioDAOMysqlDB;
import java.util.List;

/**
 *
 * @author william
 */
public class ServicoComentarioImpl implements ServicoComentario{
    
    ComentarioDAOMysqlDB comentDao = new ComentarioDAOMysqlDB();

    
    public void insert(Comentario comentario) {
        ComentarioDAOMysqlDB comentDao = new ComentarioDAOMysqlDB();

        try{
        comentDao.insert(comentario); 
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
   
    @Override
    public Comentario delete(Long idComentario) {
        ComentarioDAOMysqlDB comentDao = new ComentarioDAOMysqlDB();
        comentDao.delete(idComentario);
        return null;
    }
    
  
    
   
    
    public Comentario findByIdUserComentario(Long idUsuario){
        Comentario coment = comentDao.findByIdUserComentario(idUsuario);
        return coment;
    }

    @Override
    public Comentario findByIdComentario(Long idComentario) {
        ComentarioDAOMysqlDB comentDao = new ComentarioDAOMysqlDB();
        return comentDao.findByIdComentario(idComentario);
    }

    
    @Override
    public List<Comentario> findAll() {
       ComentarioDAOMysqlDB comentDao = new ComentarioDAOMysqlDB();

       return comentDao.findAll();
        
    }

    @Override
    public void update(Comentario comentario) {
        ComentarioDAOMysqlDB comentDao = new ComentarioDAOMysqlDB();
        comentDao.update(comentario);
    }

    @Override
    public List<Comentario> findIdPost(Long IdPost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    

    
}



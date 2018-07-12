/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

import api.modelo.Comentario;
import api.servico.ServicoComentario;
import core.servico.ServicoComentarioImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author william
 */
@WebServlet (name = "Comentario", urlPatterns = {"/upDateComentario"})
public class RefazerComentarioServlet extends HttpServlet{
    
    
  
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        ServicoComentario comentarioServ = new ServicoComentarioImpl();
        Long id = Long.parseLong(req.getParameter("idcomentario"));
        int idpost = Integer.parseInt(req.getParameter("idpost"));
        int idUsuario = Integer.parseInt(req.getParameter("idusuario"));
        String comentario = req.getParameter("comentario");
        Comentario coment = new Comentario();
        ServletContext sc = req.getServletContext();

        
        coment.setIdComentario(id);
        coment.setComentario(comentario);
        coment.setIdPost(idpost);
        coment.setIdUsuario(idUsuario);
        
        
 
        comentarioServ.update(coment);
        
        
        List <Comentario> comentarios = comentarioServ.findAll();
        
        PrintWriter pw = resp.getWriter();
       
            
            
            pw.write("comentario atualizado");
        
        
        
        
        //ServletContext contexto = getServletContext();
        //contexto.getRequestDispatcher("/dynamic/jsp/comentarios.jsp").forward(req, resp);
    }
   
        
    
}
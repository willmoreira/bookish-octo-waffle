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
@WebServlet(name = "CadastroServlet", urlPatterns = {"/insertComentario"})
public class InserirComentarioServlet extends HttpServlet {

   
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServicoComentario comentarioServ = new ServicoComentarioImpl();
       
        int idpost = Integer.parseInt(req.getParameter("idpost"));
        int idUsuario = Integer.parseInt(req.getParameter("iduser"));
        String comentario = req.getParameter("comentario");
        
        try{
        Comentario coment = new Comentario();
        coment.setComentario(comentario);
        coment.setIdPost(idpost);
        coment.setIdUsuario(idUsuario);
        
        comentarioServ.insert(coment);        
        }catch(Exception e){ 
            e.printStackTrace();
        }
        PrintWriter pw = resp.getWriter();
       
            pw.write("comentario inserido com sucesso!!!");
           
    }
    
}


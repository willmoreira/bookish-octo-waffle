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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author william
 */
@WebServlet(name = "DeletarComentarioServlet", urlPatterns = {"/deleteComentario"})
public class DeletarComentarioServlet extends HttpServlet {

    
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServicoComentario comentarioServ = new ServicoComentarioImpl();
             
        Long id = Long.parseLong(req.getParameter("idcomentario"));
        comentarioServ.delete(id);
          PrintWriter pw = resp.getWriter();
       
            pw.write("comentario deletado com sucesso!!!");
           
        //ServletContext contexto = getServletContext();
        //contexto.getRequestDispatcher("/dynamic/jsp/cadastro.jsp").forward(req, resp);
    }
}

    


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
@WebServlet(name = "BuscarComentarioServlet", urlPatterns = {"/BuscarComentario"})
public class BuscarComentarioServlet extends HttpServlet {
    
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {          
           String opcao; 
           
           if (req.getParameter("btn") != null){
               opcao = req.getParameter("btn");
               
                if(opcao.equals("buscarcomentario")){
                ServicoComentario comentarioServ = new ServicoComentarioImpl();
                Long id = Long.parseLong(req.getParameter("idcomentario"));

                Comentario coment = null;  
        
                coment = comentarioServ.findByIdComentario(id);
                PrintWriter pw = resp.getWriter();
                   
                pw.println(coment.getComentario());
                pw.println("comentario encontrado");
                

                
                pw.close();
                
                }else if(opcao.equals("buscartodos")){
                ServicoComentario comentarioServ = new ServicoComentarioImpl();
        
                List <Comentario> comentarios = comentarioServ.findAll();
        
                PrintWriter pw = resp.getWriter();
                for(Comentario c:comentarios){
                pw.write("Comentario: "+c.getComentario()+ "\n \n");    
                
                }    
            }
        }else{
        ServletContext contexto = getServletContext();
        contexto.getRequestDispatcher("/dynamic/jsp/buscarComentario.jsp").forward(req, resp);
        }
    }
}

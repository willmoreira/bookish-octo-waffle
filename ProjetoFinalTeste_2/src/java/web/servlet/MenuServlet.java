/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;

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
@WebServlet(name = "MenuServlet", urlPatterns = {"/MenuServlet"})
public class MenuServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        //if(req.getParameter("buscar")!=null){
       String opcao;
        
       
       if(req.getParameter("btn") != null){
           opcao=req.getParameter("btn");
       
        if(opcao.equals("buscar")){   
        ServletContext contexto = getServletContext();
        contexto.getRequestDispatcher("/dynamic/jsp/buscarComentario.jsp").forward(req, resp);
            
        }else if(opcao.equals("inserir")){
        ServletContext contexto = getServletContext();
        contexto.getRequestDispatcher("/dynamic/jsp/inserirComentario.jsp").forward(req, resp);
        }
        else if(opcao.equals("deletar")){
        ServletContext contexto = getServletContext();
        contexto.getRequestDispatcher("/dynamic/jsp/deletarComentario.jsp").forward(req, resp);
        }
        else if(opcao.equals("refazer")){
        ServletContext contexto = getServletContext();
        contexto.getRequestDispatcher("/dynamic/jsp/alterarComentario.jsp").forward(req, resp);
        }
        
        }
        else{
        ServletContext contexto = getServletContext();
        contexto.getRequestDispatcher("/dynamic/jsp/menuComentario.jsp").forward(req, resp);
        }
        
    }

    

}

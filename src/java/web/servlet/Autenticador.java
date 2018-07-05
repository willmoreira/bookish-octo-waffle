/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;
import core.dao.UsuarioDAOMysqlDB;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author william
 */
public class Autenticador extends HttpServlet{
   UsuarioDAOMysqlDB Udb; 
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp){
        
        ServletContext sc = req.getServletContext();
        try{
            String email = req.getParameter("email");
            String senha = req.getParameter("senha");
            sc.getRequestDispatcher("/dynamic/jsp/Google.jsp").forward(req, resp);
        } catch (Exception e){}
    }
}

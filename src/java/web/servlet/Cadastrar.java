/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.servlet;



import api.modelo.Usuario;
import api.servico.ServicoUsuario;
import core.servico.ServicoUsuarioImpl;
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
@WebServlet(name = "Cadastrar", urlPatterns = {"/cadastrar"})
public class Cadastrar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String nome;
            String senha; //pwd
            String email;
            String assunto;
            String categoria;
            Long cpf; 
        
            ServicoUsuario userServ = new ServicoUsuarioImpl();
            //ServletContext contexto = getServletContext();
            
            /*nome = request.getParameter("nome");
            senha = request.getParameter("pwd");  //confirmar senha
            email = request.getParameter("email");
            assunto = request.getParameter("assunto");
            categoria = request.getParameter("categoria");
            cpf = (Long.parseLong(request.getParameter("cpf")));

            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setSenha(senha);
            usuario.setEmail(email);
            usuario.setAssunto("assunto");
            usuario.setCpf(cpf);
            usuario.setCategoria("categoria");
            */
            
            
            Usuario retorno = userServ.findByID(1L);
            
            PrintWriter pw = response.getWriter();
            pw.write("nome "+ retorno.getNome() + " senha" + retorno.getSenha());
            pw.close();
          


            
    }


}

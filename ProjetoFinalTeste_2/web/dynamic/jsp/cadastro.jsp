<%-- 
    Document   : cadastro
    Created on : 19/06/2018, 20:38:22
    Author     : william
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String contexto = request.getContextPath();
    if (!contexto.equals(""))
        contexto = contexto + "/";
%>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link  rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/willmoreira/css/master/style11.css">
        <script src="https://cdn.rawgit.com/willmoreira/css/master/logicablog1.js" type="text/javascript"></script>
        <script src="https://cdn.rawgit.com/willmoreira/css/master/teste.js" type="text/javascript"></script>
        <script src="https://cdn.rawgit.com/willmoreira/css/master/jquery.min.js" type="text/javascript"></script>       
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">   
 
    </head>
    
    <body>
        <div class="header">
            <h1>INSIRA SEUS DADOS E CONFIRME SEU CADASTRO</h1>
        </div>
        
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <ul class="nav navbar-nav">
                      
                        <li><a href="${pageContext.request.contextPath}/inicio" id="demo1">HOME</a></li>
                        <li><a href="${pageContext.request.contextPath}/Cadastro" id="demo2">CADASTRO</a></li>
                        <li><a href="${pageContext.request.contextPath}/Sobre" id="demo3">SOBRE</a></li>
                        <li><a href="${pageContext.request.contextPath}/MenuServlet" id="demo4">MENU COMENTARIO</a></li>

                        
                    
                        <li><a class="container">    
                              <div id="block1">    
                                  <form class="form-group" action="cadastrar" method="post">
                                        <label class="busca" for="nome">NOME  :</label>
                                        <input type="text" class="form-control" id="nome1" placeholder="Insira seu nome" name="nome">
                                                               
                                        <label class="busca" for="cpf">CPF  :</label>
                                        <input type="text" class="form-control" id="cpf1" placeholder="Insira seu cpf" name="cpf">
                                                              
                                        <label class="busca" for="pwd">SENHA :</label>
                                        <input type="password" class="form-control" id="pwd1" placeholder="Insira sua senha" name="pwd">
                                    
                                        <label class="busca" for="pwdconfirmar">REPITA A SENHA:</label>
                                        <input type="password" class="form-control" id="pwdconfirmar1" placeholder="Repita a senha" name="pwdconfirmar">

                                        <label class="busca" for="email">EMAIL :</label>
                                        <input type="email" class="form-control" id="email1" placeholder="Insira seu email" name="email">                                 
                                        
                                        <select id="combo1" name="assunto">                                    
                                            <option>SELECIONE UM ASSUNTO DE INTERESSE</option>                                   
                                        </select>                                  
                                        <select id="combo2" name="categoria">                                   
                                            <option>CATEGORIA</option>                               
                                        </select>                                                                                     
                                        <div class="checkbox">
                                            <div class="form-group">
                                                <button id= "for-block1" type="submit" class="btn btn-default">CADASTRAR</button>
                                            </div>
                                        </div>                              
                                </form>
                              </div>                              
                            </a>
                        </li>
                    </ul>
                </div>
            </div>  
        </nav>
    </body>
</html>


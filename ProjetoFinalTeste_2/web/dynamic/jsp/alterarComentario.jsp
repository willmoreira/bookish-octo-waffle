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
            <h1>REFAZER COMENTARIO</h1>
        </div>
        
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <ul class="nav navbar-nav">
                        <li><a href="${pageContext.request.contextPath}/inicio" id="demo1">HOME</a></li>
                        <li><a href="${pageContext.request.contextPath}/Cadastro" id="demo2">CADASTRO</a></li>
                        <li><a href="${pageContext.request.contextPath}/Sobre" id="demo3">SOBRE</a></li>
                        <li><a href="${pageContext.request.contextPath}/MenuServlet" id="demo4">MENU COMENTARIO</a></li>

                    </ul>
                        
                  <form action="upDateComentario" method="post"> 
                        
                        <ul style="list-style-type:none">   
                        <li>                                 
                            <label class="busca" for="idUser">ID COMENTARIO</label>
                            <input type="text" class="form-control" id="pwd1" placeholder="ID do comentario" name="idcomentario">
                        </li>
                     
                            
                        <li><label class="busca" for="idPost">ID POST</label>
                            <input type="text" class="form-control" id="nome1" placeholder="ID do Post" name="idpost">
                        </li>                                     
                        <li>
                            <label class="busca" for="comentario" >COMENTARIO</label>
                        </li>
                        <li> 
                            <textarea class="tentando" rows="5" name="comentario">Deixe seu comentario</textarea>  
                        </li> 
                        <li>                                 
                            <label class="busca" for="idUser">ID USUARIO</label>
                            <input type="text" class="form-control" id="pwd1" placeholder="ID do usuario" name="idusuario">
                        </li>
                        <li>
                           <div class="checkbox">
                                <div class="form-group">
                                    <button id= "for-block1" type="submit" class="btn btn-default" name="btn" value="refazer">REFAZER COMENTARIO</button>
                                </div>
                           </div>   
                            
                        </li>                                 
                    </ul>
                  </form>
                </div>
            </div>  
        </nav>
    </body>
</html>


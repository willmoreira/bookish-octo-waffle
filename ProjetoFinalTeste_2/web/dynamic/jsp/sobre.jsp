<%-- 
    Document   : sobre
    Created on : 01/07/2018, 20:33:02
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
            <h1>MINHA HISTORIA E MINHAS EXPERIENCIAS</h1>
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
                </div>             
            </div> 
        </nav>
        <div class="row">
            <div class="header">
                <div class="card">
                  <h1>MINHA HISTORIA</h1>
                        <p class="teste10">Mussum Ipsum, cacilds vidis litro abertis. Viva Forevis aptent taciti sociosqu ad litora torquent. Si num tem leite então bota uma pinga aí cumpadi! In elementis mé pra quem é amistosis quis leo. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.
                       Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis. Aenean aliquam molestie leo, vitae iaculis nisl. Delegadis gente finis, bibendum egestas augue arcu ut est. Mauris nec dolor in eros commodo tempor. Aenean aliquam molestie leo, vitae iaculis nisl. 
                       Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
                </div>
            </div>
        </div>
        
        <div class="footer">
          <h2>Midias sociais</h2>
        </div>  
        
   
    </body>
</html>

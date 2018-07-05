<%-- 
    Document   : home.jsp
    Created on : 19/06/2018, 20:37:52
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
        <link rel="stylesheet" type="text/css" href="../../static/css/style11.css">
        <script src="../../static/js/logicablog.js" type="text/javascript"></script>
        <script src="../../static/js/jquery-3.3.1.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">   
    </head>
    <body>
        <div class="header">
            <h1>APPLE EASY</h1>
            </div>
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                 <div class="navbar-header">        
                    <ul class="nav navbar-nav">
                        <li><a href="${contexto}home.jsp" id="demo1">HOME</a></li>
                        <li><a href="${contexto}cadastro.jsp" id="demo2">CADASTRO</a></li>
                        <li><a href="${contexto}sobre.jsp" id="demo3">SOBRE</a></li>
                        <li>                  
                            <div class="container">
                                <form class="form-inline" action="Autenticador" method="post">
                                    <div id="qlqcoisa">
                                            <label for="email">EMAIL:</label>
                                            <input type="email" class="form-control" name="email" id="email" placeholder="INSIRA SEU EMAIL" name="email">
                                            <label for="pwd">SENHA:</label>
                                            <input type="password" class="form-control" name="senha" id="pwd" placeholder="INSIRA SUA SENHA" name="pwd">
                                            <button type="submit" class="btn btn-default">ENTRAR</button>
                                    </div>
                                </form>
                            </div>                          
                        </li>
                        <li>
                            <a>
                                <form class="form-inline">
                                    <div>
                                        <input type="text" id="busca1" class="form-control" placeholder="BUSCAR NO BLOG" name="busca">
                                        <button type="submit" id="busca2" class="btn btn-default">BUSCAR</button>                                                          
                                    </div>                                     
                                </form>                           
                            </a>
                        </li>
                    </ul>
                </div>
            </div> 
        </nav>
    
        <div class="row">
            <div class="centercolumn">
                <div class="card">
                    <h2>TITULO POST</h2>
                    <h5>Titulo descritivo, Data, 2018</h5>
                    <div class="fakeimg" style="height:200px;">Image</div>
                        <p>Mussum Ipsum, cacilds vidis litro abertis. Viva Forevis aptent taciti sociosqu ad litora torquent. Si num tem leite então bota uma pinga aí cumpadi! In elementis mé pra quem é amistosis quis leo. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.
                        Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis. Aenean aliquam molestie leo, vitae iaculis nisl. Delegadis gente finis, bibendum egestas augue arcu ut est. Mauris nec dolor in eros commodo tempor. Aenean aliquam molestie leo, vitae iaculis nisl. </p>
                        <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
                    <form action="/action_page.php" id="comentario1">
                        <textarea class="tentando" rows="5" name="comentario1" form="comentario1">Deixe seu comentario</textarea>   
                    </form>
                    <button type="submit" class="btn btn-default">ENVIAR</button>
                </div>

                <div class="card">
                    <h2>TITULO POST</h2>
                    <h5>Titulo descritivo, Data, 2018</h5>
                    <div class="fakeimg" style="height:200px;">Image</div>
                        <p>Mussum Ipsum, cacilds vidis litro abertis. Viva Forevis aptent taciti sociosqu ad litora torquent. Si num tem leite então bota uma pinga aí cumpadi! In elementis mé pra quem é amistosis quis leo. Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.
                        Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis. Aenean aliquam molestie leo, vitae iaculis nisl. Delegadis gente finis, bibendum egestas augue arcu ut est. Mauris nec dolor in eros commodo tempor. Aenean aliquam molestie leo, vitae iaculis nisl. </p>
                        <p>Sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco.</p>
                    <form action="/action_page.php" id="comentario2">
                        <textarea class="tentando" rows="5" name="comentario2" form="comentario2">Deixe seu comentario</textarea>   
                    </form>
                    <button type="submit" class="btn btn-default">ENVIAR</button>
                </div>   
            </div>
        </div>

        <div class="footer">
          <p>midias sociais</p>
        </div> 
    </body>
</html>

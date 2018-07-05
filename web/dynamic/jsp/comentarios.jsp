<%-- 
    Document   : home
    Created on : 09/11/2017, 16:56:23
    Author     : fabriciogmc
--%>

<%@page import="api.modelo.Comentario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/estilos.css">
        <title>Aplicação Agenda Eletrônica</title>
    </head>
    <body>
        <% Comentario c = (Comentario)request.getAttribute("comentario"); %>
            
        <div class="conteudo">
            <p>id do comentario <%= c.getId()%></p>
            <p>Seu comentario é: <%= c.getComentario() %></p>
            <ul>
                <%--<% for(Papel p: u.getPapeis() ){ %> 
                
                <%} %>--%>
            </ul>
        </div>
    </body>
</html>

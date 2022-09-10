<%-- 
    Document   : procesaFormulario
    Created on : 19 ago. 2021, 19:13:00
    Author     : CARLOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesamiento de Formulario con JSP</title>
    </head>
    <body>
        <h1>Procesamiento de Formulario con JSP</h1>
        Usuario: <%= request.getParameter("usuario")%>
        <br/>
        Password: <%= request.getParameter("password")%>
        <br/>
        <a href="index.html">Regreso a inicio</a>               
    </body>
</html>

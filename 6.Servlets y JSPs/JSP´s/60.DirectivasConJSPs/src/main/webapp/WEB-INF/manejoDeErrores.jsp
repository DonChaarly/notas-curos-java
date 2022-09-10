<%--Con isErrorPage en true podemos usar el objeto implicito exception--%>
<%@page import="java.io.*"%>
<%@page isErrorPage="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <title>Manejo de errores</title>
    </head>
    <body>
        <h1>Manejo de errore</h1>
        <br/>
        Ocurrio una excepsion: <%= exception.getMessage()%>
        <br/>
        <textarea>
            <% exception.printStackTrace(new PrintWriter(out)); %>
        </textarea>
    </body>
</html>

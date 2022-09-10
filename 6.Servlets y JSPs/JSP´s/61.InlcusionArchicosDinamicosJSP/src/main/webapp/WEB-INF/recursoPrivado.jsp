<%--Se tiene que cachar el parametro que se lanzo desde la inclusion del archivo--%>
<%
    String colorFondo = request.getParameter("colorFondo");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Color Fondo</title>
    </head>
    <body bgcolor="<%=colorFondo%>">

        
    </body>
</html>

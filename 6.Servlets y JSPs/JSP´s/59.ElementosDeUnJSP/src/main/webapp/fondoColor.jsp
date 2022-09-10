<!DOCTYPE html>
<%--Se agrega un codigo java para asegurarnos que se ha escrito algo en el formulario --%>
<%
    String colorFondo = request.getParameter("colorFondo");
    if (colorFondo == null || colorFondo.trim().equals("")) {
        colorFondo = "white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Color defondo</title>
    </head>
    <body bgcolor="<%=colorFondo%>">
        <h1>Color de Fondo</h1>
        <br/>
        Color de fondo aplicado: <%=colorFondo%>
        <br/>
        <a href="index.html">Regreso al inicio</a>
        
    </body>
</html>

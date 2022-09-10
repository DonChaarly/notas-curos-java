<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inicio</title>
    </head>
    <body>
        <h1>Inicio</h1>
        <!--Se proporciona el nombre del poryecto con la variable implicita pageContext y el path del servlet controlador-->
        <a href="${pageContext.request.contextPath}/ServletControlador">listado de Alumnos</a>
    </body>
</html>

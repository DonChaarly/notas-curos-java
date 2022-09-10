<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Personas</title>
    </head>
    <body>
        
        <!--Se agrega una tabla para mostrar las personas-->
        <table border="1">
            <caption>Listado de Personas</caption>
            <tr>
                <th>Id Persona</th>
                <th>Nombre</th>
                <th>Apellido Paterno</th>
                <th>Apellido Materno</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            <!--Iteramos los elementos con ayuda de core-->
            <c:forEach var="persona" items="${personas}">
                <tr>
                    <th>${persona.idPersona}</th>
                    <th>${persona.nombre}</th>
                    <th>${persona.apellidoPaterno}</th>
                    <th>${persona.apellidoMaterno}</th>
                    <th>${persona.email}</th>
                    <th>${persona.telefono}</th>
                </tr>
            </c:forEach>
        </table> 
        
    </body>
</html>

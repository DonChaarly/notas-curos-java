<%-- 
    Document   : index
    Created on : 18 ago. 2021, 19:59:44
    Author     : CARLOS
--%>

<%--Las etiquetas se abren utilizando un pico parentesis--%>
<%--la directiva taglib nos permite agregar librerias--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--page indica una directiva con la cual podemos por ejemplo especificar el tipo de respuesta y el grupo de caracteresque se utilizaran--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola mundo JSP</title>
    </head>
    <body>
        <h1>Formas de agregar contenido Java desde un JSP</h1>
        <ul>
            <li><% out.print("Un Scriptlet nos permite introducir codigo java directamente");%></li>
            <li>${"Las expression language (EL) nos permiten imprimir informacion"}</li>
            <li><%="Una expresion escomo un scriptlet que utiliza implicitamente el objeto out para mandar a imprimir la informacion" %></li>
            <li><c:out value="Se puede imprimir informacion con la libreria JSTL colocando el prefijo que indicamos (c) seguido de : y el metodo out"/></li>
        </ul>
    </body>
</html>

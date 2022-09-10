<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Patron MVC</title>
    </head>
    <body>
        <h1>Patron de diseño MVC ej. 2</h1>
        <br/>
        <div style="color: red">
            <%--Dentro de un div se mostrara un mensaje sobre la accion que se realizo--%>
            ${mensaje}
        </div>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador">Link al servlet controlador sin parametros</a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=agregarVariabes">Link al servlet controlador para agregar variables</a>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletControlador?accion=listarVariables">Link al servlet controlador para listar las variables</a>
        <br/>
   
    </body>
</html>

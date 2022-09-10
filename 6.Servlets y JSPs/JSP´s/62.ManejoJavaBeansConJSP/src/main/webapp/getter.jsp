<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que muestra los valores del rectangulo</title>
    </head>
    <body>
        <h1>Valores del rectangulo</h1>
        <br/>
        <%--Se crea la variable bean, si ya se creo solo llama a la variable, si no la ha crado la crea--%>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"></jsp:useBean>
        <%--Con getProperty se llama a un atributo del bean en especifico--%>
        Valor de la base: <jsp:getProperty name="rectangulo" property="base"></jsp:getProperty>
        <br/>
        Valor de la altura: <jsp:getProperty name="rectangulo" property="altura"></jsp:getProperty>
        <br/>
        <%--Se puede llamar a un metodo de la clase bean siempre y cuando este tenga get o set en su definicion--%>
        Valor del area: <jsp:getProperty name="rectangulo" property="area"></jsp:getProperty>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>

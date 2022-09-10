<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP que modifica los valores del JavaBean</title>
    </head>
    <body>
        <h1>Ingresa los valores del rectangulo</h1>
        <%
            int base = 5;
            int altura =4;
        %>
        
        <%--Se hace uso de useBean para llamar al bean, con id vamos a crear la variable con la que llamaremos al bean, en class se coloca la ruta de la clase, y con scope se determina el alcance de la variable--%>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"></jsp:useBean>
        <%--Se modifican los atributos del bean con setProperty--%>
        <jsp:setProperty name="rectangulo" property="base" value="<%=base%>"></jsp:setProperty>
        <jsp:setProperty name="rectangulo" property="altura" value="<%=altura%>"></jsp:setProperty>
        <br/>
        Valor de la base: <jsp:getProperty name="rectangulo" property="base"></jsp:getProperty>
        <br/>
        Valor de la altura: <jsp:getProperty name="rectangulo" property="altura"></jsp:getProperty>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>

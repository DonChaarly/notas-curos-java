<%--Este va a ser la vista--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de Variables</title>
    </head>
    <body>
        <h1>Despliegue de Variables</h1>
        <br/>
        <%--El expression language buscara la variable en todos los alcances hasta encontrar una coincidencia con la llave--%>
        Variables en alcance request: ${mensaje}
        <br/>
        Variablesen alcance session: ${rectangulo}
        <br/><br/>
        Rectangulo:
        <br/>
        Altura: ${rectangulo.altura}
        <br/>
        Base: ${rectangulo.base}
        <br/>
        Area: ${rectangulo.area}
        <br/>
        <a href="${pageContext.request.contextPath}/index.jsp">Regeso al inicio</a>
        
        
    </body>
</html>

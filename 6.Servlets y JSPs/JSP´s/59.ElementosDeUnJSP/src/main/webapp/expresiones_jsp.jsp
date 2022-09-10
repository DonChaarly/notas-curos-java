<%-- 
    Document   : expresiones_jsp
    Created on : 19 ago. 2021, 19:11:59
    Author     : CARLOS
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de expresiones con JSP</title>
    </head>
    <body>
        <h1>Ejemplo de expresiones con JSP!</h1>
        <p>En los JSP se tiene principalmente codigo HTML en donde se puede incrustar codigo Java por medio de expresiones, scriptlets, etc</p>
        <br/>
        Concatenación: <%= "En las expresiones " + "tambien se pueden hacer concatenaciones " + "como lo hariamos en un println"%>
        <br/>
        Operaciones matematicas: <%= 2 * 3 / 2 %>
        <br/>
        Uso de variables implicitas como session para obtener el id de la sesion: <%= session.getId() %>
        <br/>
        <a href="index.html">Regreso al inicio</a>
    </body>
</html>

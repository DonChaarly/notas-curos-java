<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <h1>Ejemplo de scriptlets con JSP!</h1>
        <%--Dentro de los scriptlets se almacena codigo Java libremente--%>
        <%
            out.println("Ejemplo de un Scriptltet imprimiendo una cadena con el codigo out.print()");
        %>
        <br/>
        <%--Se puede hacer uso de las variables implicitas como request, getContextPath() nos regresa el nombre de la aplicacion--%>
        <%
            String aplicacion = request.getContextPath();
            out.println("La aplicacion es: " + aplicacion);
        %>
        <br/>
        <%--Codigo condicionado: funciona utilizando dos scriptlets, dentro del primero se utiliza un if que abre con una llave, si se cumple la condicion, se ejecuta el codigo html, en el segundo scriptlet debajo de la linea html se cierra la llave del if --%>
        <%
            if(session.isNew()){
        %>
        <br/>
        La sesion SI es nueva
        <%
            }else {
        %>
        <br/>
        La sesion NO es nueva
        <%
            }
        %>
        <br/>
        <a href="index.html">Regresar el inicio</a>
    </body>
</html>

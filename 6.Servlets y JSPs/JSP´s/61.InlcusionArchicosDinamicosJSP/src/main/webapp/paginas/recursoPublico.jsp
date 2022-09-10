<%--Dentro del archivo a incluir dinamicamente se pueden dejar las etiquetas basicas HTML pero es mejor quitarlas y colocar solo lo que se va a incluir--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Dinamica</title>
    </head>
    <body>
        Inclusion de contenido dinamico desde un JSP publico
        <br/>
        Nombre de la Aplicacion: <%=request.getContextPath()%>
    </body>
</html>

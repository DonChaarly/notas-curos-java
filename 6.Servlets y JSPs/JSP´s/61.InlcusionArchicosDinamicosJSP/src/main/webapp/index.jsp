<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inclusion Dinamica de Archivos</title>
    </head>
    <body>
        <h1>Inclusion Dinamica de Archivos</h1>
        <br/>
        <%--Para incluir dinamicamente archivos se ocupan las acciones que son las que empiezan por <jsp:--%>
        <jsp:include page="paginas/recursoPublico.jsp"></jsp:include>
        <br/>
        <%--Se pueden incluir parametros dentro de la llamada al archivo--%>
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo" value="yellow"></jsp:param>
        </jsp:include>
    </body>
</html>

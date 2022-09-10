<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Expression Languaje y Variables implicitas</title>
    </head>
    <body>
        <h1>Expression Languaje y Variables implicitas</h1>
        <ul>
            <li>Nombre de la aplicacion con pageContext: ${pageContext.request.contextPath}</li>
            <li>Navegador del cliente con header: ${header["User-agent"]}</li>
            <li>Id sesion con cookie: ${cookie.JSESSIONID.value}</li>
            <li>Web Server con pageContext: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor parametro: ${param.usuario}</li>
        </ul>
        <br/>
        <a href="index.jsp">Regreso al inicio</a>
    </body>
</html>

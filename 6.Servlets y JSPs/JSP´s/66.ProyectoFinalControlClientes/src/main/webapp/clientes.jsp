<!DOCTYPE html>
<html>
    <head>
        <%--Se incluyen los metas y el link para utilizar bootstrap--%>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <%-- Bootstrap CSS --%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">

        <%--Se incluye un link para usar las propiedades de font awasome--%>
        <script src="https://kit.fontawesome.com/faf11f1ad0.js" crossorigin="anonymous"></script>

        <title>Control de clientes</title>
    </head>
    <body>
        <%--Cabecero--%>
        <%--Para incluir el cabecero se utiliza una accion include--%>
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"></jsp:include>

        <%--Botones de navegacion--%>
        <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacion.jsp"></jsp:include>

        <%--Listado de clientes--%>
        <jsp:include page="/WEB-INF/paginas/cliente/listadoClientes.jsp"></jsp:include>

        <%--Pie de pagina--%>
        <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"></jsp:include>

        <%--Se incluye el scrip del bundle de boostrap para utilizar todos sus archivos--%>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
    </body>
</html>

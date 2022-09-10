<%--Dentro de este JSP se incluira el codigo del formulario para editar un cliente, este codigo tendra una estructura parecida a la de clientes.jsp--%>

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

        <title>Editar cliente</title>
    </head>
    <body>
        <%--Cabecero--%>
        <%--Para incluir el cabecero se utiliza una accion include--%>
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp"></jsp:include>

        <%--Despues del cabecero se incluye el formulario para editar el cliente--%>
        <form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}" method="POST" class="was-validated">
            <%--Botones de navegacion para la edicion, estos deben estar dentro del formulario por el boton que hace submit--%>
            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp"></jsp:include>

            <%--Se agrega una seccion del contenido del formulario--%>
            <section id="details">
                <div class="container">
                    <div class="row">
                        <div class="col">
                            <div class="card">
                                <div class="card-header">
                                    <h4>Editar cliente</h4>
                                </div>
                                <div class="card-body">
                                    <%--Podemos reutilizar el codigo del formulario de agregarCliente, agregando los valores del cliente que se va a modificar--%>
                                    <div class="form-group">
                                        <label for="nombre">Nombre</label>
                                        <input type="text" class="form-control" name="nombre" required value="${cliente.nombre}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="apellido">Apellido</label>
                                        <input type="text" class="form-control" name="apellido" required value="${cliente.apellido}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="email">Email</label>
                                        <input type="email" class="form-control" name="email" required value="${cliente.email}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="telefono">Telefono</label>
                                        <input type="tel" class="form-control" name="telefono" required value="${cliente.telefono}"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="saldo">Saldo</label>
                                        <input type="number" class="form-control" name="saldo" required step="any" value="${cliente.saldo}"}/>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>

        </form>

        <%--Pie de pagina--%>
        <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp"></jsp:include>

        <%--Se incluye el scrip del bundle de boostrap para utilizar todos sus archivos--%>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
    </body>
</html>



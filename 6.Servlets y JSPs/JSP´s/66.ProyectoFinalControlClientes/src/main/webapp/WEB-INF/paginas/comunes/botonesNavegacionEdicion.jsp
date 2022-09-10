<%--Dentro de este JSP se incluira el codigo de los botones de navegacionpara edicion de cliente el cual ahora puede reutilizarse en distintas paginas--%>

<%--Se crea una seccion en donde van a estar contenidos los botones de navegacion
    Se especifica con un id para recuperarlo, se agrega una clase donde entre otras cosas se agrega un margin botom o margen inferior de 4 (mb-4)--%>
<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <%--Agregamos un div que ocupe tres columnas para el boton de regreso--%>
            <div class="col-md-3">
                <%--Se agrega un link para regresar a la pagina principal--%>
                <a href="index.jsp" class="btn btn-light btn-blockn">
                    <%--Se agrega un icono de regreso--%>
                    <i class="fas fa-arrow-left"></i>Regresar al inicio
                </a>
            </div>
            <%--Agregamos un div qeue ocupe 3 columnas para el boton de guardar cliente, este boton para que haga el submit del formulario debe estar dentro de uno--%>
            <div class="col-md-3">
                <button type="submit" class="btn btn-success btn-block">
                    <i class="fas fa-check"></i>Guardar Cliente
                </button>
            </div>
            <%--Agregamos un div qeue ocupe 3 columnas para el boton de eliminar cliente, este boton sera realmente un link por lo que utilizara el metodo doGet--%>
            <div class="col-md-3">
                <a href="${pageContext.request.contextPath}/ServletControlador?accion=eliminar&idCliente=${cliente.idCliente}" class="btn btn-danger btn-block">
                <%--Agregamos el icono de basurero--%>
                <i class="fas fa-trash"></i> Eliminar Cliente
                </a>
            </div>
        </div>
    </div>
</section>

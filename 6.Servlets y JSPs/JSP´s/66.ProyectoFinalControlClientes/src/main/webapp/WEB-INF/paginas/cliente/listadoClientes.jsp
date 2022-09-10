<%--Dentro de este JSP se incluira el codigo del listado de los clientes--%>

<%--Dentrode este JSP es donde se van a llamar tanto a librerias de core como de formato ftm, ya no desde el jsp principal--%>
<%--Importmos la libreria de Core para utilizar sus funciones --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Importamos la libreria para dar formato--%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--Especificamos la localidad--%>
<fmt:setLocale value="es_MX"/>


<%--Creamos una seccion en donde contendremos la tabla del listado de clientes
    Se especifica un id para recuperar despues esta seccion--%>
<section id="clientes">
    <div class="container">
        <div class="row">
            <%--Se especifica que este renglon tendra un ancho de 9 columnas, las otras 3 de las 12 disponibles de bootstrap se destinaran a otras secciones--%>
            <div class="col-md-9">
                <%--Se crea otro div con la clase de card o tarjeta--%>
                <div class="card">
                    <%--Indicamos otro div para especificar el cabecero de la tarjeta--%>
                    <div class="card-header">
                        <%--Agregamos el titulo de listado de clientes--%>
                        <h4>Listado de clientes</h4>
                    </div>
                    <%--Se agrega una tabla con el estilo de table-striped para aplicar un estilo diferente a cada renglon--%>
                    <table class="table table-striped">
                        <%--Agregamos un table head con la clase thead-dark--%>
                        <thead class="table-dark">
                            <%--Agregamos un table row--%>
                            <tr>
                                <%--Agregamos las columnas que tendra la tabla--%>
                                <th>#</th>
                                <th>Nombre</th>
                                <th>Saldo</th>
                                <th></th>
                            </tr>
                        </thead>
                        <%--Dentro del table body vamos a iterar todos los clientes y agregar cada una de las columnas de los datos--%>
                        <tbody>
                            <c:forEach var="cliente" items="${clientes}" varStatus="status">
                                <tr>
                                    <%--Debido a que puede que el id este incorrecto por haber ejecutado ejemplos en la base de datos, utilizaremos el metodo count del estatus del forEach para mostrar el id--%>
                                    <td>${status.count}</td>
                                    <td>${cliente.nombre} ${cliente.apellido}</td>
                                    <%--Le damos un formato al saldo con la libreria de formato ftm--%>
                                    <td><fmt:formatNumber value="${cliente.saldo}" type="currency"/></td>
                                    <%--Agregamos un boton que sera realmente un link para mandar a llamar al ServletControlador, mandaremos una accion para editar el registro y el idCliente del cliente que queremos editar--%>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idCliente=${cliente.idCliente}" class="btn btn-secondary">
                                            <i class="fas fa-angle-double-right">Editar</i>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

            <%--Agregamos las tarjetas de saldo y clientes en lo que queda de las 12 columnas--%>
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Saldo total</h3>
                        <h4 class="display-4">
                            <%--Le damos un formato al saldo y lo recuperamos gracias al ServletControlador--%>
                            <fmt:formatNumber value="${saldoTotal}" type="currency"/>
                        </h4>
                    </div>
                </div>
                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Clientes</h3>
                        <h4 class="display-4">
                            <%--Mandamos a llamar al total de clientes gracias al ServletControlador y colocamos el icono de usuarios--%>
                            <i class="fas fa-users"></i> ${totalClientes}
                        </h4>
                    </div>

                </div>
            </div>

        </div>
    </div>
</section>
                       
<%--Agregamos el codigo para añadir un nuevo cliente al momento de presionar el boton Agregar Cliente el cual se encuentra en el JSP botonesNavegacion--%>
<jsp:include page="/WEB-INF/paginas/cliente/agregarCliente.jsp"></jsp:include>
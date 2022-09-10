<%--Dentro de este JSP se incluira el codigo de la ventana modal que contendra el formulario para agregar un nuevo cliente--%>

<%--Se crea un div en el que se especifica el id que corrsponde a agregarCliente y el cual llamamos en el JSP botonesNavegacion
    La clase modal fade especifica el efecto que se realizara--%>
<div class="modal fade" id="agregarClienteModal">
    <%--Se agrega la clase modal-dialog la cual siempre debe ser agregada y especifica que dentro del div estara el dialogo de la ventana y modal-lg especifica que la ventana modal ocupara el maximo de espacio--%>
    <div class="modal-dialog modal-lg">
        <%--Se agrega la clase modal-content para marcar el contenido de la ventana modal--%>
        <div class="modal-content">
            <%--Agregamos la clase de modal-header la cual especifica el cabecero del modal--%>
            <div class="modal-header bg-info text-white">
                <h5 class="modal-titel">Agregar Cliente</h5>
                <%--Se agrega un boton con la clase de close que nos servira para cerrar la ventana modal y se agrega un data-dismiss para especificar que se cerrara el modal, tambien se agrega un icono de una x--%>
                <button class="btn-close" data-bs-dismiss="modal"></button> 
            </div>
            <%--Agregamos el formulario y especificamos la accion con el ServletControlador, se le pasa el parametro de insertar y se agrega la clase was-validated para validar los campos--%>
            <form action="${pageContext.request.contextPath}/ServletControlador?accion=insertar" method="POST" class="was-validated" >
                <%--Colocamos la clasede modal body la cual se complementa con la de modal-header que marcamos arriba--%>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" name="nombre" required=""/>
                    </div>
                    <div class="form-group">
                        <label for="apellido">Apellido</label>
                        <input type="text" class="form-control" name="apellido" required/>
                    </div>
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" name="email" required/>
                    </div>
                    <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="tel" class="form-control" name="telefono" required/>
                    </div>
                    <div class="form-group">
                        <label for="saldo">Saldo</label>
                        <input type="number" class="form-control" name="saldo" required step="any"/>
                    </div>
                </div>
                <%--Se agrega tambien el modal-footer en donde se incluira el boton de submit del formulario--%>
                <div class="modal-footer">
                    <button type="submit" class="btn btn-primary">Guardar</button>
                </div>
            </form>
        </div>
    </div> 
</div>


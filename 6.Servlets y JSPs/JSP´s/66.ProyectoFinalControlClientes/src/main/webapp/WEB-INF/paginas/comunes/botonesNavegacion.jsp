<%--Dentro de este JSP se incluira el codigo de los botones de navegacion el cual ahora puede reutilizarse en distintas paginas--%>

<%--Se crea una seccion en donde van a estar contenidos los botones de navegacion
    Se especifica con un id para recuperarlo, se agrega una clase donde entre otras cosas se agrega un margin botom o margen inferior de 4 (mb-4)--%>
<section id="actions" class="py-4 mb-4 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <%--Se agrega un link con una clase modal el cual abrira un tipo pop-pop con el formulario para agregar un nuevo cliente--%>
                <%--El href hara referencia a la misma pagina (#) 
                    Se agrega una clase de boton con un boton principal (btn btn-primary) y especificamos que el boton se expanda a todo el ancho disponible para el boton (btn-block)
                    Con data-toggle especificamos que se abra un elemento modal (modal) y con data-target especificamos la accion que realizara la cual se configura aparte--%>
                <a href="#" class="btn btn-primary btn-block" data-bs-toggle="modal" data-bs-target="#agregarClienteModal">
                    <%--Agregamos un icono de + --%>
                    <i class="fas fa-plus"> Agregar Cliente</i>
                </a>
            </div>
        </div>
    </div>
</section>
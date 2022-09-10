<%--Dentro de este JSP se incluira el codigo del cabecero el cual ahora puede reutilizarse en distintas paginas--%>

<%--Dentro de este header se incluira el cabecero principal de la aplicacion
    Se utilizar una clase de bootstrap para especificar el padding (p) superior e inferior (y) con un size o ancho de 2, aplicamos un background info (bg-info) y un texto blanco (text-white)--%>
<header id='main-header' class="py-2 bg-info text-white" >
    <%--Se utiliza un primer div para aplicar la clase de ccontenedor (container) de botstrap--%>
    <div class='container'>
        <%--En este segundo div se especifica que se tendra un renglon (row)--%>
        <div class="row">
            <%--En este div se especifica que se tendra 6 columnas medianas (col-md-6)--%>
            <div class="col-md-6"> 
                <%--Tambien se agrega un icono de font awasome (fas) y se agrega el icono de un engrane (fa-cog) --%>
                <h1><i class="fas fa-cog"></i>Control de Clientes</h1>
            </div>
        </div>
    </div>
</header>

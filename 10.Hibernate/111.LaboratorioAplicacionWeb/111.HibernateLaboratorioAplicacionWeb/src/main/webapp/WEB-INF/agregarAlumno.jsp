<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Agregar alumno</title>
    </head>
    <body>
        <h1>Agregar alumno</h1>
        <!--Se agrega un formulario al cual de daremos un nombre por si despues agregamos validaciones o lo usamos en JavaScript
            Se especifica el el nombre del servlet que va a llamar 
            Y se especifica que se va a utilizar el metodo doPost-->
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
            Nombre: <input type="text" name="nombre"/>
            <br/>
            Apellido: <input type="text" name="apellido"/>
            <br/>
            <br/>
            Datos Domicilio: 
            <br/>
            Calle: <input type="text" name="calle"/>
            <br/>
            No. Calle: <input type="text" name="noCalle"/>
            <br/>
            Pais: <input type="text" name="pais"/>
            <br/><br/>
            Datos de contacto:
            <br/>
            Email: <input type="text" name="email"/>
            <br/>
            Telefono: <input type="text" name="telefono"/>
            <br/>
            <input type="submit" name="Agregar" value="Agregar"/>
        </form>
    </body>
</html>

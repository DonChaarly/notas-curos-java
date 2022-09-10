<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Modificar alumno</title>
    </head>
    <body>
        <h1>Agregar alumno</h1>
        <!--Se agrega un formulario al cual le daremos un nombre por si despues agregamos validaciones o lo usamos en JavaScript
            Se especifica el el nombre del servlet que va a llamar 
            Y se especifica que se va a utilizar el metodo doPost-->
        <form name="form2" action="${pageContext.request.contextPath}/ServletModificar" method="post">
            <!--Se colocan los valores que el servletModificar compartio en el alcance de request 
            en la variable de alumno, los objetos de contacto y domicilio se compartieron tambien gracias a la persistencia en cascada
            Tambien se coloca un valor hidden el cual no se va a ver pero lo utilizaremos para eliminar el registro-->
            <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
            
            Nombre: <input type="text" name="nombre" value="${alumno.nombre}"/>
            <br/>
            Apellido: <input type="text" name="apellido" value="${alumno.apellido}"/>
            <br/>
            <br/>
            Datos Domicilio: 
            <br/>
            Calle: <input type="text" name="calle" value="${alumno.domicilio.calle}"/>
            <br/>
            No. Calle: <input type="text" name="noCalle" value="${alumno.domicilio.noCalle}"/>
            <br/>
            Pais: <input type="text" name="pais" value="${alumno.domicilio.pais}"/>
            <br/><br/>
            Datos de contacto:
            <br/>
            Email: <input type="text" name="email" value="${alumno.contacto.email}"/>
            <br/>
            Telefono: <input type="text" name="telefono" value="${alumno.contacto.telefono}"/>
            <br/>
            <!--Agregamos un boton para modificar el registro con valor modificar el cual hara submit del formulario-->
            <input type="submit" name="Modificar" value="Modificar"/>
            <!--Agregamos un boton Eliminar par eliminar el registro con valor eliminar el cual tambien hara submit del formulario-->
            <input type="submit" name="Eliminar" value="Eliminar"/>
            
        </form>
    </body>
</html>

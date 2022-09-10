<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Se agrega el taglib de JSTDL de core para utilizar sus etiquetas-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de alumnos</title>
    </head>
    <body>
        Listar Alumnos
        <br/>
        <!--Agrgamos un link para mandar llamar el caso de agregar alumno-->
        <a href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a>
        <br/>
        <table border="1">
            <!--Agregamos los nombres de las columnas de de la tabla en el primer renglon-->
            <tr>
                <th>Alumno ID</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            <!--El segundo renglon se debe repetir tantas veces como valores tengamos en la tabla
                En var se coloca el nombre con el que vamos a llamar a la variable dentro del forEach
                El item es la lista que compartimos en alguno de los alcances en el servlet-->
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td>
                        <!--El valor de idAlumno sera un link que nos redireccionara al ServletModificar-->
                        <a href="${pageContext.request.contextPath}/ServletModificar?idAlumno=${alumno.idAlumno}">
                            ${alumno.idAlumno}
                        </a>
                    </td>
                    <td>${alumno.nombre} ${alumno.apellido}</td>
                    <td>${alumno.domicilio.calle} #${alumno.domicilio.noCalle}, ${alumno.domicilio.pais}</td>
                    <td>${alumno.contacto.email}</td>
                    <td>${alumno.contacto.telefono}</td>
                </tr>
            </c:forEach>
        </table>
        
    </body>
</html>

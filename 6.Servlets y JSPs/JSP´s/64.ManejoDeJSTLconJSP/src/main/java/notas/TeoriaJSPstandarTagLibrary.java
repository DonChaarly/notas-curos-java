package notas;

public class TeoriaJSPstandarTagLibrary {
    
    /*
    
                    JST (JSP Standar Tag Library)
    
    JST extiende los tag de los JSP´s, agregando principalmente las siguientes librerias:
        core: Permite leer y manipular datos, asi como iterar, agregar condiciones y otras funciones 
        basicas
        xml: permite la manipulacion y tranformacion de documentos XML
        SQLO: Permite ejecutar consultas a una base de datos, asi como crear conexiones a las mismas
        fmt: permite dar formato a las cadenas, apoyado de conceptos como Internacionalizacion (Locale)
    
            Configuracion de JSTL
    Agregar las siguientes librerias al Classphat (No es necesario si el servidor web como Glassfish ya 
    cuenta con estas librerias):
        standar.jar
        jstl.jar
    Configuracion de la directiva JSTL:
        JSP clasico:
            <%@taglib uri="java.sun.com/jstl/core" prefix="c" %>
            Esta uri se encuentra dentro de los archivos jar y dentro de ese archivo se encuentra el 
            nombre de prefijo que debemos utilizar al definir el acceso del JSTL
        Documento JSP (jspx)
            <html xmlns:c = "http://java.sun.com/jstl/core"
                  xmlns:c = "http://java.sun.com/JSP/Page"  >
    
            Libreria Core de JSTL
    Tags de Despligue de informacion:
        <c:out value="${persona.nombre}">
    Tags de creacion y manipulacion de variables:
        <c:set var="nombre" value="Carlos" scope="page" />
    Tags de elementos condicionales:
        <c:if test="${i>0} />
        <c:choose><c:when test="a">
    Tags de iteracion de elementos:
        <c:forEach var="persona" items="${personas}" >...
    Tags de importacion de recursos web:
        <c:import url="recursoExterno">
    Tags de redireccionamiento:
        <c:redirect url="${nuevaUrl}"/>
    Tags de manejo de parametros:
        <c:import url="c-import-param.jsp">
            <c:param name="nombre" value="${param.select}"/>
        </c:import>
    
    
    
    */
    
}

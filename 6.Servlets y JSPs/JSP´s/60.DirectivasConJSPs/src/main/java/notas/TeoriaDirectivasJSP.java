package notas;

public class TeoriaDirectivasJSP {
    
    /*
    Directivas en los JSP:
    
    Las directivas nos permiten controlar el comportamiento de un JSP   
    Con las directivas podemos especificar:
        Las clases Java que queremos importar
        El tipo MIME utilizado
        Indicar si el JSP puede acceder a la sesion Http
        El tamaño del buffer de salida
        Indicar la pagina JSP de error en caso de alguana excepcion
        El manejo de multihilos, entre otros
    
    Atributos en las directivas de un JSP
        Atributo import: nos permite indicar cuales son las clases que queremos importar dentro del JSP 
            <%@page import="paquete.Clase1, paquete,ClaseN"%>
        Atributo contentType: indica el tipo de respuesta que enviaremos al JSP
            <%@page contentType="text/html"%>
        Atrinuto session: indica si el JSP va a poder acceder al objeto session
            <%@page session="true"%>
        Atributo isELIgnore: si queremos desabilitar el manejo de expression language en el JSP
            <%@page isELIgnore="false"%>
        Atributo buffer: con este atributo podemos indicar el tamaño del buffer en klb del JSP,si este buffer se sobrepasa se hace un flush o vaciado de todo el flujo que hayamos agregado al PrintWriter 
            <%@page buffer="tamañoEnKB" %>
        Atributo errorPage: indicamos cual JSP va a manejar la excepsion en caso de que el JSP provoque un error
            <%@page errorPage="url relativo al JSP de error"%>
        Atributo isErrorJSP: este atributo lo tendran los JSP que manejaran los errores en caso de un excepsion
            <%@page isErrorPage="true"%>
        Atributo isThreadSfe: con este atributo indicamos que el JSP se considera seguro para ser accedido por multiples hilos
            <%@page isThreadSfafe="true"%>
        Atributo extends: este atributo nos permite heredar de una clase las caracteristicas de esta, esto no es muy usado
            <%@page extends="paquet.Clase1"%>
    
    
    */
    
}

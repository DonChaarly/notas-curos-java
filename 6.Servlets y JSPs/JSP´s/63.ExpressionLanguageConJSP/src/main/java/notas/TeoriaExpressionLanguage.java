package notas;

public class TeoriaExpressionLanguage {
    
    /*
                Expression Language (EL)
    "EL" nos permite simplificar el despliegue de informacion en un JSP utilizando JavaBeans
    
    Sintaxys con acciones JSP
        <jsp:useBean id="nombreBean" class="ClaseBean"/>
        <jsp:getProperty name="nombreBean" property="nombrePropiedad"/>
    Sintaxys con expression language:
        ${nombreBean.nombrePropiedad}
        ${nombreBean["nombrePropiedad"]}
    
            Caracteristicas de Expression Language
    Los objetos JavaBean a utilizar se deben agregar previamente en algun alcance (scope) 
    por medio del metodo setAttribute() en un Servlet
        page
        request
        session
        application
    La notacion es muy simplificada, pero solo permite la lectura de informacion (getters).
    No existe notacion para la modificacion de los atributos
    en un JavaBean (setters).
    
    Permite acceder a propiedades de un JavaBean de manera anidada
        Ej. ${alumno.direccion.calle}
    
            Mas caracteristicas de Expression Language
    Acceso a propiedades de un objeto de tipo Collection o Arreglos
        Ej.${listaPersonas[indice/llave]}
    Nota: No es posible iterar los elementos, para ello debemos usar JSTL
    
    Conversiones automaticas de tipos de datos al desplegar infromacion
    Manejo Automatico de valores null o vacios, convirtiendolos en cadenas vacias
    Conjunto de operadores:
    ${3+2-1}
    ${"x">"y"}
    
            Acceso a variables implicitas con expression language
    objeto oageContext: Ej.${pageContext.session.id}
    Valores de parametros con param y paramValues: Ej. ${param.nombre}
    Valores de cabeceros con header y headerValues: Ej. ${header.user-agent}
    Valores con el objeto cookie: ${cookie.nombreCookie.value}
    Valores de atributos en algun alcance con pageScoper, requestScope, sessionScope, aplicattionScope:
        Ej. ${requestScope.rectangulo.area} ó ${rectangulo.area}
    
    */
    
}

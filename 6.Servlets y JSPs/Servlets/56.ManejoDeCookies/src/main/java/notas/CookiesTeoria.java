package notas;


public class CookiesTeoria {
    
    /*
    Manejo de sesiones con Servlets
    
    Una sesion en una aplicacion web permite administrar varias peticiones de un mismo usuario
    La necesidad surge de que el protocolo HTTP es un protocolo sin etado, esto significa que 
    entre peticion y peticion no guarda ninguna informacion del usuario que realizo dicha peticion
    
    Las sesiones en los servlets se pueden manejar por medio de dos mecanismos:
        Cookies
        URLRewritting
    El API de los servlets abstrae estos conceptos en una clase llamada HTTPSession
    
    Concepto y Uso de Cookies
    Una cookie es un archivo que contiene informacion en forma de nombre valor, el cual se 
    almacena en el navegador web
    
    El objetivo de una cookie es almacenar informacion cada vez que accede a un mismo sitio web,
    como puede ser lenguaje preferido, colores preferidos y en general las preferencias del usuario
    
    Las cookies no se deben utilizar para almacenar informacion sensible como password, tarjetas de credito,
    etc., debido a que la infromacion que se almacena es texto plano sin ningun tipo de encriptacion
    
    API de las Cookies en los servlets:
    Una Cookie se puede leer en una peticion HTTP(Se itera el arreglo de coojies) y se puede escribir en
    una respuesta
    
    Creacion de un objeto cookie:
        Cookie cook = new Cookie("usuario", "Juan"); para crear un objeto cookie
        cook.getName(); para obtener el nombre
        cook.getValue(); para obtener el valor
    Metodo para obtener todas las cookies en una peticion HTTP:
        Cookie[] cookies = request.getCookies();
    Metodo para agregar una cookie en la respues:
        response.addCookie(cook);
    
    Metodos mas comunes en un objeto Cookie:
        getDomain();Para especificar el dominio de donde proviene una cookie
        setDomain();Para especificar el dominio donde se almacenara la cookie
        getMaxAge()/setMaxAge(); Especifica el tiempo a expirar (Segundos)
        getName(); Obtiene el nombre de la cookie
        getValue(); Obtiene el valor asociado al nombre de la cookie
        setValue(); Cambia el valor asociado al nombre de la cookie
    
    */
    
}

package notas;

public class RequestHeaders {
    
    /*
    *Request Headers o Cabeceros de peticion
    Permiten obtener metadatos de la peticion HTTP
    Se pueden obtener datos como:
        Los metodos Get, Post, etc.
        La IP del equipo que realizo la peticion(192.158.36)
        El dominio del equipo que realizo la peticion 
        El recursosolicitado
        El navegador que se utilizo para realizar esta peticion
    
    Metodos para procesar peticiones HTTP
        Metodos de la clase HttpServletRequest:
            getHeader() -> Permite procesar un cabecero a la vez
            getHeaders() -> Nos regresa todos los nombres de los cabeceros en una enumeracion de Java
            getHeadersName() -> Nos regresa todos los nombres relacionados con los cabeceros de la peticion http
    
        Metodos mas especializados:
            getCookies() -> Una cookie guarda ciertas preferenciasdel usuario
            getAuthType() y getRemoteUser() -> Sirven para procesar la seguridad en el API de los JSPs
            getContentLength() ->Largo de la peticion
            getContentType() -> Tipo de peticion
            getDateHeader() -> Peticiones que tienen que ver con fechas
            getIntHeader() ->Peticiones que tinen que ver con enteros

        Metodos con informacion relativa al contexto:
            getMethod() ->Nos dice por ejemplo que metodo se utilizo para realizar la peticion
            getRequestURI() -> Nos permite obtener la URI con la que se solicito el recurso web
            getQueryString() -> Nos regresa los parametros despues del signo ? de la peticion http
            getProtocol() ->Nos dice que protocolo se utilizo por ejemplo http o ftp
    
    
    
    
    */
    
}

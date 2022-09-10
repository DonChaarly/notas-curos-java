package notas;

public class CodigosDeEstadoTeoria {
    
    /*
    Codigos de estado HTTP
    Loscodigos de estado se utilizan para indicar el estado de la respuesta del
    servidor web hacia el cliente (navegador web)
    
    Metodo sque se utilizan para indicar el codigo de respuesta del servidor web 
    al cliente(navegador web)
        response.setEstatus(int codigo) -> indica por medio de un numero el codigp de estado del servidor
            se utilizan normalmente constantes, tales como SC_OK, SC_NOT_FOUND, etc en vez de los numeros
        response.sendError(int codigo, String mensaje) -> se envia aparte del codigo un mensaje
        response.sendRedirect(String url) -> Se utiliza para indicar una url con la cual se redirige al cliente.
            El codigo de estado asociado es el 302
    
    Codigos de estado http mas comunes 
        200(OK): La respuesta fue correcta, es el codigo de estdo por default
        204(sin contenido): El navegador continua desplegando el documento previo
        301(movido permanentemente): El documento solicitado ha cambiado de posicion y
            posiblemente se indica la nueva ruta, en este caso el navegador se redirecciona
            a la nueva pagina de manera automatica.
        302(Encontrador): El documento se ha movido temporalmente y el navegador se 
            mueve al nuevo url de manera automatica
        401(din autorizacion): No se tiene permiso de visualizar el contenido solicitado,
            debido a que se trato de acceder a un recurso protegido con contraseña sin la 
            autorizacion respectiva.
        404(No encontrado): El recurso solicitado no se encuentra alojado en el servidor Web
        500(Error interno del servidor web): El servidor web lanzo una excepcion irrecuperable 
            y por lo tanto no se puede seguir procesando la peticion.
    */
    
}

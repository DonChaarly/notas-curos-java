package notas;

public class TeoriaRESTWebServices {
    
    /*
    
                            REST Web Services 
    
    Los REST (Representational State Transfer) Web Services nacieron por la necesidad de simplificar la cracion de Web Services
    utilizando el protocolo http como base se basan clompletamente en las operaciones soportadas por el protocolo HTTP
    para ejecutar la funcionalidad del lado del servidor
    Cada llamada al servicio Web debe utilizar alguno de los metodos http
    
                Principios de la arquitectura REST
    
    Recursos Direccionales: Los recursos pueden ser solicitados por medio de un URI
    
    Orientado a representaciones: Clientes y servidores intercambian representaciones, la cual puede ser XML, JSON, entre otros
    
    Interfaces restringidas: Podemos utilizar las operaciones basicas HTTP: GET, POST, PUT, DELETE, esto es similar a SQL: SELECT, 
    INSERT, UPDATE y DELETE respectivamente
    
    
                Métodos HTTP
    
    GET: Se utilizan para operaciones de solo lectura. No generan ningun cambio en el servidor
    DELET: Elimina un recurso en especifico. Ejecurar esta opereacion multiples veces no tiene ningun efecto 
    POST: Cambia la informacion de un recurso en el servidor. Puede o no regresar informacion
    PUT: Almacena informacion de un recurso en particular. Ejecutar esta operacion multiples veces no tiene efecto
    ya que se esta almacenado la misma informacion sobre el recurso
    HEAD: Regresa solo el codigo de respuesta y cualquier cabecero HTTP con la respuesta
    OPTIONS: Representa las opciones disponibles para establecer la comunicacion en el proceso de peticion/respuesta de una URI
    
    METODOS SEGUROS: No modifican el estado del sistema - metodos GET y HEAD
    METODOS IDENPOTENTES: Siempre se obtiene el mismo resultado - metodos GET, HEAD, PUT y DELETE
    
    
    
                    Request Headers o Cabeceros de peticion
    
    Los cabeceros de peticion permiten obtener metadatos de la peticion HTTP, como puede ser: 
    
    El método HTTP utilizado en la peticion (GET, POST, etc)
    La IP del equipo que realizo la peticion (192.168.1.1)
    El dominio del equipo que realizo la peticion ( www.midominio.com)
    El recurso solicitado (http://midominio.com/recurso)
    El navegador que se utilizo en la peticion (Mozilla, MSIE, etc)
    Entre varios tipos
    
        Codigos de estado
    200: Ok respuesta correcta
    204: Sin contenido
    301: movido permanentemente, se puede indicar la nueva ruta
    302: Encontrado
    401: Sin autorizacion
    404: No encontrado
    500: Error interno del servidor web
    
                Cabeceros de respuesta y tipos MIME
    
    Los cabeceros de respuessta se utilizan para indicar como comportarse ante una respuesta de parte del mismo servidor web
    Un ejemplo comun es generar hojas de Excle, PDF, audio, video, etc
    Para indicar el tipo de respuesta se utiliza los tipos MIME (Multipurpose Internal Mail Extension)
    Los tipos MIME son un conjunto de especificaciones con el objetivo de intercambiar archivos de internet a travez del internet
    como puede ser texto, video, etc
    
    
                Descripcion de REST Web Service
    
    En REST Web Service se tiene en vez de un WSDL un documento conocido como WADL (Web Service Aplication Description Language)
    Ej. http://localhost:8080/sistema-sga/webservice/application.wadl
    Este documento permitedescribir de manera similar a un WSDL, sinembargo no se ha adoptado como un estandar
    Se puede crear el codigo del cliente de manera automatica, sin embargo no es muy utilizado por la simplicidad del codigo generado
    
    Documento XSD para validar el mensaje XML del servidor Web:
    Ej. http://localhost:8080/sistema-sga/webservice/application.wadl/xsd0.xsd
    En el documento WADL se especifica el documento XSD que valida el documento XML a transmitir
    
            
    
                Respresentaciones con REST
    
    REST utiliza el concepto de representaciones y cada representacion apunta a un recurso del lado del servidor java
    
    En el servidor se tienen distintos objetos los cuales se pueden recuperar eliminar modificar o cunsultar
    Para recuperar por ejemplo la persona 35 se hace un GET y con el siguiente URI se solicita:
    http://localhost:8080/sistema-sga/ws/personas/35
    
    
                Anotaciones de JAX-RS

    Al crear una clase que utilice JAX-RS o JAX-RESTFUL Web Services se colocan distintas anotaciones
    
    @Path("/personas"), @Path("{id}")
        Se coloca al inicio de la clase o en un metodo e indica que la clase o metodo se expondra como un servicio Web, ademas define la URI inical del servicio Web
    @GET, @POST, @PUT, @DELETE
        Se agregan a los metodos y representa el tipo de metodo HTTP que se va a utilizar
    @PathParam("id")
        Se utiliza para especificar parametros
    @Produces("application/xml")
        Indica el tipo MIME que se enviara al cliente y se debe especificar por cada metodo
    @Consumes("application/xml")
        Indica el tipo MIME que se puede aceptar
    
    
            Integracion de REST WS y una aplicacion Web
    
    Es necesario configurar el archivo web.xml para integrar JAX-RS con una aplicacion Web
    en el archivo web.xml se ven loc cambios hechos porque la neta me da hueva escribir el codigo aqui al chile alv me vale verga
    
            Integracion de EJB y JAX-RS
    
    En el EJB se colocan las anotaciones antes mencionadas de JAX-RS
    
    y en la clase de dominio se coloca la anotacion
    @XmlRootElement
    para definir que la clase se va a enviar y va a participar dentro de la comunicacion de los RESTful Web Services
    
    
   
    
    
    */
    
}

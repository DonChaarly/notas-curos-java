package notas;

public class TeoriaWebServiceConJAXWS {
    
    /*
    
                                ¿Que son los web service?
    
    Los web services son una tecnológia orientada a la intercomunicacion de sistemas
    
    Una aplicacion como un Java EE con la tecnologia de un web service puede ser consumida por alguna aplicacion creada en otros lenguajes
    todo esto sobre XML sobre el protocolo http utilizando internet o intranet de una empresa 
    
    JavaEE cuenta con dos apis principales para el desarrollo de Web services
        JAX-WS
        JAX-RS
    
                Caracteristicas de los Web services
    Interoperabilidad y portabilidad: 
        Se permite intercambiar informacion entre diferentes plataformas y lenguajes de programación
        Una de las formas de lograr esto es mediante el protocolo SOAP
    Reusabilidad:
        Se permite reutilizar mucha de la logica de negocio proveniente de sistemas legados o de sistemas empresariales actuales
        Los EJB se pueden exponer como servicios Web y así reutilizar la logica de negocio
    Disponibilidad
        Su objetivo es estar disponible en cualquier momento y cualquier lugar para cualquier sistema o persona
    
    
    
            Arquitectura de Web Services 
    
    Capa de cliente
        Puede estar desarrollada en cualquier lenguaje de programación o ser otro tipo de clietnes
            Clientese de escritorio
            Clientes Web/ Moviles
            Clientes Web services (B2B)
    Capa de negocio
        Expone servicios Web utilizando SOAP o XML
    Capa de datos
        Se utiliza la base de datos para obtener la información del sistema empresarial (unmarshalling)
    
            Stack de protocolos del servicio Web
    
    Descubrimiento de los Web Services: Descobery - utilizando - UDDI
    Obtener la informacion de la ubicacion del Web Service: Description - utilizando - WSDL
    Envio de mensajes : Messaging - utilizando - XML y SOAP
    En la capa de transporte: Transport - utilizando - HTTP
    
    
    
                Tipos de Web Services
    
    En Java EE, JAX-WS y JAX-RS son los estandares para crear Web Services
    
    JAX-WS (Java API for XML Web Services) es un API que permite abordar requerimientos empresariales 
    más ccomplejos al momento de crear Web Services.
    También se conoce como SOAP Web Service
    Lleva mas años en el mercado y brinda soporte para los protocolos que son estandar en la industria del software al crear web services
    Estos estandares proveen una manera muy robusta para agregar seguridad, interoperabilidad, transaccionalidad, etc.
    
    JAX-RS (Java API for RESTful Web Services) es un API mas simple de utilizar y de implementar al 
    momento de crear Web Services.
    También se conoce como Restful Web Services
    Esta restringido por el estilo REST el cual utiliza el codigo HTTP y sus metodo basicos para establecer las operaciones basicas del servicio Web
    
    Se recomienda utilizar JAX-WS al momento de implementar sistemas empresariales
    Se recomienda utilizar JAX-RS para exponer funcionalidad a la aplicacion Web o móviles, por ejemplo
    un cliente IPhone o Android
    
    
                SOAP Web Services
    
    Un Web Service se publica en un tipo de directorio conocido como UDDI (Universal Description Descobery and Integration) 
    el cual tiene como objetivo publicar y permitir el acceso a los WebServices a traves de mensajes SOAP (Simple Object Acces Protocol) 
    el cual define la forma en que se intercambian datos de tipo XML, Se crea un documento WSDL (Web Services Description Languaje)
    Una vez que sabemos la ubicacion del Web Service a travez del WSDL podemos enviar la peticion SOAP y asi ejecutar el metodo expuesto 
    del Web Service. En este procedimieto el XML de peticion y respuesta suele validarse utilizando un XSD de XML
    
    Asi que por medio del URL del servicio Web del WSDL el cliente puede acceder al Web service y hacer una llamada SOAP sobre el protocolo 
    HTTP utilizando internet o la intranet de la empresa
    En este intercambio de informacion se realiza un intercambio de informacion via XML
    En este intercambio se utiliza el API de JAXB que convierte la informacion de XML a objetos (marshalling) y de objetos a XML 
    
    
                    WSDL - Web Services Description Language
    
    WSDL es un lenguaje basado en XML el cual provee la descripcion de un servicio web bastante detallada con la cual es posible 
    generar el codigo del cliente como el servicio web asociado el cual manejará de forma automática la conversión de codigo Java a XML 
    (Marshalling) y vicebersa (unmarshalling)
    
        Estructura general de un WSDL
    Types: Contenedor para definir tipos utilizando esquemas XML (XML schema)
    Message: Define los tipos de mensajes que el servicio web soporta, los cuales pueden estar compuestos de una o mas partes inputo o output
    PortType: Define un grupo de operaciones Interface de Web Service 
    binding: Relaciona el portype con el protocolo a utilzar 
    Service: Relacion la seccion de binfing como servicios y define un endPoint
    
    
                XML y Scheme XSD
    
    Para validar un documento XML lo cual se necesita al momomento de transmitir un mensaje a través de un Web service
    La validacion permite automatizar los mensajes entre el cliente y el servidor sin necesidad de intervencion humana.
    Formas de validar un documento XML
        DTD (Document Type Definition): no se utiliza muchos, el lenguaje no es XML  y tiene varias limitantes
        XSD - scheme xml: Permite agregar mucha más precision al momento de validar elementos y atributos complejos de un XML, Utiliza el mismo lenguaje XML

            Dentro de la validación de los elementos se tiene:
    Elmentos de tipo simple (simple type)
            Derivados ( User-derived) 
                Atomic
                Non-atomic
            Incluidos dentro de las validaciones (Built-in)
                Primitivos (Primitive)
                Derivados (Derived)
    Elementos de tipo complejos (Complex type)
            Vacio (Empty)
            Contenido simple (Simple content)
            Contenido complejo (Complex content)
                Secuencia (Sequence)
                Todos (All)
                Por opcion (Choice)
    
    
    
                JAXB - Java Arquitecture for XML Banding
    
    Al trabajar con Web Services es necesario pasar mensajes XML a objetos Java y vicebersa
    El API de JAXB es el estandar en Java EE
    
    Sus principales caracteristicas es convertir un objeto java en un documento XML o vicebersa
    JAXB permite acceder y procesar documentos XML sin necesidad de conocer XML a profundidad
    
    JAXB asocia el esquema XSD del documento XML a procesar (Bainding)
    Posteriormente genera las clases java que representan el documento XML 
    Despues de generado el codigo se puede acceder y desplegar los datos del documento XML asociado 
    utilizando las clases y objetos del codigo java generado
    
    
                Estrategia generacion de Web Service
    
    Al crear un servicio web hay dos artefactos que deben considerarse, el documendo WSDL y las clases que implentan el servicio web
    ademas el documento XSD o scheme XML asociado al mensaje XML a interacturar con el servicio web 
    
    Al generar un web service se pueden tomar dos caminos diferentes
    
        Partiendo del codigo Java se genera el WSDL del servicio web
            Se delega la generacion del servicio web al API de JAX-WS lo que genera de fomra automatica el domumento WSDL y el archivo XSD asociado al mensaje XML a intercambiar
        Partiendo del WSDL y se genera el cliente java 
            
        Se puede tener el codigo java y el WSDL y no se tiene que generar ningun artefacto
    
    
    
    
    */
    
}


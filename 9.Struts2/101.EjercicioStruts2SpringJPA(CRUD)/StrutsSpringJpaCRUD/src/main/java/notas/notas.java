package notas;

public class notas {
    
    /*
                Pasos que se siguieron
    
    Se agregan las librerias de struts, spring, jpa que se necesitan para el prgrama en el pom.xml
    Se modifico el persistence.xml el cual es el que nos permite configurar la tecnologia de JPA(Java Pesistence API), el cual nos va a permitir conectarnos a la base de datos
    Se creo el archivo applicationContext.xml, este archivo permite configurar el framework de Spring
    Se modifica el archivo web.xml, el cual nos permite unir una aplicacion web con el framewoek de struts, al configurar el filtro de struts
        Tambien nos permite integrar el framework de Spring por meio de la configuracion del listener
        Tambien nos permite configurar el nombre JNDI para la conexion a la base de datos que se utilizara con JPA via JTA
    Se crea una clase java de entidad llamada Persona que nos permitira represeantar un registro de la tabla persona de la base de datos
    Se crea una interface java, esto para poder separar las capas de la aplicacion, la interface aplicacara el patron de diseño DAO (Data Acces Object)
    Se crea una clase java PersonaDaoImpl que implementara la interface PersonaDao (La clase utilizara la tecnologia de Spring y JPA para realizar las operaciones sobre la base de datos y comunicarse con esta)
    Se crea una inerface java llamada PesonaService 
    Se crea una clase java PersonaServiceImpl que implementa la interface anterior (La clase implementa la tecnología de spring para manejar de manera automatica el concepto de transacciones)
    Se crea una clase PersonaAction.java la cual va a hacer las funciones de controlador y modelo, esta clase estara dentro de una carpeta que termine en actions, action, etc
        Esta clase soportara todos los cambios en la vista
        Se aplicaran las funciones CRUD (Create, Read, Update, Delete)
        Se implementaran distintos metodos exectue debido a que la clase debido a que la clase sera la encargada de procesar diferentes acciones
    Se crea un archivo de propiedades en donde se van a almacenar los mensajes que vamos a mostrar
        Este archivo tendra que estar ubicado en other sources pero con la misma ruta  el mismo nombre que nuestra clase action
    Se modifica el index el cual contendra el path de listar, el cual reconocera nuestra clase action y ejecutara el metodo execute correspondiente
    Creamos el archivo JSP de personas.jsp
        Para seguir con las convenciones de struts se deposita en la carpeta de content
    Se crea el archivo JSP de persona.jspa
        este archivo se crea para mostrar el detalle de un objeto de tipo persona
    Se agrega el archivo de log4j
    
    
    
    */
    
}
    
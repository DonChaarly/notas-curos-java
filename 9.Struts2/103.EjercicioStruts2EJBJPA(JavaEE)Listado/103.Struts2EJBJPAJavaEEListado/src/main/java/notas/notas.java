package notas;

public class notas {
    
    /*
                Pasos que se siguieron
    
    Se agregan las librerias necesarias en el archivo pom.xml
    Se modifico el persistence.xml el cual es el que nos permite configurar la tecnologia de JPA(Java Pesistence API), el cual nos va a permitir conectarnos a la base de datos
    Se modifica el archivo web.xml, el cual nos permite unir una aplicacion web con el framewoek de struts, al configurar el filtro de struts
    Se crea una clase java de entidad llamada Persona que nos permitira represeantar un registro de la tabla persona de la base de datos
    Se crea una interface java, esto para poder separar las capas de la aplicacion, la interface aplicacara el patron de diseño DAO (Data Acces Object)
    Se crea una clase java PersonaDaoImpl que implementara la interface PersonaDao (La clase utilizara la tecnologia de EJB y JPA para realizar las operaciones de base de datos y obtener la conexion a la base de datos y la clase persona)
    Se crea una inerface java llamada PesonaService 
    Se crea una clase java PersonaServiceImpl que implementa la interface anterior (La clase implementa la tecnología de EJB para manejar de manera automatica el concepto de transacciones)
    Se crea una clase MostrarPersonaAction.java la cual va a hacer las funciones de controlador y modelo, esta clase estara dentro de una carpeta que termine en actions, action, etc
    Se crea un archivo de propiedades en donde se van a almacenar los mensajes que vamos a mostrar
        Este archivo tendra que estar ubicado en other sources pero con la misma ruta  el mismo nombre que nuestra clase action
    Se modifica el index el cual contendra el path de mostrar-persona, con este path se ejecutara el execute que esta en la clase de MostrarPersonaAction
    Se crea el jsp mostrar-persona.jsp, el nombre debe corresponder al path que se utlizara para llamar la accion correspondiente
        Para seguir con las convenciones de struts se deposita en la carpeta de content
    Se agrega el archivo de log4j
    
   
    
     

   

    
    
    
    */
    
}
    
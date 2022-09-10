package notas;

public class notas {
    
    /*
    
    Pasos que se siguieron
    
    Se agregan las librerias que se necesitan para el prgrama en el pom.xml
    Se modifico el persistence.xml el cual es el que nos permite configurar la tecnologia de JPA(Java Pesistence API), el cual nos va a permitir conectarnos a la base de datos
    Se creo el archivo applicationContext.xml, este archivo permite configurar el framework de Spring
    Se modifica el archivo web.xml, el cual nos permite unir una aplicacion web con el framewoek de struts, al configurar el filtro de struts
        Tambien nos permite integrar el framework de Spring por meio de la configuracion del listener
        Tambien nos permite configurar el nombre JNDI para la conexion a la base de datos que se utilizara con JPA via JTA
        Normalemnet se utiliza la utlima version del namespace de JavaEE, pero por problemas  de contabilidad con Spring, se utiliza la version 3.1
    Se crea una clase java de entidad llamada Persona que nos permitira represeantar un registro de la tabla persona de la base de datos
    Se crea una interface java, esto para poder separar las capas de la aplicacion, la interface aplicacara el patron de diseño DAO (Data Acces Object)
    Se crea una clase java PersonaDaoImpl que implementara la interface PersonaDao (La clase utilizara la tecnologia de Spring y JPA para realizar las operaciones sobre la base de datos y comunicarse con esta)
    Se crea una inerface java llamada PesonaService 
    Se crea una clase java PersonaServiceImpl que implementa la interface anterior (La clase implementa la tecnología de spring para manejar de manera automatica el concepto de transacciones)
    Se crea una clase llamada MostrarPersonaAction.java el cual va a realizar la funcion de Controlador (Action) y Modelo (Bean)
        Esta clase estara dentro de una carpeta que termine en struts, struts2, action, actions
        Y el nombre de la clase tendra que terminar con la palabra Action
    Se crea un archivo de propiedades llamado MostrarPersonaAction.properties el cual contiene los mensajes que se utilizaran en los JSP
    Se modifica el archivo de index donde se indicara el path que se va a ejecutar
    Se crea el JSP llamado mostrar-persona.jsp, el nombre debe corresponder con el path que se indico en el index
    Se crea el archivo log4j.xml el cual nos permite manejar el log o bitacora de una aplicacion java de manera mas simple
    
    
    
    
    
    
    */
    
}

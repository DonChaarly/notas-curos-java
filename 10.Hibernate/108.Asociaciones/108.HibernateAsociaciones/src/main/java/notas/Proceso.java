package notas;


public class Proceso {
    
    /*
                    Pasos que se siguieron en este archivo
    
    
    Se crearon las bases de datos en MySql
        Se empezo por las tabalas que no tienen ninguna dependencia: la tabla de domicilio, contacto y la de curso
        Despues las que si tienen dependencias: alumno y asignacion
        Se relacionaron las llaves de los atributos de las tablas como son el id_domicilio entre la tabla de alumno y la de domicilio
            Esto se configuro en la tabla de alumno en la parte de foreing keys
        Como curiosidad se generaron las tablas de relacion en MySql utilizando ingeneria inversa
            Se selecciono home, Database, Reverse Engineer, y se dio next y selecciono la base que se queria
    Se agregaron las librerias al pom.xml
    se agrego el archivo log4j.xml
    Se modifico el archivo de persistence.xml
    Se agrego la clase de domicilio, haciendo a esta clase una entidad
    Se agrego la clase de contacto, haciendo a esta clase una entidad
    Se agrego la clase de curso, haciendo a esta clase una entidad
        Esta clase se relaciona con la clase de asignacion en una relacion de uno a muchos
    Se agrego la clase de Alumno, Esta clase esta relacionada con la clase de asignacion y la clase de contcto y domicilio
        Esta clase se relaciona con la clase de asignacion en una relacion de uno a muchos
    Se agrego la clase de Asignacion, esta clase tambien se relaciona con las clases de alumno y curso en una relacion de muchos a uno
    Se agrego la clase abstracta GenericDAO la cual nos utilizaremos como base para crear las demas clases dao
        Esta sera abstracta para que nos se puedan crear objetos de esta clase
    Se agrego la clase DomicilioDao
    Se agregaro las demas clases dao copiando la clases de DomicilioDao y sustituyendo los valores necesarios ayudandonos del comando ctrl+h con el cual rempalazamos todas las palabras de una
    Se creo una clase de prueba para probar las clases dao
    
    */
}

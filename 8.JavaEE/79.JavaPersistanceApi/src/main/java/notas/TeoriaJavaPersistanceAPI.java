package notas;

public class TeoriaJavaPersistanceAPI {
    
    /*
                    ¿Que es Java Persistance API (JPA)?
    
    Java persistance API, mejor conocido como JPA, es el estándar de persistencia de Java
    JPA implenta conceptos de frameworks ORG (Object Relational Maping)
    
    
    En una relacion de objeto-Mapeo tenemos por un lado la base de datos y por otro el codigo Java
    
    Base de Datos: Se tiene el esquema entidad relacion
    Codigo Java: Se tiene el Mapeo de clases
    
    Al utilizar solamente JDBC se tiene el problema que se necesita mucho codigo 
    solamente para ejecutar una consulta, por lo tanto para simplificar el proceso de
    interaccion con una base de datos, se utiliza el concepto de framworks ORM
    
    Un framwork ORM nos permite mapear un codigo Java con una tabla de base de datos
    
    
                    Caracteristicas de JPA
    
    JPA permite abstraer la comunicacion con la base de datos y crea un estandar para ejecutar consultas
    y mainpular la informacion de un base de datos
    
    Caracteristicas:
    
    Persistencia utilizando POJOS: Cualquier clase de Java podemos convertirla en una clase de entidad,
    simplemente agregando anotaciones y/o agregando un archivo XML de mapeo
    
    No intrusivo: Las clases Java de entidad no requieren extender ninguna funcionalidad ni saber de la existencia de JPA
    
    Consultas utilizando objetos Java:  JPA permite ejecutal querys expresados en terminos de objetos Java y sus relaciones 
    sin necesidad de utilizar el lenguaje SQL
    
    Configuracion simple: Muchas de las opciones de JPA estan configuradas con opciones por default pero pueden personalizarse facilmente
    
    Integracion: JPA permite realizar la integracion con las demas capas de manera muy simple
    
    Testing: Es posible realizar pruebas unitarias o ejecutar cualquier clase con un metodo main fuera del servidor
    
    
                    Arquitectura empresarial con JPA
    
    La tecnologia de JPA aplica directamente en la capa de datos la cual se encarga de recuperar, modificar, eliminar, actualizar los datos de 
    de la base de datos, de la apliacion empresarial y ejecuta protocolos como DAO Y DTO
    
                    Clase de entidad
    
    Una clase de entidad es un POJO y puede configurarse por medio de anotaciones o un archivo XML
    
    Ejemplo de clase de entidad con anotaciones:
    
    @Entity //Se coloca la anotacion de entidad para especificar que se trata de una clase de entidad de JPA
    public class Persona {
        
         @Id //Se coloca la anotacion de Id para indicar que es una llave primaria
         @GeneratedValue  //Se indica la forma en que se va a generar el valor
         private Long personaId;
    
         @Column (nullable = false) //Se indica que el atributo no puede ser null
         private String nombre;
         
         //Si el nombre de los atributos es el mismo que en la tabla de base de datos, no es necesario colocar mas anotaciones
         private String apePaterno;
         private String apeMaterno;
         private String email;
         private String telefono,
    
         // Constructor, getters, setters
    
    }
    
    */
    
}

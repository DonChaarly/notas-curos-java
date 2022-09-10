package notas;

public class TeoriaAsociacionesEnJPA {
    
    /*
    
                            RELACIONES EN JPA
    
    Tipos de relaciones:
    Uno a uno: @OneToOne
    Uno a muchos: @OneToMany
    Muchos a uno: @ManyToOne
    Muchos a muchos: @ManyToMany
    
    JPA soporta las relaciones en los archivos de mapeo de cada clase de entidad
    o en las clases java utilizando anotaciones
    
            Direccionalidad en las relaciones:
    Unidireccional: Se define el atributo de relación solo en una clase 
    Bidirecciona: Se define los atributos de relacion en ambas clases
    
            Ejemplo de relacionn 1 a 1
    1 alumno tiene un domicilio
    Se puede tener una relacion unidireccional o bidireccional
    para ser unidereccional se especifica la relacion en una sola clase, como la de alumno nadamas por ejemplo
    
    En la clase entidad alumno se agrega la anotacion @OneToOne
    Se especifica la columna en la que se tiene la relacion, por ejemplo id_domicilio
    Y se define el atributo privado domicilio
    
    Para ser bidireccional se especifica la relacion tambien en la clase de domicilio y se agrega lo anterior
    
            Ejemplo de relacion 1 a muchos
    1 instructor imparte muchos cursos
    
    Para ser bidireccional se agregan las relaciones en ambas entidades
    
    En la clase entidad instructor se agrega la anotacion @OneToMany
    Se especifica como sera mapeada la relacion
    Y se define el atributo privado set de cursos
    
    En la clase entidad curso se agrega la anotacion @ManyToOne
    Se especifica la columna en la que se tiene la relacion, por ejemplo id_instructor
    Y se define el atributo privado instructor
    
            Ejemplo de relacion muchos a muchos
    
    1 alumno tiene muchos cursos y un curso tiene alumnos
    Cuando se tiene este tipo de relacion es mejor aplicar el concepto de normalizacion de base de 
    datos para simplificar este tipo de relaciones y en lugar de tener relaciones de muchos a muchos
    tengamos relaciones de uno a muchos
    Si no se normaliza este tipo de relaciones se puede caer en referencias circulares debido a que 
    un alummo puede tener un curso pero un curso puede tener al mismo alumno    
    
    
            Ejemplo de relacion muchos a muchos normalizada
    Un alumno tiene muchos cursos y un curso tiene muchos alumnos
    Para normalizar esta relacion se crea una entidad intermedia llamada asignacion, tambien se le 
    conoce a esta entidad como tabla transitiva y lo que se hace es convertir la relacion de muchos a 
    muchos en uno a muchos de alumno a asignacion y de curso a signacion 
    Las llaves foraneas de id_alumno y id_curso se convierten en llaves foraneas en la tabla de asignacion  
    y al convinarlas se conviete en una llave primaria compuesta para la tabla se asignacion 
    
    
                    Fetching se relaciones
    Con JPA podemos especificar el comportamiento de las relaciones de objetos relacionadas a nuestras clases entidad
    Existen dos tipos:
    Lazy loading: Carga retardada
        la coleccion definida en la clase de entidad definida no va a ser recuperada de manera inmediata    
        De esta forma evitamos utilizaar demasiados querys por cuestiones de las colecciones de objetos asociadas
        Es el tipo de comportamiento por default en las relaciones onToMany y manyToMany

    Eager loading: Carga inmediata
        Las colecciones asociadas a las clases de entidad son recuperadas junto con el objeto de entidad 
        esto realiza mas consultas 
        Este tipo no es el comportamiento por default asi que hay que especificarlo explicitamente
    
                    Guardado en cascada 
    En JPA se tiene la posibilidad de persistir un objeto de entidad junto con sus relaciones
    
    Por defautl si se persiste un objeto, no se guardara el objeto relacionado 
    Si de indica en el mapeo de las relaciones que se guarde la informacion de la entidad asociada 
    utilizando la anotacion de persistencia en cascada entonces si se guardara la informacion asociada 
    
    La anotacion es: @ManyToOne (cascade={CascadeType.ALL})
    
    */
    
}

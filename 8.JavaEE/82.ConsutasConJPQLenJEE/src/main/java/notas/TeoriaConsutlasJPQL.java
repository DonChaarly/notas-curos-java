package notas;

public class TeoriaConsutlasJPQL {
    
    /*
    
                            JAVA PERSISTENCE QUERY LANGUAGE (JPQL)
    
    Lenguaje de Consulta, similar a SQL pero recuperando objetos java, permite 
    recuperar objetos de fiferentes maneras tanto utilizando una sintaxis similar 
    a SQL, pero tambien utilizando codigo java, conocido como API de criteria y query 
    by example

    Permite ejecutar queries parametrizables
    Consola de Ejecucion en IDE´s como Netbeans, Eclipse, Intellij Idea o MyEclipse
    Consutlas avanzadas con recuperacion de colecciones de datos
    
    
            Caracteristicas de JPQL:
    Uso de select, from y where y subselects
    Sensiblle a Mayúsculas y minusculas
    Asociaciones, uso de joins y fetch
    Uso de expresiones y operadores como: + , > , between , upper, etc.
    Uso de funciones de agregacion , tales como: avg, sum, count, etc.
    Uso de order by y group by      
    
    
                EJEMPLOS DE QUERIES JPQL
    Consulta de todas las personas: 
        select p from Persona p
    Consulta de personas con id=1
        select p from Persona p where p.idPersona = 1
    Consulta de persona por nombre
        select p from Persona p where p.nombre = 'Juan'
    Consulta de datos individuales, se crea un arreglo (tupla) de tipo object de 3 columnas:
        select p.nombre as Nombre, p.apePaterno as Paterno, p.apeMaterno as Materno from Persona p
    Obtiene el objeto persona y el id, se crea un arreglo de tipo object con 2 columnas:
        select p, p.idPersona from Persona p
    Obtiene la lista de personas, utilizando el constructor de idPersona
        select new mx.com.gm.sga.domain.Persona(p.idPersona) from Persona p
    Regresa el valor minimo y máximo del idPersona (Scalar Results)
        select min(p.idPersona) as MinId, max(p.idPersona) as MaxId, count(p.idPersona) as Contador from Persona p
    Extraer los nombres de personas que son distintos:
        select count(distintic p.nombre) from Persona p
    Concatenar y convierte en mayusculas el nombre y apellido
        select CONCAT (p.nombre, ' ', p.apePaterno) as Nombre FROM Persona p
    Obtiene el objeto persona con id igual a parámetro 
        select p from Persona p where p.idPersona = :id
        
    
    
    */
    
}


package notas;

public class Notas {
        
    /*
        Las transacciones son un conjunto de instrucciones SQL (SELEC, INSERT, etc)
    si alguna de las instrucciones falla se puede dar marcha atras usando RoleBack,
    si todo es correcto se guardan los cambios haciendo commit de todo el bloque ejecutado
    si cerramos la conexion de JDBC se hace un commit, incluso si se deshabilito la propiedad autocommit
    osea que los cambios realizados se guardaran en la base de datos
    
    Los metodos que se utilizan en las transacciones son:
    *autocommit (regresa un valor true o false, es true por default)//se recomienda inicializarlo en false
    *commit (guarda los cambios en la base de datos del bloque de ejecucion
    *rollback ( Revierte los cambios realizados por el bloque de ejecucion)
    
        
    */
    
}

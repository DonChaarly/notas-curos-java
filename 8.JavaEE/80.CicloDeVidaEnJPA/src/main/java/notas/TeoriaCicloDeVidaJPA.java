package notas;

public class TeoriaCicloDeVidaJPA {
    
    /*
    
                CICLO DE VIDA DE UN JPA
    
    Estados de un JPA:
    Estado transitivo: Al crear un objeto, este pasa al estado transitivo (Transient)
    
        Se puede regresar del estado persistido al transitivo haciendo rollback
    Estado persistido: Al llamar el metodo persist, se pasa al estado persistido (Managed), 
        el objeto se le asocia un registro de la base de datos y el estado de este objeto estará 
        asociado a una transaccion la cual se sincroniza con la base de datos
    
        Tambien se puede regresar del estado de detached al de persistido utilizando el metodo merge
        Se puede regresar del estado eliminado al persistido haciendo rolleback
        Si se ejecuta el metodo refresh nos quedamo en el estado de persistido
    Estado separado: Al hacer commit o rollback. se pasa al estado separado (Detached),
        el objeto tiene asociado un registro de base de datos pero el estado no esta sicronizado con la base
    Estado eliminado: Si se utiliza el metodo remove, se pasa al estado eliminado(Removed),
        los objetos ya no tienen representacion en la base de datos, y al terminar la transaccion el registro asociado es eliminado
    
    
                    Persistir un objeto en JPA
    
    Para persistir un objeto:
    1. Crea nuevo objeto entidad (estado transitivo)
    2. Inicia transaccion   
    Dentro de un contexto persistente
    3. Se ejecuta el SQL por medio del metodo persist()
        Se pasa al estado de persistente
    4. commit/rollback si se llama al metodo flush()
        Se cierra la transaccion
    5. Termina la transaccion
        Se pasa al estado detached
    
    
                Recuperar un objeto de entidad en JPA
    
    1. Se inicia una nueva transaccion
    2. Se ejecuta un SQL de tipo find() o mege()
        se pasa al estado de persistente y se cierra la transaccion
    3. Termina la transaccion
        pasamos al estado detached
    
    
                Actualizar un objeto persistente en JPA
    
    1. Se inica tansaccion 1
        2. Se ejecuta un SQL de tipo find
             Entramos al estado persistene
             Se hace comit de la transaccion y se cierra
        3. Termina la transaccion
            pasamos al estado de detached
    4. se tiene el objeto de entidad y podemos agregar o modificar los valores del objeto
    5. Inicia transaccion 2
        6. Se ejecuta el SQL de tipo merge
            pasamos al estado de persistente
            Se hace un flush y se cierra la transaccion
        7. Termina la transaccion
            entramos al estado de detached
    
                Actualizar un objeto persistente con sesion larga
    
    1. Inicia transaccion 
        2. SE ejecuta el SQL de tipo find()
            pasamos al estado de persistene
            se obtiene la entidad
        3. Se pueden modificar los valires del objeto 
            Se gace un flush y un commit de la transaccion 
    4. Termina la transaccion   
        pasamos al estado de detached
    Nota: No hay necesidad de hacer update explícito, al terminar la transaccion (commit) se ejecuta el update
        
    
            Eliminar un objeto persistente
    
    1. Se inica la transaccion 1
        2. Se ejecuta el SQL find  
            Se pasa al estado de persistente
            Se hace un flush y se cierra la transaccion 
    3. Termina la transaccion
        pasamos al estado de detached
        y se tiene recuperado el objeto de entidad
    4. Se inicia la transaccion 2
        5. Se ejecuta el SQL remove
            pasamos al estado de remove
            hacemos flush y cerramos la transaccion 
    6. Termina la transaccion 
        pasamos al estado de transistivo
    Nota: Se puede ejecutar tambien una transaccion larga como la de actualizar
    
    
    */
    
}

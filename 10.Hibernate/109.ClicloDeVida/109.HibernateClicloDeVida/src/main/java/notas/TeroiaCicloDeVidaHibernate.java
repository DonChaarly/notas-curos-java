package notas;

public class TeroiaCicloDeVidaHibernate {
    
    /*
                Ciclo de vida objetos de entidad
    
    Estado transitivo(Transient):Este estado se presenta al crear un objeto y aun no esta guardado en la base de datos
        Si al estar en estado persistence y se ejecuta el metodo delete() se pasa nuevamente al estado transient, pero este objeto ya no se puede persistir
    Estado persistente (Persistence): Al guardar un objeto utilizando un metodo save() o saveOrUpdate()
        Si al estar en estado Detached se ejecuta algun metodo merge(), update(), saveOrUpdate() o lock(), se regresa al estado persitence
    Estado separado (Detached): Al cerrar la transacion o al ejecutar los metodos evict(), close() o clear()
    
            
            Estados de los objetos de entidad
    
    Estado transitivo(Transient):
        Los objetos de entidad nuevos no son guardados directamente en la Base de Datos(BD)
        NO tienen asociado ningun registro en la base de datos
        Se consideran No transaccionales
    Estado Persistente (Persistence):
        Un objeto persistente tiene asociado un registro en la BD
        Los objetos persistentes siempre estan asociados con una sesion y son transaccionales. Su
        estado se sincroniza con la BD al terminar la transaccion.
    Estado Separado (Detached):
        Estos objetos tienen asociado un registro de BD, pero su estado no esta sincronizado con la BD
        Todos los objetos recuperados en una transaccion se convierten en detached una vez que termina la transaccion
    
                
    
                (Mas teoria en la clase 80-Ciclo de vida JPA)
    
    */
    
}

package notas;

public class TeoriaHttpSession {
    
    /*
    Manejo de sesiones con Servlets
    
    metodos utilizados:
    request.getSession(): se utiliza para otener la sesion que se creo a partir 
        de la peticion del cliente
    sesion.getAtribute(): Permite obtener un atributo previamente agregado a la
        sesion del cliente
    sesion.setAtribute(): Permite agregar un atributo a la sesion actual del cliente
    sesion.removeAtribute(): Permite eliminar un atributo agregado a la sesion
    sesion.invalidate(): Invalida la sesion actual del cliente
    sesion.isNew(): Permite si la sesion ha sido creada recientemente
    sesion.getCreationTime(): Permite conocer la fecha y hora de cuando se creo la sesion
    sesion.getLastAccesedTime(): Permite conocer la ultima vez en la que la sesion 
        fue accesada por el cliente
    sesion.getMaxInactiveInterval(): Permite conocer el tiempo de inactividad(en segundos)
        necesario para que la sesion se destruya si no recibe una peticion 
    sesion.setMaxInactiveInterval(): Perite modificar el valor mencionado en la funcion
        anterior. Este valor tambien se puede modificar en el archivo web.xml
    */
    
}

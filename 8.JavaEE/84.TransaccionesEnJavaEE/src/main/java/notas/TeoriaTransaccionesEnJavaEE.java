package notas;

public class TeoriaTransaccionesEnJavaEE {
    
    /*
    
                            ¿Qué es una transacción?
    Una transaccion de conoce como una unidad de trabajo atómica, es decir, se realiza toda
    o nada del método transaccional
    El objetivo de una transaccion es ejecutar todas las lineas de codigo de nuestro método
    y guardar finalmente la informacion en un repositorio por ejemplo una base de datos
    Pero si por alguna razón algo fallara en nuestro método de servicio se daría marcha atras 
    a los cambios realizados en la base de datos lo cual se conoce como rollback
    Esto permite que la información en nuestra base de datos este integra y no exista posibilidád 
    de datos corruptos por errores o fallas en la ejecucion de los métodos Java
    
                Carácteristicas de una transacción 
    
    Las características de una transacción tienen el acronimo de ACID:
    
    Atomic: Las actividades de un método se consideran como una unidad de trabajo, 
    Esto se conoce como Atomicidad, y asegura que se realice todo o nada de la transaccion
    Consistent: Una vez termina una transacción la informacion queda en estado consistente,
    ya que se realiza todo o nada y por lo tanto los datos no deben estar corruptos
    Isolated: Múltiples usuarios puedes usaar métodos transaccionales, sin embargo debemos prevenir 
    errores por accesos multiples, aislando en la medidad de lo posible nuestros métodos transaccionales
    Durable: Sin importar si hay una caida del servidor, una transaccion exitosa, debe guardarse y perdurar
    posterior al termino de una transacción.
    
            Manejo de una transacción
    
    En que momento se manda a llamar una transacción?
    En el momento en que el cliete manda a llamar el método agregar persona, se ejecuta 
    el método de la clase PersonaService, momento en el que la transacción comienza
    PesonaDao inserta a la persona y posiblemente también al Usuario y finalmente se hace 
    un commit o rolleback de la transaccion 

            Configuración de la propagación en Java EE
    Demarcación de transacciones por medio de conteiner-Manged Transaction (CMT´s)
    
    La propagación indica como se comportara un método ante una transacción que ha sido iniciado 
    previamente en otro método, es decir, como una transacción se propaga entre metodos transaccionales
    El valor por defecto de la propagación es requiered o requerido y los tipos de propagación son los siguientes
    
    Tipo de propagaciones:
    MANDATORY: El método tiene que ejecutarse dentro de una transacción, de lo contrario se lanzará una excepción
    REQUIRED: El método DEBE dejecutarse dentro de una transacción. Si ya existe una transacción el método la 
    utilizará, de lo contrario creará una nueva.
    REQUIRES_NEW: El método DEBE ejecutarse dentro de una transacción. Si ya existe una transacción, se supende 
    durante ejecición del método, de lo contrario creará una nueva.
    SUPPORTS: Indica que el método no requiere el manejo transacciona, pero puede participar de una transacción si ya hay alguna ejecutandose.
    NOT_SUPPORTED: El mpetodo NO debe ejecutarse en una transacción. Si ya existe una transacción, se supenderá hasta la conclusión del método. 
    NEVER: El método NO debe ejecutrase en una transacción, de lo contrario lanza una excepción
    
    
    
    */
    
}

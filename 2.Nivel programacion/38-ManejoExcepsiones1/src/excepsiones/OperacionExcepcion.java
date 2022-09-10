
package excepsiones;
/*
Nuestra clase excepcion tiene que extender de una clase definida en el API de Java
cuando extends Exception -> es check Exception
esto quiere decir que el codigo no se podra compilar si nose ha reportado la excepsion
cuando extends RunTimeException -> es RuntimeException 
esto quiere decir que no importa si no se reporta la excepsion mientras se escrie el codigo, esta va a saltar durante la ejecucion
*/
public class OperacionExcepcion extends RuntimeException{//se recomienda usar mas RuntimeException
    //Constructor
    public OperacionExcepcion(String mensaje){
        //En el constructor recibimos un mensaje y lo propagamos a la clase padre
        super (mensaje);
    }
}

//Una clase de tipo Action de Struts no necesariamente debe implementar o extender una clase de Java
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

//Vamos a extender de la clase ActionSupport para aprovechar las caracteristicas que nos brinda
public class MostrarPersonaAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    //Definimos un atributo que utilizaremos desde el JSP para mandar informacion al cliente
    private String nombre;
    
    //Lo principal que debe tener la clase de tipo Action es la implementacion de un metodo llamado Execute
    public String execute(){
        log.info("El nombre es: " + this.nombre);
        //ActionSupport nos brinda una serie de constantes definidas
        return SUCCESS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    //Para acceder a los mensajes del archivo de propiedades se crea un metodo get para los mensajes
    public String getTitulo(){
        //Se utiliza el metodo getText gracias a la clase ActionSupport
        return getText("persona.titulo");
    }
    public String getValor(){
        return getText("persona.valor");
    }
    public String getBoton(){
        return getText("pesona.boton");
    }
    
    
    
    
    
}

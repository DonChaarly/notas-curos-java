package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Candidato {
    private String nombre = "Introduce tu nombre";
    
    Logger log = LogManager.getRootLogger();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        //Se utiliza la variable log para indicar en el nivel de info que se esta modificando la variable de nomre
        log.info("Modificando la propiedad de nombre: " + this.nombre);
    }
    
    
}

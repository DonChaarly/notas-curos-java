//Se nombra esta clase con la palabra actions al final y se deposita en una carpeta con la palabra actions al final para poder manejar el concepto de convenciones
package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import mx.com.gm.model.Persona;
import org.apache.logging.log4j.*;

public class PersonasAction extends ActionSupport {
    
    Logger log = LogManager.getLogger(PersonasAction.class);
    
    private Persona persona;

    
    @Override 
    public String execute(){
        if(this.persona != null){
            log.info("\n");
            log.info("persona: " + this.persona);
        } else {
            log.info ("Persona con valor nulo");
        }
        
        return SUCCESS; 
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    
    
    
    
}

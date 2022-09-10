package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import mx.com.gm.capadatos.domain.Persona;
import mx.com.gm.capaservicio.PersonaService;
import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;

//Se extiende de la clase ActionSupport para aprovechar todos sus beneficios
public class MostrarPersonaAction extends ActionSupport{
    
    //Se definen los siguientes atributos para utilizarlos en la clase
    private long contadorPersonas;
    
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    //La anotacion Autowired nos ahorra el tener que configurar las inyecciones haciendo el trabajo por nosotros
    @Autowired
    private PersonaService personaService;
    
    private List<Persona> personas;
    
    //Se necesita sobreescribir el metodo execute en la clase action ya que este metodo nos dira a que jsp se redirige
    @Override
    public String execute(){
        this.personas = personaService.listarPersonas();
        this.contadorPersonas = personaService.contarPersonas();
        //Se envia la cadena de SUCCESS para que de ejecute el siguiente JSP configurado
        return SUCCESS;
    }
    
    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public long getContadorPersonas() {
        return contadorPersonas;
    }

    public void setContadorPersonas(long contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }

    
    
    
    
    
    
    
}

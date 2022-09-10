package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.inject.Inject;
import mx.com.gm.capadatos.domain.Persona;
import mx.com.gm.capaservicio.PersonaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//Se implementa la clase ActionSupport para obtener sus ventajas
public class MostrarPersonaAction extends ActionSupport{
    
    private long contadorPersonas;
    
    //Se crea un log para poder mandar informacion a la consola
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    //La anotacion Autowired nos ahorra el tener que configurar las inyecciones haciendo el trabajo por nosotros
    @Inject
    private PersonaService personaService;
    
    //Se agregan los atributos con los que contara la clase
    private List<Persona> personas;
    
    //Se agrega el metodo execute que nos permite indicar las acciones que realizara el controlador al mandar llamar el path
    @Override
    public String execute(){
        this.personas = personaService.listarPersonas();
        this.contadorPersonas = personaService.contarPersonas();
        return SUCCESS;
    }

    public long getContadorPersonas() {
        return contadorPersonas;
    }

    public void setContadorPersonas(long contadorPersonas) {
        this.contadorPersonas = contadorPersonas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

}

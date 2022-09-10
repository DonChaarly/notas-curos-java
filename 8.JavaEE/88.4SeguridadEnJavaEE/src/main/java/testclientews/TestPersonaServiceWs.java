package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;
import javax.xml.ws.BindingProvider;


public class TestPersonaServiceWs {
    
    public static void main(String[] args) {
        
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        
        //Se agrega la configuracion para pasar la configuracion del EJB que nos esta requiriendo 
        ((BindingProvider)personaService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "admin");
        ((BindingProvider)personaService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "admin");
        
        System.out.println("Ejecutando servicio de listar personas ws");
        List<Persona> personas = personaService.listarPersonas();
        
        for (Persona persona: personas){
            System.out.println("Persona idPersona: " + persona.getIdPersona() + " Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido() + " Email: " + persona.getEmail());
        }
        
        System.out.println("Fin servicio listar personas");
    }
    
}

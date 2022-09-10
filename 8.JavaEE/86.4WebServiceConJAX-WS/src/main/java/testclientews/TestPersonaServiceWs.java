package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;


public class TestPersonaServiceWs {
    
    public static void main(String[] args) {
        
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        
        System.out.println("Ejecutando servicio de listar personas ws");
        List<Persona> personas = personaService.listarPersonas();
        
        for (Persona persona: personas){
            System.out.println("Persona idPersona: " + persona.getIdPersona() + " Nombre: " + persona.getNombre() + " Apellido: " + persona.getApellido() + " Email: " + persona.getEmail());
        }
        
        System.out.println("Fin servicio listar personas");
    }
    
}

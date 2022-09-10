package mx.com.gm.sga.cliente;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;



public class CllientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al ejb desde el cliente\n");
        try {
            Context jndi = new InitialContext();
            //Buscamos el ejb
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/78.EjbDeSesionRemoto/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            
            //Solicitamos el listado de personas
            List<Persona> personas = personaService.listarPersonas();
            //Iteramos la lista para imprimirla a la consola
            for (Persona persona: personas) {
                System.out.println(persona);
            }
            
            System.out.println("\nFin de la llamada al EJB desde el cliente");
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}


package test;


import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import java.util.List;
import javax.naming.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;


public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        
        //Se manda a llamar el archivo login.conf para poder superar la autenticacion del EJB
        String authFile = "login.conf";
        //Indicamos que vamos a utilizar la seguridad 
        System.setProperty("java.security.auth.login.config", authFile);
        //Se instancia un objeto de la clase ProgrammaticLogin para despues indicar el usuario con ayuda de este objeto
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        //Se especifica el usuario
        programmaticLogin.login("admin", "admin".toCharArray());
        
        
        try {
            //Iniciamos el contexto de jndi para ubicar el EJB que se ha publicado
            Context jndi = new InitialContext();
            //Recibimos la llamada del servidor
            PersonaServiceRemote personaServiceRemote = (PersonaServiceRemote) jndi.lookup("java:global/88.1SeguridadEnJavaEE/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");
            
            List<Persona> personas = personaServiceRemote.listarPersonas();
            
            for(Persona p : personas){
                System.out.println(p);
            }
            
            System.out.println("\nFin llamada al EJB desde el cliente");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
        
        
        
        
    }
    
    
    
}

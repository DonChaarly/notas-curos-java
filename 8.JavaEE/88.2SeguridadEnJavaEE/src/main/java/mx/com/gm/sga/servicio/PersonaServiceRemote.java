//Se agrega tambien esta interface ya que esta es la interface que se va a mandar a llamar para mandara llamar los metodos del EJB del lado del servidor
package mx.com.gm.sga.servicio;

import java.util.List;
import mx.com.gm.sga.domain.Persona;

public interface PersonaServiceRemote {
    
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona (Persona persona);
    
    
    
}

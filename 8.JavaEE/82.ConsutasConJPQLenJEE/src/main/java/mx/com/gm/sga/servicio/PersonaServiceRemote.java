package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Persona;

//Para acceder a la inteface de forma remota colocamos la anotacion Remote
@Remote
public interface PersonaServiceRemote {
    
    //Agregamos los metodos para trabajar con el objeto de tipo persona
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona (Persona persona);
    
}

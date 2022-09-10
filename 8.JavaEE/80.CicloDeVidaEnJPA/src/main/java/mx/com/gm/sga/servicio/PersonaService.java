package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Persona;

//Utilizamos la anotacion de Local ya que va a ser nuestra inteface local
@Local
public interface PersonaService {
    
    
    //Agregamos los metodos para trabajar con el objeto de tipo persona
    public List<Persona> listarPersonas();
    
    public Persona encontrarPersonaPorId(Persona persona);
    
    public Persona encontrarPersonaPorEmail(Persona persona);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona (Persona persona);
    
}

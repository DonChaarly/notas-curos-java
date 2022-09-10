
package mx.com.gm.capaservicio;

import java.util.List;
import mx.com.gm.capadatos.domain.Persona;


public interface PersonaService {

    //Se crean los metodos abstractos que despues se van a implementar en una clase java
    
    public List<Persona> listarPersonas();
    
    public Persona recuperarPersona(Persona persona);
    
    public void agregarPersona (Persona persona);
    
    public void modificarPersona (Persona persona);
    
    public void eliminarPersona (Persona persona);
    
    public long contarPersonas ();
    
    
}

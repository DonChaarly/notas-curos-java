package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Persona;

public interface IPersonaService {
    
    //115 Creamos los metodos de la interface
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
    
    
    
    
}

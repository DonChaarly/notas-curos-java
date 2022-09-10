package mx.com.gm.data;

import java.util.List;
import mx.com.gm.domain.Persona;

public interface PersonaDao {
    
    //125 Definimos los metodos que vamos a utilizar con el servicio web JAX-RS
    public List<Persona> encontrarTodasPersonas();
    
    public Persona encontrarPersona(Persona persona);
    
    public void insertarPersona(Persona persona);
    
    public void actualizarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
    
}

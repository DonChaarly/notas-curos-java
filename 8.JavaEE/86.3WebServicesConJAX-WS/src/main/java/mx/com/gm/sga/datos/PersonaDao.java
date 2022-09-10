//Se crea esta interfaz DAO a la cual va a acceder el archivo de PersonaServiceImpl
package mx.com.gm.sga.datos;

import java.util.List;
import mx.com.gm.sga.domain.Persona;

public interface PersonaDao {
    //Definimos los siguientes  metodos
    public List<Persona> findAllPersonas();
    
    public Persona findPersonaById (Persona persona);
    
    public Persona findPersonaByEmail (Persona persona);
    
    public void insertPersona (Persona persona);
    
    public void updatePersona (Persona persona);
    
    public void deletePersona (Persona persona);
    
    
}

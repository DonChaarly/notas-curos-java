package mx.com.gm.capadatos;

import java.util.List;
import mx.com.gm.capadatos.domain.Persona;

public interface PersonaDao {
    
    //Se establecen los metodos abstractos propios de el patron de diseño DAO
    
    void insertPersona (Persona persona);
    
    void updatePersona (Persona persona);
    
    void deletePersona (Persona persona);
    
    Persona findPersonaById (long idPersona);
    
    List<Persona> finAllPersonas();
    
    long contadorPersonas();
    
    Persona getPersonaByEmail (Persona persona);
    
}

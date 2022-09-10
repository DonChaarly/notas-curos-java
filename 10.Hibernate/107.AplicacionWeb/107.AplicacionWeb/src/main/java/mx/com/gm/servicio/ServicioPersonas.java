package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class ServicioPersonas {
    
    //instanciamos un objeto de la clase personaDao
    private PersonaDAO personaDao;
    
    //Creamos un constructor de tipo publico
    public ServicioPersonas(){
        this.personaDao = new PersonaDAO();
    }
    
    public List<Persona> listarPersonas(){
        return personaDao.listar();
    }
    
    
}

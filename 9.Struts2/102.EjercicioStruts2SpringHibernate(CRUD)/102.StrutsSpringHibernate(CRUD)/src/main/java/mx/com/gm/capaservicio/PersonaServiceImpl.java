package mx.com.gm.capaservicio;

import java.util.List;
import mx.com.gm.capadatos.PersonaDao;
import mx.com.gm.capadatos.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.*;



//Se agrega la anotacion de Service para indicar a Spring que esta clase se trata de una clase de servicio
//Se agrega la anotacion de Transactional para realizar transacciones de forma automatica sin tener que abrir una transaccion y despues tener que cerrarla
@Service
@Transactional
public class PersonaServiceImpl implements PersonaService{
    
    
    //La anotacion de Autowired nos ahorra el tener que inyectar los objetos que se necesiten
    @Autowired
    private PersonaDao personaDao;

    @Override
    public List<Persona> listarPersonas() {
        return personaDao.finAllPersonas();
    }

    @Override
    public Persona recuperarPersona(Persona persona) {
        return personaDao.findPersonaById(persona.getIdPersona());
    }

    @Override
    public void agregarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }

    @Override
    public long contarPersonas() {
        return personaDao.contadorPersonas();
    } 
    
}


package mx.com.gm.capaservicio;


import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.capadatos.PersonaDao;
import mx.com.gm.capadatos.domain.Persona;

//Se agrega la anotacion @Stateless para indicar que es un EJB de tipo Stateless
@Stateless
public class PersonaServiceImpl implements PersonaService{
    
    
    //La anotacion de Inject nos ahorra el tener que inyectar los objetos que se necesiten
    @Inject
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


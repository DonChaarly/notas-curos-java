package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.datos.PersonaDao;
import mx.com.gm.sga.domain.Persona;

//Para ser un EJB se coloca la anotacion Stateless
@Stateless
//Agregamosla implementacion tanto de la interface remota como la local
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService{
    
    //inyectamos la capa de datos osea la interfaz PersonaDao
    @Inject
    private PersonaDao personaDao;

    //difinimos los metodos haciendo uso de la capa de datos personaDao
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        return personaDao.findPersonaById(persona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        return personaDao.findPersonaByEmail(persona);
    }

    @Override
    public void registrarPersona(Persona persona) {
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

}

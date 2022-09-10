package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import mx.com.gm.sga.domain.Persona;

//Para ser un EJB se coloca la anotacion Stateless
@Stateless
public class PersonaServiceImpl implements PersonaServiceRemote{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1,"Juan","Perez","jperez@mail.com","55139900"));
        personas.add(new Persona(2,"Marta","Suarez","msuarez@mail.com","55899910"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaPorId() {
        return null;
    }

    @Override
    public Persona encontrarPersonaPorEmail() {
        return null;
    }

    @Override
    public void registrarPersona(Persona persona) {
    }

    @Override
    public void modificarPersona(Persona persona) {
    }

    @Override
    public void eliminarPersona(Persona persona) {
    }
    
    
}

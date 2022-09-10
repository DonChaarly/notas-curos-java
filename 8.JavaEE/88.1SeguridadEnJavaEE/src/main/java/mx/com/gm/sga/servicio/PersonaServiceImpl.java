package mx.com.gm.sga.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.annotation.security.*;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import mx.com.gm.sga.datos.PersonaDao;
import mx.com.gm.sga.domain.Persona;

//Para ser un EJB se coloca la anotacion Stateless
//Agregamosla implementacion tanto de la interface remota como la local
//Agregamos la anotacion Web Service e indicamos la clase que va a implementar
//Agregamos la anotacion de DeclareRoles y RolesAllowed en donde especificamos solo los roles que tienen acceso al EJB
@Stateless
@WebService(endpointInterface = "mx.com.gm.sga.servicio.PersonaServiceWs")
@DeclareRoles({"ROLE_ADMIN", "ROLE_USER"})
@RolesAllowed({"ROLE_ADMIN", "ROLE_USER"})
public class PersonaServiceImpl implements PersonaServiceRemote, PersonaService, PersonaServiceWs {

    //inyectamos la capa de datos osea la interfaz PersonaDao
    @Inject
    private PersonaDao personaDao;

    //Instanciamos la varable de contexto para poder hacer un rollback en una transaccion
    @Resource
    private SessionContext contexto;

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
        try {
            personaDao.updatePersona(persona);
        } catch (Throwable t) {//Throwable es la clase padre de todas las excepciones en java
            //Si ocurre una excepcion hacemos rollback con la variable contexto
            contexto.setRollbackOnly();
            t.printStackTrace(System.out);
        }

    }

    //Podemos especificar en un metodo en especifico los roles que pueden ejecutarlo con la anotacion de RolesAllowed
    @Override
    @RolesAllowed({"ROLE_ADMIN", "ROLE_USER"})
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }

}

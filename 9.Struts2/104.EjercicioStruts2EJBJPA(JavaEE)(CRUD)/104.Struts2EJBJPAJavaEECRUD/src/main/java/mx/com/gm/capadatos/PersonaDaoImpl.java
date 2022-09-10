package mx.com.gm.capadatos;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.capadatos.domain.Persona;
import org.apache.logging.log4j.*;
import org.springframework.stereotype.Repository;


//Se agrega la anotacion @Repository de Spring que le indica a Hibernate que esta clase es un DAO
@Repository
public class PersonaDaoImpl  implements PersonaDao{
    Logger log = LogManager.getRootLogger();
    
    //Se crea una variable entityManager la cual nos permitira persistir los datos de la base de datos
    @PersistenceContext
     private EntityManager em;

    @Override
    public void insertPersona(Persona persona) {
        //Insertamos un nuevo objeto
        //Para guardar datos en la base de datos simplemente se utiliza el metos persist
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        //para hacer el update solo se utiliza el metodo merge
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        //Para eliminar el objeto se utilliza el remove pero primero se tiene que actualizar el estodo del objeto
        em.remove(em.merge(persona));
    }

    @Override
    public Persona findPersonaById(long idPersona) {
        //Utilizamos el metodo find y especificamos la clase que queremos buscar y posteriormete indicamos que busque la persona que recibimos por id
        return em.find(Persona.class, idPersona);
    }

    @Override
    public List<Persona> finAllPersonas() {
        //Se define el query del lenguaje jpql para que recupere todos los datos de la tabla persona
        String jpql = "SELECT p FROM Persona p";
        //Creamos el query
        Query query = em.createQuery(jpql);
        //Forazar ir directamente a la base de datos para refrescar datos
        query.setHint("javax.persistence.cache.storeMode", CacheStoreMode.REFRESH);
        //Recuperamos la lista de personas de la base de datos
        List<Persona> personas = query.getResultList();
        System.out.println(personas);
        return personas;
    }

    @Override
    public long contadorPersonas() {
        //Se define el query del lenguaje jpql para realizar la consulta del numero de objetos en la base de datos
        String consulta = "SELECT COUNT(p) FROM Persona p";
        //Creamos el query
        Query q = em.createQuery(consulta);
        //Recuperamos la cuenta de objetos
        long contador = (long) q.getSingleResult();
        return contador;
    }

    @Override
    public Persona getPersonaByEmail(Persona persona) {
        //Se recupera el email de la persona proporcionada
        String cadena = "%" + persona.getEmail() + "%"; //Los % se usan en el like como caracteres especiales
        //Se define el query para recuperar una persona por email
        String consulta = "FROM Persona p WHERE upper(p.email) like upper(:param1)";
        //Se crea el query
        Query q = em.createQuery(consulta);
        //Se sustituyen los parametros 
        q.setParameter("param1", cadena);
        return  (Persona) q.getSingleResult();
    }
    

    
    
}

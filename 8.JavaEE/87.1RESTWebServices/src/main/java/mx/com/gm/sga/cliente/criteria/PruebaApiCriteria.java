package mx.com.gm.sga.cliente.criteria;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class PruebaApiCriteria { 
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //Se definen las variables que se van a utilizar para los queries de criteria
        CriteriaBuilder cb = null;
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;
        
        //Query utilizando el api de criteria
        //1. Consulta de todas las personas
        
        //Paso 1. El objeto EntityManager crea una intancia CriteriaBuilder
        cb = em.getCriteriaBuilder();
        
        //Paso 2. Se crea un objeto CriteriaQuery, indicando el tipo de clase que vamos a ejecutar
        criteriaQuery = cb.createQuery(Persona.class);
        
        //Paso 3. Especificamos el objeto raiz del query, y especificamos que recibirá una clase de tipo persona
        fromPersona = criteriaQuery.from(Persona.class);
        
        //Paso 4. Seleccionamos lo necesario del from, en vez de escribir slecet p form Persona p
        criteriaQuery.select(fromPersona);
        
        //Paso 5. Creamos el query typesafe
        query = em.createQuery(criteriaQuery);
        
        //Paso 6. Ejecutamos la consulta
        personas = query.getResultList();
        
        mostrarPersonas(personas);
        
        
        
        //2.a Consulta de la persona con id = 1
        //Con jpql se utiliza: "select p from Persona p where p.idPersona = 1"
        
        log.debug("\n2.a Consutla de la persona con id = 1");
        //obtenemos nuevamente el criteruaBuilder
        cb = em.getCriteriaBuilder();
        //inicializamo el criteriaQuery
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        //llamamos al metodo select seguido del metodo where en donde especificamos el parametro y la llave
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"), 1));
        //ejecutamos nuestro query
        persona = em.createQuery(criteriaQuery).getSingleResult();
        log.debug(persona);
        
        //2.b Consulta de la persona con id = 1 utilizando predicados
        log.debug("\n2.b Consulta de la persona con id = 1 utilizando predicados");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);
        //La clase Predicate nos permite agregar varios criterios dinamicamente
        List<Predicate> criterios = new ArrayList<>();
        //Verificamos si tenemos criterios que agregar
        //Creamos el criterio de idPersonaParam
        Integer idPersonaParam = 1;
        //Definimos una variable ParameterExpressionn y Llamamos al metodo parameter e indicamos el tipo de parametro y el nombre de nuestro parametro
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idPersona");
        //Agregamos nuestro criterio a la coleccion de criterios
        criterios.add(cb.equal(fromPersona.get("idPersona"), parameter));
        //Se agregan los criterios
        if (criterios.isEmpty()) {
            throw new RuntimeException ("Sin criterios");
        }
        else if(criterios.size() == 1){
            //Pasamos los criterios de nuestra lista de criterios
            criteriaQuery.where(criterios.get(0));
        }
        else {
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }
        
        //Ejecutamos nuestro query
        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", idPersonaParam);
        
        persona = query.getSingleResult();
        log.debug(persona);
        
    }
    
    private static void mostrarPersonas(List<Persona> personas) {
        for(Persona p: personas){
            log.debug(p);
        }
    }
}

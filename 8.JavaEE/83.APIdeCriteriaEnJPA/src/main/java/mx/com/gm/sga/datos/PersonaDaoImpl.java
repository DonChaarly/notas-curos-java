//Agregamos la implementacion de la interfaz PersonaDao, el cual debe ser un EJB para que pueda interactual con la base de datos
package mx.com.gm.sga.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
//Se convierte la clase en un EJB
@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    //Se inserta la unidad de persistencia utilizando el API de JPA
    @PersistenceContext (unitName="SgaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        //Utilizamos el Query que definimos en la clase Persona
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        //Utilizamos el metodo find y especificamos la clase que queremos buscar y posteriormete indicamos que busque la persona que recibimos por id
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        //Podemos agregar directamente un query en un metodo
        Query query = em.createQuery("from Persona p where p.email =: email");
        //Con este objeto query buscamos el parametro
        query.setParameter("email", persona.getEmail());
        //Hacemos el return, y esperamos un unico resultado, en la base de datos configuramo que el email sea relutlado unico (UR)
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
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
    
    
    
}

package mx.com.gm.data;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

//125 Anotacion Stateles para convertir a un EJB la clase
@Stateless
//125 La clase implementa la interface PersonaDao
public class PersonaDaoImpl implements PersonaDao{

    //125 Habilitamos el uso del JPA en este EJB (el nombre se configuro en el persistence.xml)
    @PersistenceContext(unitName = "PersonaPU")
    //125 Definimos la variable que va a recibir la unidad de persistencia
    EntityManager em;
    
    @Override
    public List<Persona> encontrarTodasPersonas() {
        //125 Utilizamos el query que definimos en la clase Persona
        return em.createNamedQuery("Persona.encontrarTodasPersonas").getResultList();
    }

    @Override
    public Persona encontrarPersona(Persona persona) {
        //125 Con la variable em mandamos llamar el metodo find, especificamos el entity class  y especificamos el atributo con el que vamos a buscar el objeto
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public void insertarPersona(Persona persona) {
        //125 mandamos a persistir el objeto que estamos recibiendo 
        em.persist(persona);
        //125 si queremos que el objeto se regrese ya con la llave primaria mandamos llamar el metodo flush ya que con esto se actualiza la base de datos
        em.flush();
    }

    @Override
    public void actualizarPersona(Persona persona) {
        //125 mandamos llamar el metodo merge para actualizar 
        em.merge(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        //125 mandamos llamar el metodo remove pero primero se tiene que actualizar la base de datos
        em.remove(em.merge(persona));
    }
    
    
}

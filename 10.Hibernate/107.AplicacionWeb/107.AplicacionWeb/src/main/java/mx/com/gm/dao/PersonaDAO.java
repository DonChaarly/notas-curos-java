package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

public class PersonaDAO {

    //Para poder hacer las transacciones a la base de datos, se crean los siguientes objetos
    private EntityManagerFactory emf;
    private EntityManager em;

    //Creamos un constructor de la clase en donde se va a crear la instancia de la fabrica para podernos conectar a la unidad de persistencia de Hibernate
    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }

    //Se agrega el metodo listar
    public List<Persona> listar() {
        //Especificamos la cadena hql que se va a ejecutar
        String hql = "SELECT p FROM Persona p";
        //Ejecutamos el query
        Query query = em.createQuery(hql);
        //Recuperamos la lista de pesonas
        List<Persona> personas = query.getResultList();
//        //Imprimimos los objetos de tipo persona
//        for (Persona p : personas) {
//            System.out.println(p);
//        }
        return personas;
    }

    //Se agrega el metodo insertar
    //Debido a que estamos realizando una prueba local y no estamos usando glassfish o otro servidor, debemos iniciar la transaccion y cerrarla nosotros mismos
    public void insertar(Persona persona) {
        //En dado caso que ocurra una excepcion podemos envolver el codigo en un bloque traycatch para ejecutar un rollback
        try {
            //Iniciamos la transacion
            em.getTransaction().begin();
            //Persistimos el objeto persona (osea lo guardamos)
            em.persist(persona);
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            //Hacemos rollback de la transaccion
            em.getTransaction().rollback(); 
        }
        //Se cierran los objetos de em
//        finally{
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    //Se agrega el metodo para modificar 
    public void modificar(Persona persona){
        //En dado caso que ocurra una excepcion podemos envolver el codigo en un bloque traycatch para ejecutar un rollback
        try {
            //Iniciamos la transacion
            em.getTransaction().begin();
            //Hacemos un merge del objeto(osea lo actualizamos)
            em.merge(persona);
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            //Hacemos rollback de la transaccion
            em.getTransaction().rollback(); 
        }
        //Se cierran los objetos de em
//        finally{
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    //Se agrega el metodo de eliminar
    public void eliminar(Persona persona){
        //En dado caso que ocurra una excepcion podemos envolver el codigo en un bloque traycatch para ejecutar un rollback
        try {
            //Iniciamos la transacion
            em.getTransaction().begin();
            //Para remover un elemento de la base de datos primero debemos actualizar el objeto 
            em.remove(em.merge(persona));
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            //Hacemos rollback de la transaccion
            em.getTransaction().rollback(); 
        }
        //Se cierran los objetos de em
//        finally{
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    
    //Se agrega un metodo para recuperar una persona de la base de datos
    public Persona buscarPersonaPorId(Persona p){
        return em.find(Persona.class, p.getIdPersona());
    }
}

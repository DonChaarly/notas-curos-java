package mx.com.gm.dao;

//Se extiende de la clase abstracta que creamos GenericDAO
import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Curso;

public class CursoDAO extends GenericDAO {

    //Se crean los metodos de listar, insertar, actualizar y eliminar
    public List<Curso> listar() {
        //Se define la consulta que se va a realizar
        String consulta = "SELECT c FROM Curso c";
        //Se manda a llamar el metodo getEntityManager utilizando nuestro atributo que heredamos
        em = getEntityManager();
        //Ejecutamos el Query
        Query query = em.createQuery(consulta);
        //Retornamos la lista que recibimos de objetos de tipo curso
        return query.getResultList();
    }

    public void insertar(Curso curso) {
        //Envolvemos este bloque en un tryCatch
        try {
            //Mandamos a llamar el metodo que heredamos
            em = getEntityManager();
            //Iniciamos una transaccion
            em.getTransaction().begin();
            //Persistimos el objeto que estamos recibiendo
            em.persist(curso);
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
//        finally{
//            //Si el em es diferente de null se cierra la sesion
//            if(em != null){
//                em.close();
//            }
//        }
    }
    
    public void actualizar(Curso curso) {
        //Envolvemos este bloque en un tryCatch
        try {
            //Mandamos a llamar el metodo que heredamos
            em = getEntityManager();
            //Iniciamos una transaccion
            em.getTransaction().begin();
            //Hacemos un merge del objeto para que se actualice en la base de datos
            em.merge(curso);
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
//        finally{
//            //Si el em es diferente de null se cierra la sesion
//            if(em != null){
//                em.close();
//            }
//        }
    }
    
    public void eliminar(Curso curso) {
        //Envolvemos este bloque en un tryCatch
        try {
            //Mandamos a llamar el metodo que heredamos
            em = getEntityManager();
            //Iniciamos una transaccion
            em.getTransaction().begin();
            //Se actualiza primero el registro y despues de remueve
            em.remove(em.merge(curso));
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
//        finally{
//            //Si el em es diferente de null se cierra la sesion
//            if(em != null){
//                em.close();
//            }
//        }
    }
    
    //Definimos un metodo para buscar un objeto por id
    public Curso buscarPorId(Curso curso){
        //Llamamos al metodo heredado 
        em = getEntityManager();
        //Mandamos llaar el metodo find para buscar el registro
        return em.find(Curso.class, curso.getIdCurso());
    }

}

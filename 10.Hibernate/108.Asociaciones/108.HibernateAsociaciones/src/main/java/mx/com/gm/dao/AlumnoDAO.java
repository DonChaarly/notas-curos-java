package mx.com.gm.dao;

//Se extiende de la clase abstracta que creamos GenericDAO
import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Alumno;

public class AlumnoDAO extends GenericDAO {

    //Se crean los metodos de listar, insertar, actualizar y eliminar
    public List<Alumno> listar() {
        //Se define la consulta que se va a realizar
        String consulta = "SELECT a FROM Alumno a";
        //Se manda a llamar el metodo getEntityManager utilizando nuestro atributo que heredamos
        em = getEntityManager();
        //Ejecutamos el Query
        Query query = em.createQuery(consulta);
        //Retornamos la lista que recibimos de objetos de tipo alumno
        return query.getResultList();
    }

    public void insertar(Alumno alumno) {
        //Envolvemos este bloque en un tryCatch
        try {
            //Mandamos a llamar el metodo que heredamos
            em = getEntityManager();
            //Iniciamos una transaccion
            em.getTransaction().begin();
            //Persistimos el objeto que estamos recibiendo
            em.persist(alumno);
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }finally{
            //Si el em es diferente de null se cierra la sesion
            if(em != null){
                em.close();
            }
        }
    }
    
    public void actualizar(Alumno alumno) {
        //Envolvemos este bloque en un tryCatch
        try {
            //Mandamos a llamar el metodo que heredamos
            em = getEntityManager();
            //Iniciamos una transaccion
            em.getTransaction().begin();
            //Hacemos un merge del objeto para que se actualice en la base de datos
            em.merge(alumno);
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }finally{
            //Si el em es diferente de null se cierra la sesion
            if(em != null){
                em.close();
            }
        }
    }
    
    public void eliminar(Alumno alumno) {
        //Envolvemos este bloque en un tryCatch
        try {
            //Mandamos a llamar el metodo que heredamos
            em = getEntityManager();
            //Iniciamos una transaccion
            em.getTransaction().begin();
            //Se actualiza primero el registro y despues de remueve
            em.remove(em.merge(alumno));
            //Hacemos commit de la transaccion
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }finally{
            //Si el em es diferente de null se cierra la sesion
            if(em != null){
                em.close();
            }
        }
    }
    
    //Definimos un metodo para buscar un objeto por id
    public Object buscarPorId(Alumno alumno){
        //Llamamos al metodo heredado 
        em = getEntityManager();
        //Mandamos llaar el metodo find para buscar el registro
        return em.find(Alumno.class, alumno.getIdAlumno());
    }

}

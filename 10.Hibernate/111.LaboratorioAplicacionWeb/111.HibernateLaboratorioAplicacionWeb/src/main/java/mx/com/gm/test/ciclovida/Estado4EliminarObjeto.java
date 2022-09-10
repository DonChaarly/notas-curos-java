package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado4EliminarObjeto {
    
    public static void main(String[] args) {
                
        //Creamos los objetos emf y em para poder abrir una conexion a la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Definimos la variable
        Contacto contacto = null;   
        
        //Para modificar un registro de la BD se debe recuperar primero el objeto de la base de datos, se puede inciar la transaccion antes o despues de recuperar el objeto
        //Se recupera el registro
        //1.Estado detached
        contacto = em.find(Contacto.class, 3);
      
        //Iniciamos una transaccion
        em.getTransaction().begin();
        
        //Se debe actualizar primero el registro antes de eliminarlo
        //2.remove
        em.remove(em.merge(contacto));
        
        //hacemos commit de la transaccion
        em.getTransaction().commit();
        
        //3.Estado detached, el objeto se encuentra todavia en la memoria pero se ha eliminado de la base de datos
        System.out.println("contacto = " + contacto);
        
        
    }
    
}

package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado1Persitido {
    public static void main(String[] args) {
        
        //Creamos los objetos emf y em para poder abrir una conexion a la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1.Estado transitivo (Aun no se tiene una representacion en la base de datos)
        Contacto contacto = new Contacto();
        contacto.setEmail("clara");
        contacto.setTelefono("11223344");
        
        //2.Estado Persistente (Se guarda o sincroniza el objeto con la base de datos)
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();
        
        //3.Estado Detached (Tenemos representacion en la base de datos)
        System.out.println("contacto = " + contacto);
        
        
        
        
    }
    
}

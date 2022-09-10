package mx.com.gm.sga.cliente.cascade;


import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersistenciaCascadaJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso 1. Crea nuevo objeto
        //objeto en estado transitivo
        Persona persona1 = new Persona("Hugo", "Hernandez", "hhernandez@mail.com", "3336977392");
        
        //Crear objeto usuario (tiene una dependecia con el objeto persona)
        Usuario usuario1  = new Usuario("hhernandez", "123", persona1);
        
        //Paso 3. persistimo el objeto usuario unicamente, en automatico se persiste el objeto persona que esta relacionado con el usuario
        //Porque indicamos el comportamiento en cascada en las clases entidad
        em.persist(usuario1);
        
        //Paso 4. hacemos commit para que se guarden cambios en la base de datos
        tx.commit();
        
        //objetos en estado detached
        log.debug("Objeto persona persistido: " + persona1);
        log.debug("Objeto usaurio persistido: " + usuario1);
        
        //Cerramos el objeto em
        em.close();
        
        
    }
    
}

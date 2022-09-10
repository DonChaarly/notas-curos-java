package mx.com.gm.sga.cliente.ciclovidajpa;
//Se utilizara esta clase para provar el ciclo de vida de un JPA

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;


public class PersistirObjetoJPA {
    //Definimos una variable para manejar nuestro logger
    static Logger log = LogManager.getRootLogger();
    
    //Agregamos un main pararealizar nuestra prueva
    public static void main(String[] args) {
        //Agregamos las variables de entidad para relizar transacciones a la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        
                        //Ciclo de vida del JPA
                        
        //1. Crear un nuevo objeto
        //Objeto en estado transitivo
        Persona persona1 = new Persona("Pedro", "Luna", "pluna@mail.com", "553976532");
        
        //2. Inicia transaccion
        tx.begin();
        
        //3. Ejecuta Sql
        em.persist(persona1);
        
        log.debug("Objeto persistido - aun sin commit: " + persona1);
        
        //4. Hacemos commit o rollback de la transaccion
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto persistido - estado detached: " + persona1);
        
        //cerramos el entity manager
        em.close();
    }
    
}

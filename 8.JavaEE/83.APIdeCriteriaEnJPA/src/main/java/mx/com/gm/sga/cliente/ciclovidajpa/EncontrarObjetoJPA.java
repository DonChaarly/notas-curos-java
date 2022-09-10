
package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EncontrarObjetoJPA {
    
    //Definimos una variable para manejar nuestro logger
    static Logger log = LogManager.getRootLogger();
    
    //Agregamos un main pararealizar nuestra prueva
    public static void main(String[] args) {
        
        //Agregamos las variables de entidad para relizar transacciones a la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        
        //Inicia la transaccion
        //1. Iiciamos una transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //2.Ejecuta SQL de tipo select
        Persona persona1 = em.find(Persona.class, 1);
        
        //3. Termina la transaccion
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto recuperado: " + persona1);
        
        //cerramos el entity manager
        em.close();
    }
    
}

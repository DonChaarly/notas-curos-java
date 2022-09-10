package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {
    
    //Definimos una variable para manejar nuestro logger
    static Logger log = LogManager.getRootLogger();
    
    //Agregamos un main pararealizar nuestra prueva
    public static void main(String[] args) {
        
        //Agregamos las variables de entidad para relizar transacciones a la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        
        //Inicia la transaccion
        //1. Iiciamos la transaccion 1
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //2. Ejecutamos SQL de tipo select
        Persona persona1 = em.find(Persona.class, 20);
        
        //3. Termina transaccion 1
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto enncontrado: " + persona1);
        
        //4. Inicia transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //5. Ejecutamos SQL de tipo delete, haciendo merge primero para sicronizar los datos
        em.remove(em.merge(persona1));
        
        //6. Termina la transaccion 2
        tx2.commit();
        
        //Objeto en estado detached ya eliminado
        log.debug("Objeto eliminado: " + persona1);
        
        //cerramos el entity manager
        em.close();
    }
    
}

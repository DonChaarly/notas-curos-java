package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {
    
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
        
        //2. Ejecuta SQL de tipo select
        //El id proporcionado debe existir en la base de datos
        Persona persona1 = em.find(Persona.class, 1);
        
        //3. Termina la transaccion 1
        tx.commit();
        
        //Objeto en estado detached
        log.debug("Objeto recuperado: " + persona1);
        
        //4. setValue (nuevo valor)
        persona1.setApellido("Juarez");
        
        //5. Inicia transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //6. Modificamos el objeto haciendo merge
        em.merge(persona1);
        
        //7. Termina transaccion 2
        tx2.commit();
        
        //Objeto en estado detached ya modificado
        log.debug("Objeto recuperado: " + persona1);
        
        //cerramos el entity manager
        em.close();
    }
    
}

package test;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Persona;

public class HolaMundoHibernate {
    
    public static void main(String[] args) {
        
        //Se define el query a ejecutar de lenguaje HQL de hibernate
        String hql = "SELECT p FROM Persona p";
        
        //Nos conectamos a la base de datos con la clase de emptityManagerFactory, la configuracion la agregamos en el persistence.xml
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        //Creamos una instancia para el objeto
        EntityManager entintyManager = fabrica.createEntityManager();
        
        //Ejecutamos un query
        Query query = entintyManager.createQuery(hql);
        //Recuperamos los objetos de tipo persona
        List<Persona> personas = query.getResultList();
        //Iteramos la lista de personas
        for(Persona p: personas){
            System.out.println("Persona: " + p);
        }
        
    }
    
}

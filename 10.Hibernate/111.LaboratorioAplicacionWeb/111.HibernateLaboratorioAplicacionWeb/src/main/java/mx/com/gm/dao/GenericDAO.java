package mx.com.gm.dao;

import javax.persistence.*;

public abstract class GenericDAO {
    
    //Los siguientes atributos se van a poder acceder desde las clases hijas
    protected static EntityManager em;
    private static EntityManagerFactory emf;
    private static String PU = "HibernateJpaPU";
    
    //Se agrega un constructor vacio el cual se encarga de instanciar la fabriba en caso de que sea igual a nullo
    public GenericDAO(){
        //Si el emf no se ha instanciado osea es null, este se instancia
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PU);
        }
    }
    
    //Se define un metodo llamado getEntityManager
    protected EntityManager getEntityManager(){
        //Si el em no se ha instanciado osea es null, este se instancia
        if(em == null){
            em = emf.createEntityManager();
        }
        return em;
    }
    
}

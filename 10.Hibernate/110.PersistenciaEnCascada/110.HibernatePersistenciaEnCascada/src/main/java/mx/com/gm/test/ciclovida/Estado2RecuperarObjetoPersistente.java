
package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;


public class Estado2RecuperarObjetoPersistente {
    
    public static void main(String[] args) {
                
        //Creamos los objetos emf y em para poder abrir una conexion a la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Definimos la variable
        Contacto contacto = null;   
        
        //Para recuperar un ojeto no es necesario realizar una transaccion ya que no 
        //se va a modificar nada de la base de datos, pero si se puede realizar la transaccion y hacer commit
        //recuperamos el objeto 
        contacto = em.find(Contacto.class, 3);
        
        //Entra en estado detached
        System.out.println("contacto = " + contacto);
        
    }
    
}

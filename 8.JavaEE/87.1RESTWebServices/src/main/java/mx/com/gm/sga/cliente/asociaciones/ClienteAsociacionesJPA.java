package mx.com.gm.sga.cliente.asociaciones;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClienteAsociacionesJPA {
    
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        //Recuperamos una lista de objetos de tipo personas
        //No es necesario crear un objeto transaccion debido a que no vamos a modificar la base de datos solo basmo a consultar la lista de personas
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        
        //cerramos la conexion
        em.close();
        
        //imprimir los objeto de tipo persona
        for (Persona persona: personas){
            log.debug("Persona: " + persona);
            //recuperamos los usuarios de cada persona el cual puede ser uno o muchos
            for (Usuario usuario: persona.getUsuarioList()){
                log.debug("Usuario: " + usuario);
            }
        }
        
    }
    
}
   

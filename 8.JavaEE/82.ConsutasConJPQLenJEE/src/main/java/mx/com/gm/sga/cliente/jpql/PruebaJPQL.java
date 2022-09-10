package mx.com.gm.sga.cliente.jpql;

import java.util.*;
import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.*;

public class PruebaJPQL {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        //Se crean las variables que vamos a utilizar para hacer las consutlas
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<String> apellidos = null;   
        List<Usuario> usuarios = null;
        
        //Creamos nuestros objetos entity para comunicarnos con la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        log.debug("\nConsutla de todas las personas: ");
        
        //1. Consutlas de todos los objetos de tipo persona
        //Definimos nuestro objeto query
        jpql = "select p from Persona p";
        //Ejecutamos el query con nuestro objeto em
        personas = em.createQuery(jpql).getResultList();
        //Imprimimos la lista de pesonas
        mostrarPersonas(personas);
        
        //2. Constulta de las personas con id = 1
        jpql = "select p from Persona p where p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
        log.debug(persona);
        
        //3. Consulta de la persona por nombre
        jpql = "select p from Persona p where p.nombre = 'Maria'";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        //4. Consulta de datos individuales, se crea un arreglo (tupla) de tipo object de 3 columnas
        log.debug("\nConsutla de datos individuales, se crea un arreglo (tupla) de tipo object de 3 columnas");
        jpql = "select p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";
        //Utilizamos un iterador para iterar cada elemento que regresa la consulta
        iter = em.createQuery(jpql).getResultList().iterator();
        //iteramos los valores de iter con un while
        while (iter.hasNext()){
            tupla = (Object[]) iter.next();
            //Recuperamos cada elemento del arreglo 
            String nombre = (String)tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            //imprimimos los elementos
            log.debug("Nombre: " + nombre + "Apellido: " + apellido + "Email: " + email);
        }
                
        //5. Obtiene el objeto persona y el id, se crea un arreglo de tipo persona con 2 columnas
        log.debug("\nObtiene el objeto persona y el id, se crea un arreglo de tipo persona con 2 columnas");
        jpql = "select p, p.idPersona from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            persona = (Persona) tupla[0];
            int idPersona = (int) tupla[1];
            log.debug("Objeto persona: " + persona);
            log.debug("id persona: " + idPersona);
            
            
        }
        
        //6. Consulta del id de todas las personas
        log.debug("\nConsurla del id de todas las personas");
        jpql = "select new mx.com.gm.sga.domain.Persona(p.idPersona) from Persona p";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        //7. Regresar el valor minimo y maximo del idPersona (scaler result)
        log.debug("\nRegresar el valor minimo y maximo del idPersona");
        jpql = "select min(p.idPersona) as MinId, max(p.idPersona) as MaxId, count(p.idPersona) as Contador from Persona p";
        iter = em.createQuery(jpql).getResultList().iterator();
        while(iter.hasNext()){
            tupla = (Object[]) iter.next();
            Integer idMin = (Integer) tupla[0];
            Integer idMax = (Integer) tupla[1];
            Long contador = (Long) tupla[2];
            log.debug("idMin: " + idMin + "idMax: " + idMax + "Contador: " + contador);    
        }
        
        //8. Cuenta los nombres de las personas que son distintos
        log.debug("\nCuenta los nombres de las personas que son distintos");
        jpql = "select count(distinct p.nombre) from Persona p";
        Long contador = (Long) em.createQuery(jpql).getSingleResult();
        log.debug("no. de personas con nombre distinto: " + contador);
        
        //9. Concatena y convierte a mayusculas el nombre y apellido
        log.debug("\nConcatena y convierte a mayusculas el nombre y apellido");
        jpql = "select CONCAT(p.nombre, ' ', p.apellido) as Nombre from Persona p";
        nombres = em.createQuery(jpql).getResultList();
        for(String nombreCompleto: nombres){
            log.debug(nombreCompleto);
        }
        
        //10. Obtiene el objeto persona con id igual al parametro proporcionado
        log.debug("\nObtiene el objeto persona con id igual al parametro proporcionado");
        //definimos el parametro que vamos a proporcionar
        int idPersona = 1;
        jpql = "select p from Persona p where p.idPersona = :id";
        //guardamos el resutlado en la variable query
        q = em.createQuery(jpql);
        //establecemos el parametro a buscar
        q.setParameter("id", idPersona);
        persona = (Persona) q.getSingleResult();
        log.debug(persona);
        
        //11. Obtiene las personas que contengan una letra a en el nombre, sin importar si es mayuscula o minuscula
        log.debug("\nObtiene las personas que contengan una letra a en el nombre, sin importar si es mayuscula o minuscula");
        //Con upper se convierte a mayuscula el resultado
        jpql = "select p from Persona p where upper(p.nombre) like upper(:parametro)";
        //el siguiente sera el parametro que utilizaremos para el like
        String parametroString = "%a%";
        q = em.createQuery(jpql);
        q.setParameter("parametro", parametroString);
        personas = q.getResultList();
        mostrarPersonas(personas);
        
        //12. Uso de between 
        log.debug("\nUso de between");
        //Con between podemos filtrar entre que valores queremos que nos regrese las personas
        jpql = "select p from Persona p where p.idPersona between 1 and 3";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        //13. Uso del ordenamiento 
        log.debug("\nUso del ordenamiento ");
        //se puede filtrar tambien colocando el mayor que
        //se ordena por nombre en forma descendente y por apellido de la misma forma
        jpql = "select p from Persona p where p.idPersona > 1 order by p.nombre desc, p.apellido desc";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);
        
        //15. Uso de join con lazy loading
        log.debug("\n15. Uso de join con lazy loading");
        //Con join adjuntamos el objeto de tipo persona al que esta relacionado el usuario, y al no 
        //especificar un comportamiento es automaticamente lazy, osea que recupera la informacion cuando la necesita
        jpql = "select u from Usuario u join u.persona p";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);
        
        //16. Uso de left join con eager loading
        log.debug("16. Uso de left join con eager loading");
        //Con left join adjuntamos el objeto de tipo persona a la izquierda, y al  
        //especificar el fetch estamos dando a entender que se utilizara el comportamiento eager, osea que se recuperara la informacion al mmomento
        jpql = "select u from Usuario u left join fetch u.persona";
        usuarios = em.createQuery(jpql).getResultList();
        mostrarUsuarios(usuarios);
        
       
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for(Persona persona: personas){
            log.debug(persona);
        }
    }

    private static void mostrarUsuarios(List<Usuario> usuarios) {
        for(Usuario usuario: usuarios){
            log.debug(usuario);
        }
    }
}    

package mx.com.gm.test.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mx.com.gm.domain.*;

public class PersistenciaCascadaTest {
    
    public static void main(String[] args) {
        
        //Creamos los objetos emf y em para poder abrir una conexion a la base de datos
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        /*
        Creamo tres objeto, un objeto de contacto uno de domicilio y otro de alumno, 
        el objeto de contacto y domicilio lo adjuntamos al alumno y persistiremos solo el objeto de alumno
        y gracias a la persitencia en cascada se guardara tambien la informacion relacionada de domicilio y contacto
        */

        //Creamos los tres objetos y modificamos los argumentos
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Mexico");
        
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@mail.com");
        contacto.setTelefono("44332211");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Lara");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);
        
        //Iniciamos una transaccion y persistimos el objeto alumno 
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        
        //Imprimimos la variable de alumno
        System.out.println("alumno = " + alumno);
        
        
        
        
        
    }
    
}

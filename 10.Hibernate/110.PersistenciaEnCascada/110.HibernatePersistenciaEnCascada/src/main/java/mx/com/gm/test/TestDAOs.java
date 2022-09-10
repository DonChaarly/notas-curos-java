package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.*;


public class TestDAOs {
    
    public static void main(String[] args) {
        
        //Probamos los metodos listar de cada clase dao
        
        System.out.println("Alumnos:");
        AlumnoDAO alumnoDao = new AlumnoDAO();
        imprimir(alumnoDao.listar());
        
        System.out.println("Domicilios:");
        DomicilioDAO domicilioDao = new DomicilioDAO();
        imprimir(domicilioDao.listar());
        
        System.out.println("Contactos:");
        ContactoDAO contactoDao = new ContactoDAO();
        imprimir(contactoDao.listar());
        
        System.out.println("Cursos:");
        CursoDAO cursoDao = new CursoDAO();
        imprimir(cursoDao.listar());
        
        System.out.println("Asignaciones:");
        AsignacionDAO asignacionDao = new AsignacionDAO();
        imprimir(asignacionDao.listar());
        
        
        
    }
    
    public static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println(o);
        }
    }
    
}

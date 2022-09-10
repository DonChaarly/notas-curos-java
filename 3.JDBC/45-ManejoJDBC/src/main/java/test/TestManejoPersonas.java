package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();//Creacion de objeto de tipo PersonaDAO para ejecutar las sentencias insertar, eliminar, borrar, modificar

        //Insternado un nuevo registro
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@gmail.com", "554456587");
//        personaDao.insertar(personaNueva);
        
        //Modificando un registro
//        Persona personaModificar = new Persona(6, "Juan Carlos", "Esparza", "jcesparza@gmail.com", "554456587");
//        personaDao.actualizar(personaModificar);

        //Eliminando un registro
        Persona personaEliminar = new Persona(6);
        personaDao.eliminar(personaEliminar);
        
        //Listando los registros de la base de datos e imprimiendo este registro
        List<Persona> personas = personaDao.seleccionar();
        for (Persona persona : personas) {
            System.out.println(persona);
        };
    }
}

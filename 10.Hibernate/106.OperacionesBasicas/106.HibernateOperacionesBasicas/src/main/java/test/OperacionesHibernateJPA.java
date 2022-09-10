package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;


public class OperacionesHibernateJPA {
    
    public static void main(String[] args) {
        
        //Creamos un objeto PersonaDao para poder llamar a sus objetos
        PersonaDAO personaDao = new PersonaDAO();
        
        //Mandamos llamar el metodo de Listar
        personaDao.listar();
        
        //Creamos un objeto de tipo persona para insertarlo en la base de datos y especificamos el id de la persona
        Persona persona = new Persona();
        persona.setIdPersona(33);
        
        //Recuperamos un objeto persona de la base de datos
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("Persona encontrada: " + persona);
        
        //Modificamos los valores de la persona
        //persona.setNombre("Carlos");
        //persona.setApellidoPaterno("Sancho");
        //persona.setApellidoMaterno("Paulito");
        //persona.setEmail("cramos@mail.com");
        //persona.setTelefono("592103945");
        
        //Insertamos la persona 
        //personaDao.insertar(persona);
        
        //Modificamos la persona
        //personaDao.modificar(persona);
        
        //Eliminamos la persona
        personaDao.eliminar(persona);
        
        //Volvemos a listar la persona
        personaDao.listar();
        
    }

   
}

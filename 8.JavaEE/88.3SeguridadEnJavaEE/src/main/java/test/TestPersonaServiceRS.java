package test;

import domain.Persona;
import java.util.List;
import javax.ws.rs.client.*;
import javax.ws.rs.core.*;

public class TestPersonaServiceRS {
    
    //Variables que vamos a utilizar
    private static final String URL_BASE = "http://localhost:8080/87.1RESTWebServices/webservice"; //La URL en donde definimos el jersey
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;
    
    
    public static void main(String[] args) {
        
        //Inicializamos nuestra variable de cliente
        cliente = ClientBuilder.newClient();
        
        
        //Leer una persona (metodo GET)
        webTarget = cliente.target(URL_BASE).path("/personas"); //Se manda el URL_BASE y se adjunta el path de personas mandando a llamar por default al metodo listar 
        //Proporcionamos un idPersona valido
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class); //Concatenamos el id 1 al webTarget y especificamos el tipo de informacion que vamos a enviar
        System.out.println("Persona recuperada: " + persona);
                
        
        //Leer todas las personas (Metodo Get con readEntity de tipo List<>
        personas = webTarget.request(MediaType.APPLICATION_XML).get(Response.class).readEntity(new GenericType<List<Persona>>(){}); //Con el webTatget mandamos a llamar el metodo request, agregamos el metodo get e indicamos el Response que es el tipo de respuesta que vamos a procesar y con readEntity recivimos el listado de objetos de tipo persona
        System.out.println("\nPersonas recuperadas: ");
        imprimirPersonas(personas);
        
        //Agregar una persona (metodo POST)
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Carlos");
        nuevaPersona.setApellido("Miranda");
        nuevaPersona.setEmail("cmiranda3@mail.com");
        nuevaPersona.setTelefono("45932659");
        //Hacemos una peticion de tipo request al webTarget
        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML)); //Hacemos el POST, utilizamos la clase Entity y llamamos al metodo entity, pasamos la nueva persona y especificamose el tipo de informacion
        System.out.println("");
        System.out.println(response.getStatus()); //Imprimimos el status de la operacion 
        //Recuperamos la persona recien agregada para despues modificarla y al final eliminarla
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona agregada = " + personaRecuperada);
        
        
        //Modificar la persona (Método PUT)
        //Persona recuperada anteriormente
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Ramirez");
        String pathId = "/" + personaModificar.getIdPersona(); //modificamos el path para especificar el id de la persona a modificar
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println("response: " + response.getStatus() );
        System.out.println("Persona modificada: " + response.readEntity(Persona.class));
        
        
        //Eliminar un persona
        //Persona recuperada anteriormente
        Persona personaEliminar = personaRecuperada;
        String pathEliminarId = "/" + personaEliminar.getIdPersona(); 
        invocationBuilder = webTarget.path(pathEliminarId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete(); //ya solo llamamos al metodo delete ya que ya configuramos el path
        System.out.println("");
        System.out.println("response: " + response.getStatus());
        System.out.println("Persona eliminada: " + personaEliminar);
        
        
        
    }

    private static void imprimirPersonas(List<Persona> personas) {
        for(Persona persona: personas){
            System.out.println(persona);
        }
    }
    
    
}

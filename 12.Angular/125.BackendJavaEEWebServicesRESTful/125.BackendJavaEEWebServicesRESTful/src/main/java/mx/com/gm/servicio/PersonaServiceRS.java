package mx.com.gm.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;
import mx.com.gm.data.PersonaDao;
import mx.com.gm.domain.Persona;

//125 Se coloca la anotacion Stateless para convertir esta clase en un EJB
@Stateless
//125 Este EJB va a ser de tipo JAX-RS para eso colocamo el path con el que lo vamos a llamar
@Path("/personas")
public class PersonaServiceRS {
    
    //125 Se inyecta un objeto de PersonaDao para utilizar sus metodos 
    @Inject 
    private PersonaDao personaDao;
    
    //125 incluimos los metodos con los que vamos trabajar
    
    /*
    125 Se colocan las antocaciones correspondiendes
    GET para especificar que se va a utilizar el metodo Get
    POST para especificar que se va a utilizar el metodo post
    PUT para modificar informacion
    DELETE para eliminar una persona
    Produces especificamos el tipo de informacion que se va a generar
    Consumes epsecificamos el tipo de informacion que se va a consumir
    Path especificamos el parmetro que vamos a recibir
    PathParam especificamos el nombre el parmetro que vamos a recibir
    */
     
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Persona> listarPersonas(){
        //125 Regresamos el listado de personas con ayuda de la clase personaDao y mandamos la informacion a la consola tambien
        List<Persona> personas = personaDao.encontrarTodasPersonas();
        System.out.println("Parsonas encontradas: " + personas);
        return personas;
    }
    
    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")//hace referencia al path: /personas/{id}, ej /personas/1
    public Persona encontrarPersona(@PathParam("id") int id){
        //125 buscamos la persona con ayuda de personaDao
        Persona persona = personaDao.encontrarPersona(new Persona(id));
        System.out.println("Persona encontrada = " + persona);
        return persona;
    }
    
    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Persona agregarPersona(Persona persona){
        //125 insertamos la persona 
        personaDao.insertarPersona(persona);
        //125 al utilizar el metodo flus en PersonaDaoImpl debemos ya tener el idpersona
        System.out.println("Persona agregada" + persona);
        return persona;
    }
    
    @PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response modificarPersona(@PathParam("id") int id, Persona personaModificada){
        //125 Encontramos la persona primero 
        Persona persona = personaDao.encontrarPersona(new Persona(id));
        //125 perguntamos si la persona ya existe
        if (persona != null) {
            personaDao.actualizarPersona(personaModificada);
            System.out.println("Persona modificada: " + personaModificada);
            //125 Construimos la repuesta mandando llamar el metodo ok en este caso en que todo funciono correctamente, entity especifa la persona modificada, y con build construimos la respuesta
            return Response.ok().entity(personaModificada).build();
        }
        else{
            //125 Regresamos el status con not found para este caso en que no se encontro la persona
            return Response.status(Status.NOT_FOUND).build();
        }
    }
    
    @DELETE
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response eliminarPersona(@PathParam("id") int id){
        //125 Creamos el objeto de tipo persona y lo eliminamos
        personaDao.eliminarPersona(new Persona(id));
        System.out.println("Persona Eliminada con el id: " + id);
        return Response.ok().build();
    }
    
    
}

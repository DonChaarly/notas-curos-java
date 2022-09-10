package mx.com.gm.sga.servicio;


import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.Status;
import mx.com.gm.sga.domain.Persona;

//Se configura el Path con la que llamaremos al web service
//Hacemos de la clase java un EJB
@Path("/personas")
@Stateless 
public class PersonaServiceRS {

    //Inyectamos el servicio de PersonaService por eso necitamos que sea un EJB
    @Inject
    private PersonaService personaService;

    //Agregamos los metodos del WebService de tipo REST utilizando los metodos HTTP 
    //Se coloca la anotacion GET para indicar que se utilizara el metodo get en esete metodo 
    //Con la anotacion de produces indicamos el tipo MIME que va a regresar, Se coloca entre llaves y separado de comas si es mas de un tipo
    @GET 
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
    public List<Persona> listarPersonas() {
        return personaService.listarPersonas();
    }

    //Se coloca un subPath al path ya definido para indicar el parametro que necesitamos, esto hace referencia a /persona/{id}
    //En el metodo se esta reciviendo un parametro para ello se coloca la anotacion de PathParam y el nombre del parametro
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{id}") 
    public Persona encontarPersonsPorId(@PathParam("id") int id) {
        return personaService.encontrarPersonaPorId(new Persona(id));
    }

    //Se indica el tipo de informacion que va a consumir el metodo para ello se coloca la anotacion Consumes
    @POST
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON}) 
    public Response agregarPersona(Persona persona) {
        try {
            personaService.registrarPersona(persona);
            //Construimos el objeto response, mandamos a llamar el metodo ok en dado caso que se haya generado correctamente, pasamos el objeto persona con el metodo entity y construimos la respuesta con el metodo build
            return Response.ok().entity(persona).build(); 
        } catch (Exception e) {
            e.printStackTrace(System.out);
            //Construimos esta respuesta en caso de errror
            return Response.status(Status.INTERNAL_SERVER_ERROR).build(); 
        }
    }

    @PUT
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("{id}")
    public Response modificarPersona(@PathParam("id") int id, Persona personaModificada) {
        Persona persona = personaService.encontrarPersonaPorId(new Persona(id));
        try {
            if (persona != null) {
                personaService.modificarPersona(personaModificada);
                return Response.ok().entity(personaModificada).build();
            } else {
                return Response.status(Status.NOT_FOUND).build();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return Response.status(Status.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DELETE
    @Path("{id}")
    public Response eliminarPersonaPorId(@PathParam("id") int id) {
        try {
            personaService.eliminarPersona(new Persona(id));
            return Response.ok().build();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            //El codigo de estado 404 es lo mismo que poner NOT_FOUND
            return Response.status(404).build(); 
        }
    }

}

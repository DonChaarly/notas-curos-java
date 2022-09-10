package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import javax.inject.Inject;
import mx.com.gm.capadatos.domain.Persona;
import mx.com.gm.capaservicio.PersonaService;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

//Se implementa la clase ActionSupport para obtener sus ventajas
public class PersonasAction extends ActionSupport{
    
   //Se agregan los atributos con los que contara la clase
    private List<Persona> personas;
    private Persona persona;
    
    //La anotacion Inject nos ahorra el tener que configurar las inyecciones haciendo el trabajo por nosotros
    @Inject
    private PersonaService personaService;
    
    //Se crea un log para poder mandar informacion a la consola
    Logger log = LogManager.getLogger(PersonasAction.class);
    
     //Se coloca la anotacion de Action para indicar el nombre de la accion (path) que se realizara
    //Con la anotacion de Result se indica el nombre del jsp que se ejecutrara y la locacion en donde se encuntra
    @Action(value = "/listar", results = {
        @Result(name="personas", location="/WEB-INF/content/personas.jsp")})
    public String listar (){
        this.personas = personaService.listarPersonas();
        return "personas";
        }
    
    @Action (value = "/agregarPersona", results = {
        @Result (name = "persona", location ="/WEB-INF/content/persona.jsp")})
     public String agregar (){
         //Creamos un nuevo objeto de tipo persona
         this.persona = new Persona();
         return "persona";
     }
     
    @Action (value = "/editarPersona", results = {
        @Result (name = "persona", location = "/WEB-INF/content/persona.jsp")})
    public String editar (){
        this.persona = personaService.recuperarPersona(persona);
        return "persona";
    }
    
    @Action (value = "/eliminarPersona", results = {
        @Result (name = "success", location ="listar", type = "redirect")})
    public String eliminar (){
        //Recuperamos el objeto persona, ya que solo tenemos el idPersona
        log.info("Metodo eliminar persona antes de recuperar: " + persona);
        this.persona = personaService.recuperarPersona(persona);
        log.info("Metodo eliminar persona despues de recuperar: " + persona);
        this.personaService.eliminarPersona(persona);
        return SUCCESS;
    }
    
        //No basta con mandar al JSP, sino a la accion de listar, por ello redireccionamos a la accion listar
    @Action (value = "/guardarPersona", results = {
        @Result (name = "success", location  = "listar", type = "redirect")})
    public String guardar(){
        //Diferenciamos la accion de agregar o editar con el idPersona
        if (persona.getIdPersona() == null){
            this.personaService.agregarPersona(persona);
        } else {
            this.personaService.modificarPersona(persona);
        }
        return SUCCESS;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
}

package mx.com.gm.sga.web;
//Se crea el javaBean de personaBean el cual se manejara el servicio de persona del EJB

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;
import org.primefaces.event.RowEditEvent;

@Named("personaBean")
@RequestScoped
public class PersonaBean {
    
    //Inyectamos el servicio de persona del EJB
    @Inject
    private PersonaService personaService;
    
    //Creamos un atriburo de tipo persona para indicar si alguno de los registros fue seleccionados
    private Persona personaSeleccionada;
    
    //Agregamos una lista de personas
    List<Persona> personas;
    
    //Constructor vacio
    
    public PersonaBean(){
    }

    //Utilizamo la caracteristica de PostConstruct que ejecutara el codigo en el momento en que se cree el objeto, para inicializar la lista de personas  
    @PostConstruct
    public void inicializar(){
        //Iniciamos las variables de nuestra personaBean ya que se podria marcar un error si no se inicializan
        personas = personaService.listarPersonas();
        personaSeleccionada = new Persona();
    }
    
    //Definimos el metodo editListener
    public void editListener (RowEditEvent event){
        //Obtenemos el objeto que se ha creado 
        Persona persona = (Persona) event.getObject();
        //mandamos llamar el metodo modificar persona e introducimos la persona con los cambios
        personaService.modificarPersona(persona);
    }
    
    //Definimos el metodo para reiniciar una personaSeleccionada al asignarle una nueva persona
    public void reiniciarPersonaSeleccionada(){
        this.personaSeleccionada = new Persona();
    }
    
    //Definimos el metodo para agregar una persona
    public void agregarPersona(){
        //Dependiendo de la persona que se haya seleccionado, se agrega a la base de datos
        this.personaService.registrarPersona(this.personaSeleccionada);
        //Actualizamos el modelo también
        this.personas.add(this.personaSeleccionada);
        //Reestablecemos el valor de la persona seleccionada
        this.personaSeleccionada = null;
    }
    
    //Definimos el método para eliminar una persona
    public void eliminarPersona(){
        this.personaService.eliminarPersona(this.personaSeleccionada);
        this.personas.remove(this.personaSeleccionada);
        this.personaSeleccionada = null;
    }

    //Metodos getter and setter
    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
}

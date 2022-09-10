package mx.com.gm.web;

import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.IPersonaService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

//113. La anotacion de Controller indica a spring que est clase se trata de un controlador de tipo Spring MVC
@Controller
//112. Gracias a la libreria de lombook con la anotacion de Slf4j que es para el manejo de loggin, y con ello tenemos acceso automatico a la variable de log
@Slf4j
public class ControladorInicio {
    
    //115 Inyectamos una instancia de la interface PersonaPersona para poder utilizar sus metodos, la anotacion de Autowired nos facilita la inyeccion de esta interface
    @Autowired
    private IPersonaService personaService;
    
    //112. Para indicarle al navegador que este metodo es el que se tiene que mapear de debe especificar un path
    //112. La anotacion GetMapping indica que la peicion va a ser de tipo get
    @GetMapping("/")
    //113 Para compartir la informaicon con spring en ves de obtener los argumentos request y reponse ahora se obteiene el argumento model
    public String inicio(Model model){
        
        var personas = personaService.listarPersonas();
        
        log.info("Ejecutando el controlador de tipo MVC ");
        //113Para compartir infmacion se pasa la llave y el valor como se hacia con request pero ahora con la clase de modelo
        model.addAttribute("personas", personas);
        //113. Se regresa el nombre e la pagina que se va a desplegar en el navegador
        return "index";
    }
    
    //116 Agregamos el path de agregar
    @GetMapping("/agregar")
    public String agregar(Persona persona){
        //116 Ya no se tiene que crear un neuvo objeto de tipo persona, esto lo va a realizar spring de forma automatica
        return "modificar";
    }
            
    //116 Agregamos el metodo guardar el cual recibe la informacion de tipo POST, y para recibir el objeto persona que esa enviando solamente lo agregamos como argumento
    //117 Al mandar llamar el metodo de guardar se tienen que recuperar los errores para ello indicamos que el objeto persona se va a validar con la anotacion Valid, y en caso de errores se tinee que pasar el parametro de error, estos dos argumentos deben estar juntos
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores){
        //117 Preguntamos si hemos recibido errores
        if (errores.hasErrors()) {
            //117 En caso de errores redirigimos a la pagina de modificar
             return "modificar";
        }
        
        //116 guardamos la persona con el metodo guardar de la clase personaService
        personaService.guardar(persona);
        //116 hacemos un redirect a la pagina de inicio
        return "redirect:/"; 
    }
    
    //116 Agregamos el metodo editar, aparte del path editar se coloca el nombre de la variable que vamos a utilizar que nos mando el index
    @GetMapping("/editar/{idPersona}")
    //116 Se coloca como argumetno la persona y con ello spring va a inyectar el objeto persona y asociar el idPersona que estamos pasando, tambien colocamos la variable de model para poder compartir la informacion para la siguiente peticion
    public String editar(Persona persona, Model model){
        //Encontramos la persona y compartimos la informacion
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    //116 Agregamos el metodo editar el cual ya contiene el parametro idPersona el cual spring va a utlizar para crear hacer el set en el objeto persona que creara por default
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        //Utilizamos el metodo eliminar de la clae personaService y redireccionamos hacia la vista de inicio
        personaService.eliminar(persona);
        return "redirect:/";
    }
    
    
}

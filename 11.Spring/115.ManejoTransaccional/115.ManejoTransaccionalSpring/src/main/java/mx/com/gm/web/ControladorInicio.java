package mx.com.gm.web;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.servicio.IPersonaService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    
    
}

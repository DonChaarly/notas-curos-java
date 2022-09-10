package mx.com.gm;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//113. La anotacion de Controller indica a spring que est clase se trata de un controlador de tipo Spring MVC
@Controller
//112. Gracias a la libreria de lombook con la anotacion de Slf4j que es para el manejo de loggin, y con ello tenemos acceso automatico a la variable de log
@Slf4j
public class ControladorInicio {
    
    //113.Se declara una variable para guardar el mensaje index.valor que configuramos en el archivo de properties
    //113.Con la anotacion de value se indica la llave valor que se guardara en la variable debajo
    @Value("${index.saludo}")
    private String saludo;
    
    //112. Para indicarle al navegador que este metodo es el que se tiene que mapear de debe especificar un path
    //112. La anotacion GetMapping indica que la peicion va a ser de tipo get
    @GetMapping("/")
    //113 Para compartir la informaicon con spring en ves de obtener los argumentos request y reponse ahora se obteiene el argumento model
    public String inicio(Model model){
        var mensaje = "Mensaje con thymeleaf";
        
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("5544332211");
        
        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kgomez@mail.com");
        persona2.setTelefono("13991100");
        
        var personas = Arrays.asList(persona, persona2);
        
        log.info("Ejecutando el controlador de tipo MVC ");
        //113Para compartir infmacion se pasa la llave y el valor como se hacia con request pero ahora con la clase de modelo
        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        //113. Se regresa el nombre e la pagina que se va a desplegar en el navegador
        return "index";
    }
    
    
}

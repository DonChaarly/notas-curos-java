package mx.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Para que spring reconozca la clase se agrega la anotacionde RestController
@RestController
//Gracias a la libreria de lombook con la anotacion de Slf4j que es para el manejo de loggin, y con ello tenemos acceso automatico a la variable de log
@Slf4j
public class ControladorInicio {
    
    //Para indicarle al navegador que este metodo es el que se tiene que mapear de debe especificar un path
    //La anotacion GetMapping indica que la peicion va a ser de tipo get
    @GetMapping("/")
    public String inicio(){
        log.info("Ejecutando el controlador rest");
        log.info("Mas detalle del controlador");
        return "Hola mundo con spring";
    }
    
    
}

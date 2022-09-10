package mx.com.gm.sga.servicio;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import mx.com.gm.sga.domain.Persona;

//Agregamos la anotacion WebService 
@WebService
public interface PersonaServiceWs {
    
    //Agregamos el metodo listar personas el cual tambien vamos a exponer como web method
    @WebMethod
    public List<Persona> listarPersonas();
}

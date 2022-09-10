package beans;

import javax.jws.WebMethod;
import javax.jws.WebService;

//Se agrega la siguiente anotacion para indicar que la interface se va a exponer como un servicio web
@WebService
public interface ServicioSumarWS {
    
    //Se agrega una anotacion para exponer un metodo
    @WebMethod
    public int sumar(int a, int b);
    
}

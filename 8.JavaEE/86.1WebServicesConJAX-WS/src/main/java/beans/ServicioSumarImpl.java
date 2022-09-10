package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

//Se convierte esta clase a un EJB  
@Stateless
//Para implementar la interface se coloca la anotacion y se indica el nombre de la anotacion 
@WebService (endpointInterface="beans.ServicioSumarWS")
public class ServicioSumarImpl implements ServicioSumarWS{

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
}

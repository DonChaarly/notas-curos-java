//Se van a poner a prueba las clases generadas automaticamente del web Service
package Testclientews;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWS;

public class TestServicioSumarWs {
    
    public static void main(String[] args) {
        
        
        //generamos una instancia del objeto ServicioSumarImplServic y despues generar la instancia del servicio Web
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando ServicioSumarWS");
        int x = 6; 
        int y = 3;
        
        //mandamos a llamar a un metodo del servicio Web
        int resultado = servicioSumar.sumar(x, y);
        System.out.println("resultado = " + resultado);
        System.out.println("Fin ServicioSumarWS");
        
    }
    
}

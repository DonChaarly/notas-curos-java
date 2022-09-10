package mx.com.gm.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.ServicioPersonas;

//Se coloca la anotacion WebServlet con la que indicamos como se va a mandar llamar el servlet
//Para ser un servlet debe extender de la clase HttpServlet
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{

    @Override
    //Se debe implementar el metodo doGet o doPost
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        //Recuperamos una instancia de nuestra capa de datos
        ServicioPersonas servicioPersonas = new ServicioPersonas();
        
        //Solicitamos el listado de personas
        List<Persona> personas = servicioPersonas.listarPersonas();
        
        //Compartimos el listado de personas en algun alcance
        request.setAttribute("personas", personas);
        
        try {
            //Redireccionamos al jsp que queramos seleccionar
            request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
      
}

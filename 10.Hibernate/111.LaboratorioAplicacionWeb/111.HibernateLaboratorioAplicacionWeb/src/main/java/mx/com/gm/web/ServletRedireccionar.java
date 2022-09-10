package mx.com.gm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

//Se agrega la anotacion webServlet para definir el path con el que se puede mandar llamar el servlet
@WebServlet("/ServletRedireccionar")
public class ServletRedireccionar extends HttpServlet{
    
    //Se sobreescribe el metodo doGet como siempre en el servlet (doPost para cuando se quiere que no se muestre la informacion)
    //Y propagamos las excepciones con el throws
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
        //Se redirecciona al jsp agregar alumno y se hace un forward para compartir el request y response
        request.getRequestDispatcher("/WEB-INF/agregarAlumno.jsp").forward(request, response);

    }
    
}

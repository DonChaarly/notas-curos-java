package controlador;
/*
Este va a ser el controlador
*/
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //1.-Procesamos los parametros
        
        //2.-Creamos los JavaBeans
        Rectangulo rec = new Rectangulo(3, 6);
        
        //3.-Agregamos el JavaBean a algun alcance
        request.setAttribute("mensaje", "Saludos desde el Servlet");
        
        HttpSession sesion = request.getSession();
        sesion.setAttribute("rectangulo", rec);
        
        //4.-Redireccionamos a la vista seleccionada
        RequestDispatcher dispatcher = request.getRequestDispatcher("vista/DesplegarVariables.jsp"); //Se indica la ruta en donde se encuentra el JSP
        dispatcher.forward(request, response); //Se manda el request y el dispatcher
        
    }
    
}

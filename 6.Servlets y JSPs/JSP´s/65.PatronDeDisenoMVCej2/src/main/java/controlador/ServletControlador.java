package controlador;

/*
Este va a ser el controlador
 */
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.-Procesamos los parametros
        String accion = request.getParameter("accion");

        //2.-Creamos los JavaBeans
        //Crearemos un rectangulo para cada alcance
        Rectangulo rectanguloRequest = new Rectangulo(3, 6);
        Rectangulo rectanguloSession = new Rectangulo(5, 8);
        Rectangulo rectanguloApplication = new Rectangulo(4, 3);

        //3.-Agregamos el JavaBean a algun alcance
        //Verificamos la accion
        if ("agregarVariabes".equals(accion)) {
            request.setAttribute("rectanguloRequest", rectanguloRequest);

            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSession", rectanguloSession);

            //Mediante el metodo getServletContext podemos conseguir la application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplication", rectanguloApplication);

            //Mostramos el mensaje de que agregamos las variables
            request.setAttribute("mensaje", "Se agregaron las variables");

            //4.-Redireccionamos al JSP seleccionado
            request.getRequestDispatcher("index.jsp").forward(request, response);

        } else if ("listarVariables".equals(accion)) {
            //redireccionamos al JSP que se encarga de mostrar las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        } else {
            //redirigimos a la misma pagina
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);

            //Tambien es posible redirigir con sendRedirect pero no se proporcionara ningun mensaje, ya que esto no propaga el request y response en donde va toda la informacion proporcionada
            //response.sendRedirect("index.jsp");
        }
    }

}

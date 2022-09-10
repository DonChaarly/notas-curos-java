package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Simulando las respuestas correctas de inicio se sesion
        String usuarioOk = "Luis";
        String passwordOk = "123";
        
        //Obteniendo los parametros del formulario
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        //Preguntando si el contenido de usuario y password concuenran con los valores autorizados
        if(usuarioOk.equals(usuario) && passwordOk.equals(password)){
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Formulario Autorizado</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Datos Correctos</h1>");
            out.print("Usuario: " + usuario);
            out.print("<br/>");
            out.print("Password: " + password);
            out.print("</body>");
            out.print("</html>");
        }
        //En caso de no ser los valores autorizados se enviara un codigo de estado
        else {
            //Se utiliza el metodo sendError para enviar el codigo de estado y un mensaje
            //Con la variable response podemos acceder a varias constantes de codigos de estado
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales no son correctas");
        }
    }
}

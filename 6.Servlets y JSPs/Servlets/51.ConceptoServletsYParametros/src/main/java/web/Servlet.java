package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet ("/Servlet")
public class Servlet extends HttpServlet{
    
    @Override
    //Debido a que el formulario utilizara el metodo post, sobreescribimos ahora el metodo doPost
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Se leen los paametros del formulario html con el metodo getParameter y se especifica el nombre del parametro que se requiere
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        //Semanda a imprimir esta informacion a la consola de glassfish
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        //Se responde al cliente que hizo la llamada
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es:" + usuario);
        out.print("<br/>");
        out.print("El parametro password es:" + password);
        out.print("</body>");
        out.print("</html>");
        out.close();
        //Esta es la manera en que se procesan los parametros en los servlets
    }
    
}

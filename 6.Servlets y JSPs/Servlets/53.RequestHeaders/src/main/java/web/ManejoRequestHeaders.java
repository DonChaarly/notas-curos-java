package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class ManejoRequestHeaders extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<br/>");
        //Cabecero getMethod()
        String metodo = request.getMethod();
        out.print("Metodo Http: " + metodo);
        out.print("<br/>");
        //Cabecero getMethod()
        String uri = request.getRequestURI();
        out.print("Uri solicitada: " + uri);
        out.print("<br/>");
        out.print("<br/>");
        
        //Se obtienen todos los nombres de cabeceros disponibles y se guardan en una variabe de tipo enumeracion
        Enumeration cabeceros = request.getHeaderNames();
        //Se utiliza un ciclo while y el metodo hasMoreElements para imprimir todos los cabeceros
        while(cabeceros.hasMoreElements()){
            //Con el metodo nextElement() obtenermos el siguiente cabecero a iterar y lo guardamos en la variable
            String nombreCabecero = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCabecero + "</b>: ");
            //Con el metodo getHeader se obtiene el valor del cabecero
            out.print(request.getHeader(nombreCabecero));
            out.print("<br/>");

        }
             
        out.print("</body>");
        out.print("</html>");
        out.close();      
    }
    
}

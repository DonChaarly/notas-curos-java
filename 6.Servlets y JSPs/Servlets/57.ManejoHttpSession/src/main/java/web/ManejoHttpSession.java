package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesHttpServlet")
public class ManejoHttpSession extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Se llama a la sesion creada a partir de una peticion Http, si o ha sido creada se crea una en el momento
        HttpSession sesion = request.getSession();
        String mensaje = null;
        
        //Se pide el atributo contadorVisitas de la sesion
        //Se almacena en una variable integer debido a que el metodo getAtribute regresa un tipo objeto
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        //Se puede obtener un null al ser la primera vez que se accesde a la sesion, por ello preguntamos si contadorVisitas es null
        if (contadorVisitas == null) {
            contadorVisitas = 1;
            mensaje = "Bienvenido por primera vez al sitio web";
        }else{
            contadorVisitas++;
            mensaje = "Buenvenido Nuevamente al sitio web";
        }
        
        //Se añade el nuevo valor al atributo contadorVisitas de la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //Se imprime el mensaje, el valor de contador visitas y el id de la sesion
        out.print(mensaje);
        out.print("<br/>");
        out.print("No. accesos al recurso: " + contadorVisitas);
        out.print("<br/>");
        out.print("Id de la sesion: " + sesion.getId());
        out.close();
        
    }
    
}

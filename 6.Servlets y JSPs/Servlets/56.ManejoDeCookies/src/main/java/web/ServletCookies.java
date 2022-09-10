package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletCookies")
public class ServletCookies extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Se supone que el usuario vidista por primera vez el sitio web
        Boolean usuarioNuevo = true;
        
        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();
        
        //Buscamos si ya existe una cookie creada con anterioriad llamada visitanteRecurrente
        if (cookies != null) {
            //Buscamos entre el mapa de cookies la llamada a visitanteRecurrente con un forEach
            for(Cookie cookie: cookies){
                if (cookie.getName().equals("visitanteRecurrente") && cookie.getValue().equals("si")) {
                    usuarioNuevo = false;
                    break;
                }
            }
        }
        
        String mensaje = null;
        //En caso de que sea un usuario nuevo se crea la cookie visitanteRecurrente
        if (usuarioNuevo) {
            //Se crea unobjeto de tipo cookie
            Cookie visitanteCooki = new Cookie("visitanteRecurrente", "si");
            //Se añade el objeto cookie recien creado
            response.addCookie(visitanteCooki);
            mensaje = "Graciaspor visitar nuestro sitio por Primera vez";           
        }else{
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio Web";
        }
        
        //Se imprime el mensaje en la pagina web
        out.print("Mensaje: " + mensaje);
        out.close();
    }
    
}

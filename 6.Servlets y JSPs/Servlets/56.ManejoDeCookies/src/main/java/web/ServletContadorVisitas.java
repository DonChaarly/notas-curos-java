package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletContadorVisitas")
public class ServletContadorVisitas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charse=UTF-8");
        PrintWriter out = response.getWriter();
        
        //Se crea la variabe de contador visitas y se inicializa en 0;
        int contadorVisitas = 0;

        //Se obtienen las cookies
        Cookie[] cookies = request.getCookies();

        //Se pregunta se elmapa esta vacio y Se itera el mapa de cookies en busca de la cookie contador de visitas
        if (cookies != null) {
            for (Cookie c : cookies) {
                //En cada cookie se pregunta si la cadena contadorVisitas corresponse al nombre de la cookie
                if (c.getName().equals("contadorVisitas")) {
                    //Se obtiene el valor de la cookie, es decir el numero de visitas que se tiene, se obtiene un string hay que convertirlo en int
                    contadorVisitas = Integer.parseInt(c.getValue());
                    break;
                }
            }
        }

        //Se incrementa el contador de visitas
        contadorVisitas++;
        //Agregamos la respuesta al navegador
        Cookie cookieContador = new Cookie("contadorVisitas", Integer.toString(contadorVisitas));
        //Agregamos un tiempo de caducudad a la cookie de una hora, osea 3600 segundos
        cookieContador.setMaxAge(3600);
        //Añadimosla cookie
        response.addCookie(cookieContador);
        
        //Imprimimos la informacion en la pagina html
        out.print("Sitio visitado: " + contadorVisitas + " veces");
        
        
    }
}

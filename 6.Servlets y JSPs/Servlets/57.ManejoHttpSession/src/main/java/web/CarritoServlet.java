
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/carritoServlet")
public class CarritoServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        //Llamamos a la sesion o creamos
        HttpSession sesion = request.getSession();
        
        //Solicitamos el atributo articulos y lo guardamos en una lista de strings
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        
        //Nos aseguramos que la lista no sea null
        if (articulos == null) {
            //Inicializamos la lista en caso de que sea null
            articulos = new ArrayList<>();
            //Creamos el atributo articulos en la sesion
            sesion.setAttribute("articulos", articulos);
        }
        
        //Procesamos el articulo del formulario
        String articuloNuevo = request.getParameter("articulo");
        //Verificamos que no sea una cadena vacia y sea diferente de null
        if (articuloNuevo != null && articuloNuevo != "") {
            //Lo agregamos a la lista
            articulos.add(articuloNuevo);
        }
        
        //Imprimimos la lista de articulos
        PrintWriter out = response.getWriter();
        
        out.print("<h1>Lista de articulos</h1>");
        out.print("<br/>");
        for(String articulo: articulos){
            out.print("<li>" + articulo + "</li>");
        }
        //Agregamos un link para regresar al inicio
        out.print("<br/>");
        out.print("<a href='/57.ManejoHttpSession'>Regresar al inicio</a>");
    }
}

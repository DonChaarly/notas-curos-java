package mx.com.gm.sga.web;

//Creamos un Servlet para poder acceder desde este al EJB

import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaService;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    //Para poder hacer la llamada hacia EJB hacemos la inyeccion del EJB local, utilizando la inteface local hacia este servlet
    @Inject
    PersonaService personaService;
    
    //Sobreescribimos el metdodo DoGet para acceder al servlet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //Accedemos al listado de personas
        List<Persona> personas = personaService.listarPersonas();
        System.out.println("pesonas: " + personas);
        //Colocamos la variable de personas en algun alcance
        request.setAttribute("personas", personas);
        //Hacemos un requestDispacher que va a redirigir al JSP que va a desplegar el listado de personas
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
        
        
        
    }
    
}

package mx.com.gm.web;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Alumno;
import mx.com.gm.servicio.ServicioAlumno;

//Se coloca la anotacion de webSErvlet y se especifica el path con el que se va a llamar al servlet
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    
    //Se sobreescribe el metodo doGet
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        //Iniciamos una variable de servicio alumno para utilizar sus metodos
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        
        //Recuperamos la lista de objetos de tipo alumno
        List<Alumno> alumnos = servicioAlumno.listarAlumnos();
        
        //Compartimos la informacion en algun alcance para que lo pueda leer el JSP
        request.setAttribute("alumnos", alumnos);
        
        try {
            //Redirigimos a una vista
            request.getRequestDispatcher("WEB-INF/listarAlumnos.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        
        
    }
    
    
}

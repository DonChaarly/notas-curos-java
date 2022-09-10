package mx.com.gm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.*;
import mx.com.gm.servicio.ServicioAlumno;

//Se especifica el path con el que se va a mandar a llamar el servlet
//Se extiende de la clase httpServlet

@WebServlet ("/ServletAgregar")
public class ServletAgregar extends HttpServlet{
    
 
    //Se sobreescribe el metodo doPost ya que este fue el que especificamos en el formulario
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //Recuperamos todos los valores que nos manda el formulario
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String calle = request.getParameter("calle");
        String noCalle = request.getParameter("noCalle");
        String pais = request.getParameter("pais");
        String email = request.getParameter("email");
        String telefono = request.getParameter("telefono");
        
        //Creamos los objetos contacto, domicilio y alumno
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNoCalle(noCalle);
        domicilio.setPais(pais);
        
        Contacto contacto = new Contacto();
        contacto.setEmail(email);
        contacto.setTelefono(telefono);
        
        Alumno alumno = new Alumno();
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setContacto(contacto);
        alumno.setDomicilio(domicilio);
        
        //Se guarda el objeto alumno en la base de datos
        //Debido a que tenemos configurada la sincronizacion en cascada no es necesario guardar aparte los obejtos contacto y domicilio
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        servicioAlumno.guardarAlumno(alumno);
        
        //Redirigimos al jsp de index
        request.getRequestDispatcher("/index.jsp").forward(request, response);
        
    }
    
}

package mx.com.gm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Alumno;
import mx.com.gm.domain.Contacto;
import mx.com.gm.domain.Domicilio;
import mx.com.gm.servicio.ServicioAlumno;

//Se indica el path con el que se va mandar llamar el servlet y se extiende de la clase HttpServlet
@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    //Se sobreescribe el metodo doGet el cual utilizaremos para mostrar los valores del objeto alumno que vamos a recuperar
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Se recupera el parametro que nos mando el jsp listarAlumno, el cual recibiremos como string, hay que pasarlo a integer
        String idAlumnoS = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoS);

        //Creamos un objeto alumno con el id que recuperamos
        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);

        //Encontramos el alumno de la base de datos
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontarAlumno(alumno);

        //Compartimos el objeto alumno en un alcance, en este caso en el alcance de sesion para que la informacion no se pierda entre cada una de las peticiones que se van a hacer
        HttpSession sesion = request.getSession();
        sesion.setAttribute("alumno", alumno);

        //Redirigimos al jsp de moficiarAlumno
        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);
    }

    //Se sobreescribe el metodo doPost el cual utilizaremos para guardar los datos que se modfiquen 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Se agrega la variablo servicioAlumno para utilizar sus metodos
        ServicioAlumno servicioAlumno = new ServicioAlumno();
        //Se recupera el valor del boton modificar el cual solo se obtendra si se oprime modficar, en caso que se oprima eliminar solo se obtendra null
        String modificar = request.getParameter("Modificar");

        //Se hace la comprobacion de si modificar es null o no
        if (modificar != null) {
            //Recuperamos todos los valores que nos manda el formulario
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String calle = request.getParameter("calle");
            String noCalle = request.getParameter("noCalle");
            String pais = request.getParameter("pais");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");

            //Se va a recuperar el objeto alumno que el metodo doGet compartio en el alcance de sesion, esto para poder obtener tambien los id que ya tiene los objetos de alumno, domicilio y contacto
            HttpSession sesion = request.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");

            //Se modifican todos los atributos del objeto alumno
            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNoCalle(noCalle);
            alumno.getDomicilio().setPais(pais);
            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);

            //Se guarda el objeto alumno en la base de datos
            //Debido a que tenemos configurada la persistencia en cascada no es necesario guardar aparte los obejtos contacto y domicilio
            servicioAlumno.guardarAlumno(alumno);

            //Redirigimos al jsp de index
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
        else{
            //Recuperamos el id del registro que queremos eliminar el cual sera string, lo pasamos a integer
            String idAlumnoS = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            
            //Creamos nuestro objeto alumno
            Alumno alumno = new Alumno(idAlumno);
            //Eliminamos el registro con ayuda de la clase ServicioAlumno
            servicioAlumno.eliminarAlumno(alumno); 
            
            //Redirigimos al index
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }

    }

}

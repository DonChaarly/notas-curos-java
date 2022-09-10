package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Indicamos con que tipo de informacion se va a responder
        response.setContentType("text/html;charset=UTF-8");
        //Agregamos un cabecero de respuesta de refresh indicando que vamos a refrescar la pagina un determinado tiempo, en este caso un segundo
        response.setHeader("refresh", "1");
        
        //Obtenemos la fecha actual
        Date fecha = new Date();
        //Se da un formato a la clase utilizando la clase SimpleDateFormat, y se especifica el formato que vamos a utiliza
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualizada: ' HH:mm:ss");
        //Llamamos con nuestro objeto formateador la funcion format
        String horaConormato = formateador.format(fecha);
        
        //Mandamos a imprimir nuestra informacion
        PrintWriter out = response.getWriter();
        
        out.print(horaConormato);
        out.close();
    }
}

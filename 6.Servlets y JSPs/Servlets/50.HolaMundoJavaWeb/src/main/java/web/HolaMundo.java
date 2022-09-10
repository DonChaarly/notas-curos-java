/*
 Un servlet es simplemente una clase de Java que extiende de la clase HttpServlet
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//Es necesario colocar un comentario para reconocer y acceder al servlet desde el navegador, entre parentesis se coloca la ruta desde donde se va a acceder
@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    
    //Cuando el servidor haga la llamada a nuestro servlet, la hara por medio de un metodo get o post
    //Esta metodo se tiene que definir dentro de la clase
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Se llama a la funcion setContentTypepara indicar con que tipo de informacion se va a responder al navegador
        response.setContentType("text/html:charset=UTF-8");//Indicamos que con texto html, tambien indicamos el tipo de caracteres que sera utf8
        //Se crear una variable PrinWritter con la que mandaremos a imprimir al navegador, se usa la funcion getWritter para esto
        PrintWriter out = response.getWriter();
        //Se manda a imprimir al navegador con println
        out.println("Hola Mundo desde Servlets");
        
        
        
        
    }
}

package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Se indica que se respondera con un archivo excel
        response.setContentType("aplicacion/vndf.ms-excel");
        //Con el siguiente Cabecero de respuesta se indica que va a descargar el documento cuando se haga click en el link
        //Attachment significa que se va a descargar y filename es el nombre del archivo
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        //Para un uso mas profesional de ecxel visitar poi.apache.org
        //Se especifica que el navegador no guarde informacion previa o chace
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        //Con setDateHeader indicamosque expirara de manera inmediata, por ello el valor de -1
        response.setDateHeader("Expires", -1);
        
        //Se despliega la informacion al cliente
        PrintWriter out = response.getWriter();
        //el tabulador \t indica que se salte a la siguiente casilla excel
        //En excel si importa si se utiliza print o println
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        
    }
    
}

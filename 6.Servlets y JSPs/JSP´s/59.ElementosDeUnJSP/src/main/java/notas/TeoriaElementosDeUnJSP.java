
package notas;


public class TeoriaElementosDeUnJSP {
    
    /*
    Elementos de un JSP:
        Expressions:
            sintaxys: <%= expresion %>
            La expresion se evalua y se inserta en la salida del servlet
            Es equivalente a out.println(expresion)
        Scriptlets:
            sintaxys: <% codigo Java %>
            El codigo Java se inserta en el metodo Servic() del servlet generado
            Puede ser cualquier codigo java valido
        Declaraciones:
            sintaxys: <%! codigo Java %>
            Se utiliza para agregar codigo Java a la clase del Servlet generado
            Se pueden declarar variables o metodos que pertenecen a la clase
        Sintaxys XML:
            Cada elemento JSP tiene su equivalente en sintaxys XML
            Esta sintaxys se utiliza para tener una mayor compatibilidad, por ejemplo, con herramientas visuales
    
    Variables implicitas en los JSP:
        request:
            Es el objeto HttpServletRequest
        response:
            Es el objeto HttpServletResponse
        out:
            Es el Objeto JspWriter (equivalente a PrintWriter)
        session:
            Es el objeto HttpSession asociado con el objeto request
            Se puede desabilitar el uso de sesiones en los JSP
        application:
            Es el objeto ServletContext que se obtiene a partir del metodo 
            getServletContext() en un Servlet
    */
    
}

package notas;

public class TeoriaPatronDisenoMVC {
    
    /*
                Conceptos del Patron de diseño MVC
    Los servlets estan enfocados en controlar el flujo de la peticion HTTP
    Los JSP´s estan enfocados en desplegar la informacion de la aplicacion web
    La informacion que se comparte entre los componentes (Servlets y JSP´s) suele
    manejarse con JavaBeans
    El patron dediseño MVC (Modelo Vista controlador) nos permite integrar a los 
    JSP´s(Vista), a los Servlets(Controlador) y a los JavaBeans(Modelo)
    
                Freamworks que utilizan el patron MVC
    JSP/Servlets: Se implementa manualmente con ayuda del objeto RequestDispatcher
        para controlar el flujo de la aplicacion
    Struts: Es un framework de apache,el cual utiliza JSP(Vista) con tags de Struts,
        ActionForm(Modelo), Action(Controlador), entre otros componentes.
    JavaServer Faces (JSF): Es una tecnologia que utiliza conceptos como JSP(Vista)
        con tags de JSF, ManagedBean (Controlador), y JavaBeans (Modelo)
    SpringMVC: Es una extencion delfreamwork de spring, que utiliza JSP (Vista), con
        tags de Spring, Clases Java(Controladores), y JavaBeans(Modelo)
    Nota: un patron de diseño es una guia general y cada freamwork define las mejores practicas
        desde el punto de vista MVC
        
            Pasos Generales en un Servlet controlador
    a)Procesamos y validamos los prametros (si apica):
        reques.getParameter("nombreParametro");
    b)Realizamos la logica de presentacion almacenando el resultado en JavaBeans
        Rectangulo rec = new Rectangulo();
    c)Compartimos el objeto bean a utilizar en algun alcance (scope)
        request.setAttribute("rectanguloBean", rec); -> se guarda como un mapa, con una llave y un valor
    d)Redireccionamos al JSP seleccionado:
        RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
        dispatcher.forward(request, response);
    */
    
}

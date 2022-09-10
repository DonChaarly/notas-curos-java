
package notas;

public class TeoriaInclusionArchivosJSP {
    
    /*
            INLCUSION DE ARCHIVOS CON JSP´s
    Inclusion Estatica (trnaslation time):
        <%@include file="paginaRelativa.jso"%>
    Inclusion Dinamica (request time):
        <jsp:include page="paginaRelativa.jsp"/>
    
            Inclusion estatica:
    sintaxys:
        <%@include file="paginaRelativa.jso"%>
    Objetivo:
        Reutilizar codigo de texto plano, HTML o JSP´s
        En este caso el JSP que se incluye puede afectar al JSP incluyente
    Notas:
        En este caso no se delega el control al JSP incluido, sino que se incluye el archivo JSP, generando un unico JSP
        Por lo anterior, se pueden tener variables y metodos que se comparten entre los JSP´s
        Se recomienda compilar y construir nuevamente el proyecto para tener la version mas reciente de este
    
            Inclusion dinamica: 
    sintaxys:   
        <jsp:include page="paginaRelativa.jsp"/>
    Objetivo:
        Reutilizar codigo de texto plano, HTML o JSP´s
        Permite actualizar el contenido sin alterar el JSP que incluye el contenido a reutilizar
    Notas:
        El JSPprincipal delega el control al JSP incluido y la salida del JSP se agrega al JSP principal
        No se comparten variables o metodos entre los JSP´s, pero garantiza tener siempre la version mas reciente
        La pagina debe ser relativa a a aplicacion Web (uso de /)
        Se pueden incluir arhivos privados (desde la carpeta WEB-INF)
    
                Comparacion entre los tipos de inclusion
                                            Inclusion Estatica          Inclusion Dinamica
    Cuando ocurre la inclusion?         En tiempo de traduccion      En tiempo de ejecucion
    Que se incluye?                     El contenido del archivo     La salida de la pagina
    Numero de servlets generados                    1                           2
    Puede incluir cabeceros que                     Si                          No
      afectan al JSP principal?
    Puede incluir atributos o                       Si                          No
      metodos en comun?
    Se debe actualizar la pagina                    Si                          No
      principal si se actualiza
      la pagina incluida?
    El JSP principal delega el                      No                          Si
      control al JSP incluido?
    
    
    */
    
}

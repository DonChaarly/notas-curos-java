
package notas;

public class TeoriaTagsEnStruts2 {
    
    /*
                        Tags En Struts2
    
            Ubicacion del TLD de los tags de struts 2
    Todos los tags cuando se trabaja con servlets y jsp, provienen de un artchivo llamado TDL
    
    El TLD de struts 2 proviene del archivo dependecnias, struts2-core-2.5, META-INF, "struts-tags.tld"
    Dentro de este archivo se encuentra por ejemplo el short-name y el uri que se puede utilizar
    
        Ejemplo de uso del TLD de struts en una vista JSP
    
    <%@Taglib prefix="s" uri="/struts-tags" %>
    
        Uso del TLD de los tags en struts 2
    
    //Se debe agregar el taglib de las etiquetas de struts
    <%@Taglib prefix="s" uri="/struts-tags" %>
    <html>
        <head>...</head>
        <body>
            //Para agregar la etiqueta se inicia con el short-name s, se colocan : y despues se especifica la etiqueta que se quiere usar
            <s:form>
                <s:textfield label="Nombre" name="persona.nombre"/>
            </s:form>
    

        Tipos de tags en struts 2
    
    Control
        ej. if, iterator, etx
    Datos
        Hipervinculos, url, action, etc.
    Formularios
        form, button, inputText, etc.
    UI (No Formularios)
        Mensajes de error, div, etc.
    
    
    
    Se modificaron los archivos:
    
    Solo se modifico el archivo de personas.jps en la parte de hasta abajo
    
    
    */
    
}

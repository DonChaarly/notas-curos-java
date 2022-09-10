package notas;

public class TeoriaMensajesStruts2 {
    
    /*
                        MENSAJES EN STRUTS 2 FRAMEWORK
    
    Con mensaje nos referimos a cualquier cadena que se muestre en las páginas web
    
    Para aplicar este concepto es necesario relacionar varios conceptos
   
    Lo primero que se debe agregar es un archivo de propiedades el cual debe encontrarse en
    una ruta en particular dentro del archivo de recursos si es que se esta trabajando con maven 
    pero el nombre del paquete debe ser identico al nombre de la clase
        Ejemplo: MiClaseAction.porperties
    Se tiene una clase java y el nombre de la clase debe ser identico al nombre del archivo y 
    de preferencia debe extender de la clase ActionSupport ya que nos otorga ciertas ventajas
        Ejemplo: MiClaseAction.java
    Y finalmente se tiene un JSP que puede acceder a al archivo de propiedades de forma directa o
    a traves del la clase java 
    
                Accediendo a los mensajes desde el JSP
    
    Se puede utilizar los siguientes tags:
        <s:textfield key="nombre" name="nombreAtributo" />
            Se define una llave con el valor de nombre y entonces el framework de Strut 2 ira al 
            archivo de porpiedades y buscara una llave con ese mismo valor
        <s:text name="nombre"/>
            Igualmente se indica con el atributo de name cual es la llave que queremos acceder 
            en el archivo de propiedades
        <s:property value="getText('nombre')" />    
            Se manda a llamar el metodo del action definido en la vista 
    
    
    
    
    Se modificaron los archivos
    
    Se creo un folder en src/main/resources llamado beans.action debido a que este nombre 
        debe ser igual al de nuestro folder java
    Se creo el archivo de propiedades llamado MostrarPesonaAction
    MostrarPersonaAction.java
    mostrar-persona.jsp
    en el pom se quito la libreria de asm ya que la version de Struts-core ya la descarga automaticamente
    
    
    
    
    
    */
    
}

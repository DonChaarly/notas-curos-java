package notas;

public class TeoriaConvencionesStruts2 {
    
    /*
                        Convenciones en Struts 2 Freamework
    
    El uso de convenicones nos permite utilizar configuraciones por default
    en Struts 2
    
    Algunas de las convenciones que podemos utilizar son:
        Mapeo de Vistas (resultado o JSP a utilizar)
        Mapeo de Acciones
    
    
                Mapeo de vistas
    Podemos mapear la vista si depositamos los JSP´s en la siguiente carpeta:
        WEB-INF/content
    Ejemplo:
        URL: http://localhost:8080:/miApp/saludar
    vista a llamar:
        saludar.jsp
    
    
                Mapeo de Acciones
    Podemos mapear acciones de la siguiente manera:
        El nombre del paquete debe contener cualquiera de las siguientes palabras:
            struts
            struts2
            action
            actions
        Y el nombre de la clase debe terminar con la palabra Action
    Ejemplo 1:
        URL: http://localhost:8080/miApp/saludar     (nombre del path: /saludar)
        Nombre del paquete y de la clase Action: mx.com.gm.actions.SaludarAction
    Ejemplo 2:
        URL: http://localhost:8080/miApp/usuarios/registrar     (nombre del path: /usuarios/registrar)
        nombre del paquete y de la clase Action: mx.com.gm.struts2.usuarios.RegistrarAction
            
    
    Más informacion de convenciones: https://struts.apache.org/plugins/convention/ 
    
    
    Se modificaron los archivos
    
    Se agrego la carperta de content en WEB-INF
    Se paso el archivo saludar.jsp a content
    Se cambio el nombre de la carpeta beans a alguno de los nombre valido de las convenciones como beans.actions
    Se cambio el nombre de la clase java a SaludarAction para que termine en Action y tenga el mismo nombre de que el path a utilizar en index
    Se elimino el archivo de struts.xml ya que no se necesita
    Se agregaron librerias al pom 
    
    
    */
    
}

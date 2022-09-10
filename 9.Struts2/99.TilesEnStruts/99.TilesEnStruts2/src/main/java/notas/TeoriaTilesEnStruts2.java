
package notas;

public class TeoriaTilesEnStruts2 {
    
    /*
                        TILES EN STRUTS 2
    
    El concepto de tiles nos va a permitir usar plantillas, con el que vamos a 
    poder definir diferentes secciones como el header, Menu, body y el footer
            
    Para configurar correctamente el conepto de tiles se necesitaran diferentes archivos
    
    Se debe agregar la libreria de tiles al pom.xml
        gorupId: org.apache.struts
        artifactId: struts2-tiles-plugin    
        versio: cualquiera
    
    Se debe configurar el archivo web.xml
        Se debe aregar un parametro para indicar donde se encuentra la definicion de tiles.xml
            param-name: org.apache.tile.definition.DefinitionsFactory.DEFINITIONS_CONFIG
            param-value: /WEB-INF/tiles.xml
        Se debe agregar un listener para especificar cual es la clase que va a procesar los tiles de struts
            listener-class: org.apache.struts2.tiles.StrutsTilesListener
    
    Se debe agregar el archivo de tiles.xml en el WEB-INF
        Este archivo contendra la configuracion de nuestras plantillas
        Se agregan las definiciones que necesitemos como title, header, menu, body, footer
        y cada uno correspondera a un String en especifico o a un JSP 
        Seguido de esto se definen JSP´s que van a extender de la plantilla
    
    En el archivo de struts.xml en los results se tiene que especificar que seran de tipo tiles
    
    En las clases de tipo Action en las anotaciones de @Result se tiene que indicar que el tipo 
    de regreso sera de tipo tiles
    
    En el JSP que utilizaremos el concepto de tiles se utilizara el taglib de tiles
    
    En el JSP que sera parte de nuestras plantillas se ingresara inforamcion normal, no hay nada de diferente
    
    
    
    Se modificaron los siguientes archivos
    pom.xml
    web.xml
    Se agrego el documento de tiles.xml en WEB-INF
    Se agrego tambien el archivo LinkAction.java el cual es el que va a procesar las 
        peticiones de tipo Tiles de struts
    Se agrego el archivo struts.xml ya que es la unica forma de configurar los resultados 
        cuando estamos trabajando con tiles de struts
    Se agregaron los jsp de layout, header, menu, body y footer
    Se elimino la clase de personasAction ya que Se va a procesar la informacion con la de linkAction
    
    */
    
}

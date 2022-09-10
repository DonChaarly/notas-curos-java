//Una clase de tipo Action de Struts no necesariamente debe implementar o extender una clase de Java
package beans;


import org.apache.logging.log4j.*;

public class HolaMundoAction {
    
    Logger log = LogManager.getLogger(HolaMundoAction.class);
    
    //Definimos un atributo que utilizaremos desde el JSP para mandar informacion al cliente
    private String saludosAtr;
    
    //Lo principal que debe tener la clase de tipo Action es la implementacion de un metodo llamado Execute
    public String execute(){
        log.info("ejecutando metodo execute desde Struts 2");
        this.saludosAtr = "Adios desde Struts 2";
        //Para el framework de struts necesitamos enviar un string para indicar cual es el JSP que se va a ejecutar
        return "exito";
    }
    
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
    
    
    
    
}

package mx.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

//Se debe indicar que los resultados son de tipos Tiles
@Results({
    //El location es el verdadero nombre que se va a agregar al archivo de tiles.xml
    @Result(name = "bienvenidoResult", location = "bienvenidoTile", type = "tiles"),
    @Result(name = "personasResult", location = "personasTile", type = "tiles")
})

public class LinkAction extends ActionSupport {
    
    
    //Debido a que el menu que se agrego en tiles.xml tiene dos acciones se agregan los metodos correspondientes de tipo Action
    @Action(value="bienvenidoAction")
    public String bienvenido(){
        //La cadena que se regresa debe concordar con la establecida en el archivo jsp
        return "bienvenidoResult";
    }
    
    @Action(value="personasAction")
    public String personas(){
        return "personasResult";
    }

}

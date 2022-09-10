package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

//Se extiende de la clase ActionSupport para obtener mayores beneficios
//Se Agrega la anotacion de @Resutl para indicar el jsp que se utilizara en caso de obtener un success
@Result(name="success", location="/WEB-INF/content/login.jsp")
public class LoginAction extends ActionSupport{
    
    //Se define el metodo execute que regresara la cadena de SUCCES
    //Se agrega la anotacion de @Action para indicar el nombre de la accion que se realizara
    @Action("login")
    public String execute(){
        return SUCCESS;
    } 
    
       
}

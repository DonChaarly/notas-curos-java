package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

//Se extiende de la clase ActionSupport para obtener mayores beneficios
public class LoginAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LoginAction.class);
    
    //Se definen los atributo donde guardaremos el usuario y el passwordjsp
    private String usuariojsp;
    private String passwordjsp;
    
    
    //Se define el metodo execute
    public String execute(){
        //Se agrega una comprobacion para retornar o success o input
        if ("admin".equals(this.usuariojsp)){
        return SUCCESS;    
        }else{
            return INPUT;
        }
        
    }
    
    //Se definen los metodos get y set de nombre
    public String getUsuariojsp() {
        return usuariojsp;
    }

    public void setUsuariojsp(String usuariojsp) {
        this.usuariojsp = usuariojsp;
    }
    public String getPasswordjsp() {
        return passwordjsp;
    }

    public void setPasswordjsp(String passwordjsp) {
        this.passwordjsp = passwordjsp;
    }
    
    
    
    
}

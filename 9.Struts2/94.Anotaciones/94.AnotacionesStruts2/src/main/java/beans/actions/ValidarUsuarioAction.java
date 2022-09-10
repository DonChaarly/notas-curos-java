package beans.actions;

import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

//Se agrega la anotacion de @Resutls para indicar los resultados
@Results({
    @Result(name="success", location="/WEB-INF/content/bienvenido.jsp"),
    @Result(name="input", location="login", type="redirectAction")
})

public class ValidarUsuarioAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    //Se definen los atributo donde guardaremos el usuario y el passwordjsp
    private String usuariojsp;
    private String passwordjsp;

    //Se define el metodo execute
    //Se agrega la anotacion @Action para nombrar la accion
    @Action("validarUsuario")
    public String execute() {
        //Se agrega una comprobacion para retornar o success o input
        if ("admin".equals(this.usuariojsp)) {
            return SUCCESS;
        } else {
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

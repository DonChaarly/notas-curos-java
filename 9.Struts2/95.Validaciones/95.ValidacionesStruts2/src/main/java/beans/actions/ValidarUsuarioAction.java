package beans.actions;

import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;


//Se agrega la anotacion de @Resutls para indicar los resultados
@Results({
    @Result(name="success", location="/WEB-INF/content/bienvenido.jsp"),
    //Se manda directamente a la pagina de login, no se hace un redirect ya que se perderian los mensajes de error
    @Result(name="input", location="/WEB-INF/content/login.jsp")
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
            //Se utiliza el metodo addActionMessege de la clase ActionSupport para enviar un mensaje
            addActionMessage(getText("usuario.valido"));
            return SUCCESS;
        } else {
            return INPUT;
        }

    }
    
    //Se sobreescribe el método validate de la clase ActionSupport para mandar mensajes de error
    @Override
    public void validate(){
        //Se agrega una validacion para el campo de usuario
        if( this.usuariojsp == null || "".equals(this.usuariojsp.trim())){
            //Si el mensaje es null se manda un mensaje de error
            //Y se indica cual es el campo que provoca el error y el mensaje que se va a enviar
            addFieldError("usuariojps",getText("val.usuario"));
        }else if(!usuarioValido()){
            //Se manda un mensaje de error mas generico ya que no va a estar asociado a un campo
            addActionError(getText("usuario.invalido"));
        }
        
        //Se agrega una validacion para el campo de password
        if(this.passwordjsp ==null ||"".equals(this.passwordjsp.trim())){
            addFieldError("passwordjsp", getText("val.password"));
        }else if(this.passwordjsp.length() < 3){
            addFieldError("passwordjsp", getText("val.pass.min.lenght"));
        }
    }
    
    //Se crea un metodo para determinar si el usuario es valido o no
        private boolean usuarioValido() {
            return "admin".equals(this.usuariojsp);
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

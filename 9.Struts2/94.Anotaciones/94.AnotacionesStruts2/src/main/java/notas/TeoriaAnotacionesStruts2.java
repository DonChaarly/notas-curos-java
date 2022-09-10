package notas;

public class TeoriaAnotacionesStruts2 {
    
    
   /*
    
                                Anotaciones en Struts 2 @
    
    Al usar anotaciones ya no dependemos del archivo struts.xml en la mayoría de
    los casos
    
                Anotaciones de tipo Action
    
    Ejemplo de anotacion de tipo @Action dentro de la clase Action:
        Se agrega la anotacion @Action en el metodo execute para indicar el 
        nombre de la accion que se va a estar trabajando
    
            package mx.com.gm.actions;

            import org.apache.struts2.convention.annotation.Action;

            public class LoginAction{

                @Action("validarUsuario")
                public String execute(){
                    return "exito";
                }
            }
    
                
                Manejo de resutltados con anotaciones
    
    Ejemplo de anotacion de tipo @Resutl dentro de la clase Action:
        Dentro del metodo execute se regresa una constante como SUCCESS y con ello
        se puede utilizar la anotacion de @Result para indicar cual es el resutlado
        a ejecutarse cuando el metodo execute termine
        
            package mx.com.gm.actions;
            
            import static com.opensymphony.xwork2.Action.SUCCESS;
            import com.opensymphony.xwork2.ActionSupport;
            import org.apache.struts2.convention.annotation.Action;
            import org.apache.struts2.convention.annotation.Result;

            @Result(name="success", location = "/WEB-INF/content/login.jsp")
            public class LoginAction extends ActionSupport{

                @Action("login")
                @Override
                public String execute(){
                    return SUCCESS;
                }
            }
    
                
                Varios tipo de respuesta en la clase action
    Si se cuenta con varios tipos de respuesta se puede utilizar la anotacion
    de @Results el cual sera un arreglo y dentro de esta se indican los
    @Resutl que se tendran
    
    @Restuls({
        @Result(name="success", location = "/WEB-INF/content/login.jsp"),
        @Result(name="input", location = "login", type="redirectAction")
    })
    
    Y en el metodo execute se podría regresar dos valores como success e input
    resultado de una validacion por ejemplo
    
    
    En el archivo se modifico
    
    LoginAction.java, se eliminarion todos los metodos y solo se dejo el del execute
    Se creo una clase java llamada ValidarUsuarioAction
    LoginActions.properties, se eliminaron los mensajes de bienvenido
    Se creo el archivo de propiedades ValidarUsuarioAction
    
    
    
    
    
    */
    
}

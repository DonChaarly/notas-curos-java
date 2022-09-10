package notas;

public class TeoriaValidacionesStruts2 {
    
    
   /*
                    Validaciones en Struts2
    Al implementar la clase ActionSupport vamos a ser capaces de implementar el 
    concepto de validaciones 
    
            Validaciones en la clase de tipo Action
    
    Dentro de nuestra clase de tipo Action se puede slbreescribir el metodo de
    validate, el cual utilizaremos para regresar las validaciones que concideremos
    necesarias a los atributos recibidos desde el formulario de los jsp´s
    En el ejemplo validamos si el atributo es diferente de nulo o cadena vacia
    se manda un error con el metodo addFieldError
    
            public class ValidarUsuarioAction extends ActionSupport{

                private String usuario;
                private String password;
    
                @Override 
                public void validate(){
                    if(this.usuario == null || "".equals(this.usuario.trim())){
                        addFieldError("usuario", "Valor usuario invalido");
                    } else if (!usuarioValido()) {
                        addFieldError("Valor usuarioInvalido");
                    }

    
                }
                       
    
    
    Se modificaron los siguientes archivos
    
    ValidarUsuarioAction.java
    VAlidarUsuarioAction.properties
    login.jsp
 
    */
    
}

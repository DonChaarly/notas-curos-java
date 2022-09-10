package notas;

public class TeoriaResultadosStruts2 {
    
    
   /*
    
                RESULTADOS EN STRUTS 2
    
    El resultado sucede en el momento en el que el archivo action decide que es 
    lo que se enviara como respuesta
    
    Ejemplo de respuesta dentro de la clase Action:
        Al momento de enviar un String en el metodo execute se esta generando una
        respuesta la cual es seleccionar el siguiente JSP a mostrarse
    
    package mx.com.gm.actions;

    public class SaludarAction{
    
        public String execute(){
        return "exito";
    }


            Constantes de la interface action
    Las constantes son valores que podemos utilizar para indicar la siguiente 
    acción en struts
    
    SUCCES: Todo ha funcionado correctamente y se despliega el siguiente JSP a 
            ejecutarse
    NONE: Podría quedarse en la misma pagina sin ejecutar ninguna accion
    ERROR: Podría dirigir a una pagina de error
    INPUT: Hubo algun error al procesar alguno de los campos y se muestra 
           nuevamente el formulario
    LOGIN: Se muestra la pagina de login
    
    
            Archivo struts.xml y la respuesta
    
    Dentro del archivo de struts.xml
    se puede tener por ejemplo 
    
    <!--Primera accion definida
        Al ejecutarse el path de login se redirige a la pagina login.jsp
        No es necesario mandar a llamar una clase de tipo action en todo momento-->
    <action name="login">
        <rsutlt>pages/login.jsp</result>
    </avtion>
    
    <!--Segunda accion definida
        Se tiene un path validarUsuario y se manda a llamar la clase LoginAction, 
        al terminar el metodo execute retornando SUCCESS de esa clase estariamos 
        redirigiendo a la pagina bienvenido.jsp
        Si la constante en vez de SUCCESS es INPUT estariamos redirigiendo a la pagina de login.jsp
        hasta retornar el valor de SUCCES-->
    <action name="validarUsuario" class="mx.com.gm.action.LoginAction">
        <result name="success">pages/bienvenido.jsp</resutl>
        <result name="input">pages/login.jsp</result>
    </action>
    
    
    
    Archivos modificados
    
    Se agrego el archivo de struts.xml
    loginAction, Se quitaron los metodos para los mensajes
    login.jsp se cambio la forma en que se manda a llamar los mensajes
    
    */
    
}

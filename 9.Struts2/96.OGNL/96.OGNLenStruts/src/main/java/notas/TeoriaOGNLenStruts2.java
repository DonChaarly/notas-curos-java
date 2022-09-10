
package notas;

public class TeoriaOGNLenStruts2 {
    
    /*
                        OGNL (Object Graphic Navigation Language) en Struts 2
    
    OGNL es una comunicacion entre nuestra clase java o action con los JSP´s
    
                Analisis de peticion respuesta en Sruts2
    
    Al iniciar una peticion se tiene diferentes interceptores en struts los cuales 
    hacen todas las tareas necesarias para recuperar o modificar los valores asociados
    al formulario, una vez procesados los interceptores llega la informacion a nuestra 
    clase action, se ejecuta el metodo execute y la inforacion que llega de la vista 
    a la clase se almacena en el ActionContext(ThreadLocal) debido al OGNL
    
    Dentro del action Context se tien:
        ValueStack: es donde se almacena la informacion que recibimos de las vistas
        request
        session
        application
    
    Una vez terminada la accion se invoca el resultado el cual inicia otra vez el
    regreso de la peticion y los interceptores se vuelven a ejecutar (OGNL)
    
    
    En la clase action y en el JSP no se tien que hacer nada nuevo, solo se definen los atributos
    de la clase y en el JSP se mandan a llamar con el atributo de name en los textfield o los property
    el freamword de struts hace el trabajo de llamar los metodos de get o set relacionados
    
    
    Se modificarion los archivos:
    
    todos los archivos son nuevos para este documento
    Lo mas importante esta en el JSP de 
    
    
    
    
    */
    
}

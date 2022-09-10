package notas;

public class TeoriaAccionesStruts2 {
    
    /*
                        Acciones en Struts 2 freamwork
    
    Una accion es una de las partes más importantes de Struts
    Una accion representa al Controlador en el patróN de MVC
    Existen distintos tipos de acciones en Struts, dependiendo de lo que se quiera realizar
    No es necesario extender de ninguna interface, pero es posible escoger entre 
    varias que se veran a continuacion
    
                Flujo mas comun al trabajar en struts
    
    1 Request: Todo inica con una peticion del usuario
    2 Action: Nuestra clase Java de Action es la que va a procesar esta accion
    3 Logica de Negocio: Una vez procesada la accion se ejecuta la logica de negocio y
        se ejecuta la operacion respectiva
    4 Action: Se regresa al controlador de Struts
    5 Response: Al terminar de ejecutarse la clase action se selecciona la vista que se va a ejecutar
    
    
                Creacion de una clase de tipo Action
    Ejemplo de una clase de tipo Action en Struts 2 sin implementar interfaces:
        Se trata de una clase publica de java, no extiende de ninguna clase de maner ablicatoria
        y solo tenemos que agregar la definicion del metodo execute
            package mx.com.gm.actions;

            public class SaludarAction{

                public String execute(){
                    return "exito";
                }
            }
    
    Ejemplo de una clase de tipo Action es Struts 2 implementando interface:
        Se puede crear una clase Action implementando una interface tambien
            package mx.com.gm.actions;
    
            import com.opensymphony.xwork2.Action;
            
            public class SaludarAction implements Action {
                @Override
                public String execute(){
                    return "exito";
                }
            }
    
    
                Constantes de la Interface Action
    La interface de action contien algunas constates las cuales son cadenas para 
    regresar y seleccionar el tipo de accion o la vista a ejecutarse  posteriormente
    
        public static final String SUCCESS = "success";
        public static final String NONE = "none";
        public static final String ERROR = "error";
        public static final String INPUT = "input";
        public static final String LOGIN = "login";
    
    
                Clase ActionSupport 
    Esta clase a diferencia de solo implementar la interface Action, podemos extender
    la clase ActionSupport la cual nos otorga mas caracteristicas agregadas a nuestra clase
    Esta clase ya implementa la interface:
        Action
        LocalProvider (internacionalizacion)
        TextProvider (obtener mensajes de archivos de propiedades)
        Validateable (agregar el concepto de validaciones al trabajar con formularios)
        ValidationAware (de manera automatica se aplicaquen algunas validaciones)
    
    
    
    Se modificaron los archivos
    
    index.html
    MostrarPersonaAction
    Se modifico el nombre del jsp a mostrar-persona para que concida con el que marcamos en el index
    mostrar-persona
    
    
    */
    
}

package notas;

public class TeoriaManagedBeansJSF {
    
    /*
                    Reglas de Navegacion en JSF (cont.)
    La navegacion en JSF permite movernos entre paginas de la misma tecnologia.
    Existen varios tipos de navegacion:
        Navegacion Estatica
        Navegacion Dinamica
    Exiten varias formas de configurar la navegacion 
        Navegacion implicita (JSF)
        Navegacion explicita (en el archivo faces-config.xml)
        
    
        Navegacion Estatica 
    La navegacion estatica aplica en los siguientes casos:
        No se requiere ejecutar codigo java del lado del Servidor, sino unicamente
        dirigirse a otra pagina
        No hay logica para determinar la pagina siguiente
    Ejeplo de navegacion estatica:
        Pagina JSF que inicia la peticion:
        <h:commandButton label="Entrar" action="loging"/>
        La pagina siguiente se puede determinar de 2 formas:
        a) Outcome por default, buscar directamente la pagina loging.xhtml
        b) Buscar el outcome en faces-config.xml, encontrando el caso que determina 
            la siguiente pagina a mostrar
    
    
            Navegacion Dinamica
    La navegacion dinamica utiliza un metodo action, el cual tiene la logica para 
    deternaminar el aoutcome
    Codigo pagina JSF (vista)
        <h:commandButton label="Aceptar" action="${logingBean.verificarUsuario}"/>
        
        Codigo LogingBean (Controlador)
            public String verificarUsuario(){
                if(....)
                    return "exito";
                else
                    return "fallo":
            }
    
            
            Creacion de Reglas de navegacion
    <faces-config...>
        //Para crear la regla usamos la etiqueta navigation-rule
        <navigation-rule>
            //Indicamos cual es la pagina de la que proviene la petion
            from-view-id>/inicio.xhtml</from-view-id>
            //Podemos definir varios casos de navegacion
            <navigation-case>
                //definimos estos casos con la etiqueta from-outcome
                <from-outcome>entrar</from-outcome>
                //Y finalmente definimos la siguiente vista a mostrar haciendo un redireccionamiento a la pagina indicada
                <to-view-id>/loging.xhtml</to-view-id>
            </navigation-case>
        </navigation-rule>
     ....
    </faces-config>

*/
    
}

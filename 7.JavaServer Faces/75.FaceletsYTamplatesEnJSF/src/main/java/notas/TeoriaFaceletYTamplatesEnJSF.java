package notas;

public class TeoriaFaceletYTamplatesEnJSF {
    
    /*
                                Características de Facelets
    
    Los Facelets es la tecnología estándar de despliegue en JSF
    
    Los Facelets eliminan completamente la necesidad de los JSP´s
    
    Utilizan un parser XML en lugar del compilador de JSP
    
    Comparado con JSP, los Facelets crean un component tree más ligero
    
    Los Facelts resultan hasta 30% más rápidos en comparación 
    
    Soporte para Tamplates
    
    Creación de componentes compuestos
    
                            Los Facelts no son JSPs 
    
    Dentro de una página facelet NO es posible utilizar los siguientes taglib de JSP:
    
        <jsp:root/>
        <jsp:directiv.include.../>
        <jsp:output.../>
        <jsp:directive.content.../>
    
    Sin embargo, Sí es posdible utilizar los tags de JSTL en los Facelets:
    
        <c:forEach.../>
        <c:if.../>
        <c:catch.../>
    
    
                        Plantillas con Facelets
    
    Las plantillas definen las reginones lógicas de una página JSF
    Los elementos generales son:
    
        Tamplade (Plantilla): Página utilizada para contrilar el layout (disposición de los elementos)
        Tamplade-client (Cliente de la palantilla): Página que personaliza su propia distribución (layout) a partir de la pantilla que implementa
    
    Los clientes acceden al Tamplade-client, NUNCA directamente a la plantilla
    
    
                        Componentes Compuestos
    
    La creación de nuevos componentes JSF requerían de cresr clases Java.
    
    Los faceltes permiten crear componentes reutilizables combinando HTML y tags JSF:
    
        Permiten la reutilización de otros compomentes
        Se definen en un archivo XHTML, no en clases Java
    
    Los componentes compuestos son básicamente templates asociados a un tag libray personalizado.
    
    Para referenciar un componente compuesto basta con importar el namespace en el XHTML.
    
    
    */
    
}

    package notas;

public class TeoriaJavaServerFaces {
    
    /*
                    Que es JavaServer Faces?
        JavaServer Faces (JSF) es una tecnologia que fue diseñada para simplificar la 
    construccion de interfaz de usuario para aplicaciones web java
        JavaServer Faces (JSF) es el marco de aplicaciones web estandar para Java 
    Enterprise Edition (JEE)
        Al ser un estandar de Java, la tecnologia cuenta con el apoyo de una industria 
    muy solida
    
            Caracteristicas de JSF
        MVC: Implementa el patron de diseño Modelo-Vista-controlador
        RAD: Desarrollo rapido de aplicaciondes para web 
        Comonentes de interfaz de usuario: JSF tiene desarrollados componentes reutilizables
    listos para usarse
        Render.-kits: los componentes pueden desplegarce no solo en navegadores web, sino
    en dispositivos moviles u otros tipos de clientes
        Extensibilidad: JSF es altamente extensible debido a su arquitectura
        Internacionalizacion: Las vistas pueden mostrarse en distintintos idiomas
    Manejo de condiciones por default mas inteligentes
    Manejo de anotaciones para varias configuraciones
    Soporte nativo para AJAX
    Soporte por default para Faceltets
    Mas componentes y validadores
    
    
            Arquitectura JSF
    1. Capa de cliente:
        HTML, CSS y JavaScript
    2. Capa WEB (JSF)
        Managed Bean
        Facelets, JSP, Tags(vista)
        JavaBean(Modelo)
    3.Capa de Negocio
        Objetos de negocio
    4. Capa de Datos
        Objetos de Entidad
    5. Comunicacion con base de datos
    
        Patron de Diseño MVC con JSF
    Modelo:
        (Managed Bean de modelo)
    Vista:
        (Facelets o JSP)
    Controlador:
        (Managed Bean de controldador)
    
        Tecnologia de los Facelets
    Los Facelets son la tecnologia estandar de despliegue
    Los faclets pueden ser hasta un 30% mas rapido en el analisis y elaboracion de paginas
    Los Facelets fueron creados tomando en cuenta el ciclo de vida de los JSF
    Al ejecutar un facelt todos los componentes JSf se convieten a instancias
        de Java y son administadas por un componente Tree
    Todos los comoponenets JSF se derivan de la clase abstracta javax.faces.componente.UIComponent
    El estado de los componentes (Component Tree) puede almacenarse del lado del cliente o del lado del servidor
    
        
        Flujo de navegcion en JSF
    1.Peticion GET request index.faces
    2. Envio de formulario peticion POST paginaX.faces
    3. Instancia el/los Managed Beans
        Se revisa el archivo faces-config.xml o anotaciones
        Se buscan los ManagedBeans
        Se mapean las condiciones de retorno para aplicar la navegacion (declarada o por default)
    4. Ejecuta e metodo controlador
    5. Se ejecuta la logica de negocio y obtiene el modelo
    6. Selecciona la pagina Facelets o JSP
    
    
    */
    
}

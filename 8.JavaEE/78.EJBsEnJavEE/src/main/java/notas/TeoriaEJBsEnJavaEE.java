package notas;

public class TeoriaEJBsEnJavaEE {
    
    /*
    
                ¿Qué es un Enterprise JavaBean EJB?
    
    Un Enterprise Java Bean es una clase Java con caracteristicas que lo hacen mucho mas potente y robusto:
        Los metodos de un EJB son transaccionales
        Los metodos pueden ser remotos
        Facilidad de comunicacion con las bases de datos
        Los métodos pueden ser seguros
    
    
    El servidor de aplicaciones es el que contiene el Código Java (EJB´s)
    El equipo de cliente es un stand alone
    el equipo de cliene se comunica con el servidor por medio del protocolo RMI
    RMi significa Remote Method Invocation (Es parte del estandar Jaava SE)
    
    
    Los EJBs normlalmente tienen la logica de negocio de la aplicacion y por lo 
    tanto cumplen el rol de la capa de servicio de la apalicacion
    
                Caracristicas de un EJB 
    
    Cuando un EJB se ejecuta en un Contenedor Java EE que soporta EJBs, el contenedor 
    agrega los siguientes servicios disponibles:
        Seguridad
        Llamadas asincronas
        Llamadas remotas
        Web Services
        Transacciones
        Inyeccion de dependencias
        Pool de conexiones
        Thread-Safety
        Scheduling
        Mensajeria
        Interceptores
        etc...
    

                    Configuracion y tipos de EJBs
    
    Se crea una clase Java que en conjunto con anotaciones nos dara un Enterprise Java Bean
    
    Tipos de Enterprise JavaBeans:
        Stateless: No guardan estado y se utiliza la anotacion @Stateless (Estos son los mas utilizados)
        Stateful: Guardan estado y se utilizan la anotacion @Stateful
        Singleton: Solo existe una instancia en memoria y se utiliza la anotacion @Singleton
    
    Un servidor de aplicaciones Java puede ser:
        GlassFish
        JBoss
        WebSphere
        Oracle web logic
        etc...
        Tambien hay servidores web como tomcat o jeti
    
    
                    Formas de comunicarnos con un EJB
    
    Existen diferentes formas de comunicarnos con un EJB:
    
    Se tiene el codigo de cliente y el servidor de aplicaciones
    
   ¨Podemos comunicarnos de manera remora desde el cliente al servidor
    Tambien podemos comunicarnos no utilizando interfaces
    
    Interfaz local: Se utiliza cuando el cliente se encuentra en el mismo servidor Java.
    Interfaz Remota: Se utiliza cuando el cliente se encuentra fuera del servidor Java 
    No inteface: Es una variante y simplificacion de los EJB locales.
    
    
                Anatomia de un EJB
    
    Un EJB puede implementar o no una interfaz local o remota, y puede tener uno o más métodos de negocio:
    
    
    package beans;
    
    import javax.ejb.Stateles;
    
    @Stateless
    public class HolaMundoEJB {
    
        //Metodo de negocio
        public int sumar(int a, int b) {
            return a + b;
        }
    
                    Cliente EJB vía JNDI
    
    JNDI es un API que permite encontrar servicios o recursos empresariales en un
    servidor de aplicaciones Java
    
    Para encontrar un EJB a partir de la version 3.1 podemos utilizar la siguiente sintaxis:
        java:global[/<app-name>]/<module-name>[!<fully-qualified-interface-name>]
    
           
                    Inyeccion de dependencias
    
    Existen 2 tipos de inyeccion de dependencias en EJB:
    
        A)Utilizando la anotacion  @EJB
        B)Utilizando la anotacion  @Inject
    
    
                    EJB Lite
    Los EJB lite son ejb que no cuentan con todas las librerias de un EJB normal, solo a los mas comunes
    

                    Empaquetamiento de un EJB
    
    Componentes como los EJB, servlet, paginas JSF, deben empaquetarse para ser desplegados
    en el servidor de aplicaciones Java
    
    Los modulos EJB se depositan en META/ejb-jar.xml y en WEB-INF/ejb-jar.xml
    
    EJB lite puede empaquetarse ditectamente en un archivo war o un archivo Java
    
    
                    Contenedor embebido de JAVA EE
    Un contenedor embebido tiene como finalidad proveer de un ambiente de ejecución JavaEE
    Un contendor embebido nos permite realizar pruebas unitarias de nuestros componentes empresariales
    
                    JNDI (Java Naming & and Ditectoy Interface)
    JNDI nos permite ubicar los componentes que tenemood en el servidor de glassfish y utilizarlos por ejemplo desde nuestro cliente
    
    
    */
    
}

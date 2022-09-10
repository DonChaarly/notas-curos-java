package notas;

public class TeoriaSeguridadEnJavaEE {
    
    /*
    
                            
                            SEGURIDAD EN JAVA EMPRESARIAL
    
    La seguridad debe agregarse a cada una de las capas, por ejemplo, la capa de presentacion, la capa de negocio o la capa de acceso a daatos
    y dependiendo del tipo de seguridad que necesite nuestra aplicacion deberemos asegurar cada una de las capas, debemos garantizar un acceso seguro
    a cada una de las capas de nuestra aplicacion
    
    se puede agregar seguridad a nuestras capas utilizando adecuadamente el API de seguridad de Java EE
    Al utilizar EJB se simplifica la manera de agregar seguridad a los metodos
    Se puede utilizar el concepto de seguridad declarativa y seguridad programatica
    
                Conceptos basicos de la seguridad de un sistema
    Autenticacion: Es proceso de verificar la identidad del usuario, por ejemplo por medio de un usuario y contraseña 
                   (credenciales) o por medios biometricos como huella retina, etc.
                   La autenticacion se debe realizar antes de la autorizacion
    Autorizacion:  Verificacion de los permisos del usuario al ejecutar cierta funcionalidad del sistema
    
    
    
                Usuarios, Grupos y Roles
    
    Estos son conceptos interrealcionados que conformar la base del esquema de seguridad  en un sistema empresarial
    
    Para simplificar la autorizacion, los usuarios son separados en grupos 
    Usuarios: Todos aquellos con acceso a la aplicacion
    Grupos: particion logica para la identificacion de usurarios los cuales pueden tener acceso a distintos recursos
    Roles: Funcionalides a las que pueden acceder los usuarios. Este concepto esta mas ligado a la aplicacion que se esta relacionando  
           Permite relacionar los grupos de una organizacion en entidades que entienda y procese correctamente la aplicacion
    
   
    
                Autenticacion y Autorizacion en Java EE
    
    La seguridad en Java EE esta basada ampliamente en el API de JAAS que significa Java Authentication and Authorization Service, esta api
    es la encargada de la autenticacion de los usuarrion y autorizacion de recursos de los sistemas Java EE
    
    Una vez autenticado un usuario se procede con la autorizacion para saber que recursos puede utilizar dentro de la aplicacion, para ello se 
    propaga el objeto "principal" autenticado a las demas capas, el cual es creado por el API de JAAS, esto para evitar el proceso de 
    autenticacion por cada una de las capas de manera individual
    
    
                Asegurando la capa Web
    
    La seguridad de esta capa se realiza a traves del archivo de escritor web.xml
    Existen distintos tipos de autenticacion:
        Http BASIC: Bastante generico, solicita el usuario y password
        HTTP DAGIST
        HTTP CLIENT SERT    
        FONT BASE:Es posible personalizar la capa de presentacion   
    
    //login-config nos permite especificar la forma en la que el contenedor web recuperara la informacion para poder autenticar a los usuarios 
    <login-config>
        <auth-method>BASIC</auth-method>
        <realm-name>Login in</real-name> //El realm-name es una abstraction del servidor de aplicaciones donde se explican las politicas de seguridad del sistema, un real contiene una coleccion de usuarios, el realm, se configura utilizando las herramietnas del administrador de servidores en cuestion
    </login-config>
    
    //security-constrain nos permite especificar los recursos o url a los cuales agregaremos seguridad, asi como los roles que  participaran en la revision de la seguridada, es posible tambien especificar el tipo de metodo HTTP que se permitira ejecutar (GET, POST, DELETE, etc)
    <security-constrain>
        <web-resource-collection>
            <web-resource-name>Aplicacion WEB JSF</web-resource-name>
            <url-pattern>/*</url-pattern> //En el url-pattern especificamos las paginas a asgurar
        </web-resource-collection>
    
        <auth-constrain> //Con auth-constrain esecificamos los roles permitidos para ejecutar los recursos especificado
            <role-name>ROLE_ADMIN</role-name>
            <role-name>ROLE_USER</role-name>
        </auth-constrain>
    </security-constraint>
    
    
                    Seguridad en JSF primefaces
    
    Con JSF y PrimeFaces podemos habilitar o desabilitar funicionalidad incluso a nivel de componentes dependiendo del rol del usuario que se haya autenticado
    
    Opciones para restingir componentes en una página JSF con la extencion de PrimeFaces:
    
    #{p:ifGranted('ROLE_ADMIN')}
    #{p:ifAllGaranted('ROLE-ADMIN, ROLE_EDITOR')}
    #{p:ifAnyGaranted('ROLE_USER, ROLE_ADMIN')}
    #{p:ifNotGaranted('ROLE_GUEST')}
    #{p:remoteUser()}
    #{p:userPrincipal()}
    
    Algunos ejemplos de su uso en las páginas JSF son:
    
    <h:commanButton value="Eliminar Persona" rendered="#{p:ifGranted('ROLE_ADMIN')}" /> //Se habilita el boton para los ADMIN
    
    <h:commanButton value="Reporte General" disable="#{p:ifNotGranted('ROLE_USER, ROLE_ADMIN')}" /> //No aparece el boton si el usuario no pertenece a cierto rol
    
    
    
                    Tipos de seguridad en la capa EJB
    
    Al momento de agregar seguridad a los EJB, exisen 2 tipos:
    
    Seguridad declarativa: En la cual indicamos al contenedor el tipo de validacion deseada, a través de anotaciones o archivos de configuracion .xml
    
        El contenedor se hace cargo de la mayoria de las tareas de validacion, autenticacion y autorizacion
    
    Seguridad programatica: Existen situaciones en las que necesitamos un mayor conrtrol sobre la forma en que se realiza la autenticacion y/o autorizacion
                            por ejemplo a nivel de usuario o grupo.
    
        La seguridad programatica se puede combinar con la programacion declarativa para incrementar el control sobre los requerimientos de seguridad en el sistema
    
    
                    Anotaciones en la capa EJB
    
    Para la SEguirdad DEclarativa tenemos las siguientes Anotaciones disponibles
    en los componentes EJB:
    
    @DeclareRoles: Esta anotación lista los roles que se utilizarán en el EJB. Solamente
    se puede ustilizar a nivel de la clase.
    
    @Roles Allowed: Permite ejecutar los métodos del EJB siempre y cuando los roles se
    encuentren listados en esta anotación. Se puede definir al nivel de la clase o a nivel del método.
    
    @PermitAll: Como su nombre lo indica, permite a cualquier usuario ejecutar el método EJB anotado.
    
    @DenyAll: Como su nombre lo indica, prohíbe a cualquier usuario ejecutar este método.
    
    @RunAs: Permite ejecutar el método como si el usuario tuviera otro rol, únicamente durante la ejecución 
    de dicho método.
    
    
                Algunos Tipos de clientes en Java EE
    
    clientes:
        JSF
        Cliente RMI
        Web Service SOAP
        Web Service REST
    
    
    
    En el archivo 88.1 se modificaron los documentos
    
    PersonaServiceImpl
    web.xml
    index.xhtml
    
    se agrego el archivo glassfish-ejb-jsr.xml (Para dar acceso al arvhivo 88.4)
    
    Tambien se tiene que ir a la consola de glassfish en server configuration, 
    security, realms, file, manage users y ahi es donde se crean los usuarios
    y asignamos los roles
    
    
    En el archivo 88.2 se modificaron los documentos
    
    pom.xml
    Se agrego un Empty file llamado login.conf (En este archivo se escribe la configuracion para poder pasar la seguridad del EJB, para podernos conectar utilizando el concepto de seguridad
    Se agrega la clase persona
    Se agrega la interface PesonaServiceRemote
    Se agrega la clase de ClientePersonaService
    
    En el archivo 88.3 se modificaron los documentos
    
    PruebaRestWs
    
    En el archivo 88.4 se modificaron los documentos
    
    TestPersonaServiceWs
    
    
    
    
    
    
    
    
    
    */
    
}

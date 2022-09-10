package notas;

public class TeoriaJavaBeansConJSP {
    
    /*
                Manejo de JavaBeans con JSP´s
    Los JSP´s pueden acceder a los JavaBeans
    Un JavABean es una clase Java que sigue ciertas reglas basicas:
        Debe tener un constructor vacío
        Todos los atributos deben ser privados
        Se debe general el metodo get y set para cada uno de los atributos
    Un JSP debe utilizar el nombre de la propiedad para poder acceder o modificar 
    el atributo de un JavaBean
    Indirectamente el JSP manda a llamar el metodo get o set asociado con la propiedad
    indicada en el JSP
    
            Ejemplos de propiedades de JavaBean
    Nombre de propiedad     Nombre de los metodos       Codigos en el JSP
    nombreUsuario           getNombreUsuario()          <jsp:getProperty...property="nombreUsuario"/>
                            setNombreUsuario()          <jsp:setProperty...property="nombreUsuario"/>
    
    eliminado (boolena)     isEliminado()               <jsp:getProperty...property="eliminado"/>
                            setEliminado()              <jsp:setProperty...property="eliminado"/>
    
    noTelefono              getTelefono()               <jsp:getProperty...property="telefono"/>
                            setTelefono()               <jsp:setProperty...property="telefono"/>
    
    codigo_postal           getCodigo_postal()          <jsp:getProperty...property="codigo_postal"/>
                            setCodigo_postal()          <jsp:setProperty...property="codigo_postal"/>
    
            Alcance de atributos en un JSP (SCOPE)
    Orden de menos alcance a mayor alcance:
    page: El atributo va a existir unicamente durante el tiempo en que se traduce el JSP hacia el servlet
    request: El atributo va a existir unicamente durante el tiempo en que el usuario haga una peticion hacia el servidor web
    session: El atribuyto va a durar durante distintas peticiones hacia el servidor web por lo menos durante 30 min de la ultima peticion a menos que cofiguremos este tiempo
    application: El atributo va a existir durante todo el tiempo en que esta arriba nuestra aplicacion o hasta que hagamos un undeploy
    
            Uso basico de los JavaBeans
    jsp:useBean ->Permite acceder a un bean en un alcance (scope) especificado (el alcance por default es page)
        <jsp:useBean id="nombreUsuario" class="paquete.NombreClase" />
    jsp:setProperty -> Permite modificar una o varias variables propiedades de un JavaBean especifico
        <jsp:setProperty name="nombreUsuario" property="nombreUsuario" value="Juan" />
    jsp:getProperty -> Permite acceder a una propiedad de un bean especifico
        <jsp:getProperty name="nombreUusario" property="nombreUsuario" />
    
    
    
    */
    
}

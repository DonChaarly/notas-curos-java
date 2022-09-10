package test;

import domain.Persona;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class PruebaRestWs {
    
    public static void main(String[] args) {
        //Se pasa la autenticacion http
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder().nonPreemptive().credentials("admin", "admin").build();
        //Realizamos la configuracion del cliente
        ClientConfig clientConfig = new ClientConfig();
        //mandamos a llamar el metodo register para registrar la configuracion "feature" que hemos configurado
        clientConfig.register(feature);
        
        //Declaramos el cliente para que finalmente pueda registar la configuracion que hemos hecho 
        Client cliente = ClientBuilder.newClient(clientConfig);
        
        //Hacemos la llamada a nuestro cliente y al metodo por default de listar personas
        WebTarget webTarget = cliente.target("http://localhost:8080/88.1SeguridadEnJavaEE/webservice").path("/personas");
        //Proporcionamos un id valido
        Persona persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);
    }     
    
}

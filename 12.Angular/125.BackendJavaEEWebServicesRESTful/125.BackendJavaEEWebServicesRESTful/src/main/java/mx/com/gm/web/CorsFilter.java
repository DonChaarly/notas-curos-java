package mx.com.gm.web;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;

//Se agrega la anotacion provider, esto es parte de la implementacion del filtro cors 
@Provider
public class CorsFilter implements ContainerResponseFilter{

    @Override
    public void filter(ContainerRequestContext crc, ContainerResponseContext crc1) throws IOException {
        //125 Se agrega lo siguiente para definir la politica de cors filter
        MultivaluedMap<String, Object> headers = crc1.getHeaders();
        //125 Agregamos mas cabeceros y las URL que queremos que acceda, colocamos * para especificar que queremos que acceda a todas
        headers.add("Access-Control-Allow-Origin", "*");
        //125 Especificamos el uso de credenciales
        headers.add("Access-Control-Allow-Credentials", "true");
        //125 Especificamos los cabeceros permitidos
        headers.add("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, Authorization");
        //125 Especificamos los metodos que vamos a permitir que se ejecuten sobre el servicio web
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
    }
    
}

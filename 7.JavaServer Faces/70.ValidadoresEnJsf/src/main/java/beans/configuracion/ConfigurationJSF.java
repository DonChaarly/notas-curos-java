//Este codigo que agrega para indicar a glassfish que vamos a utilizar la ultima version de JavaServer Faces
package beans.configuracion;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

@FacesConfig(
        //Activa el CDI build-in beans
        version = JSF_2_3
)
@ApplicationScoped
public class ConfigurationJSF {
    
}

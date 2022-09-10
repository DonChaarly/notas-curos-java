//Se agrega esta clase para crear un objeto e indicar que se utilizara la version de javaServerFaces 2.3
package mx.com.gm.sga.web;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

@FacesConfig(
        version=JSF_2_3
)
@ApplicationScoped
public class ConfiguracionBean {
    
}

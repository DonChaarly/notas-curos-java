//Se agrega esta clase para crear un objeto e indicar que se utilizara la version de javaServerFaces 2.3
package mx.com.gm.sga.web;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;

@FacesConfig(
        version=FacesConfig.Version.JSF_2_3
)
@ApplicationScoped
public class ConfiguracionBean {
    
}

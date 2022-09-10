package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class VacanteForm {
    
    //Hacemos una inyeccion de nuestro bean Candidato para poder utilizarlo en esta clase
    @Inject
    private Candidato candidato;
    
    //Hacemos un metodo set para modificar el valor de candidato
    public void setCandidato(Candidato candidato){
        this.candidato = candidato;
    }
    
    //Agrgamos un codigo para redirigir la pagina en caso de que el candidato se llame Juan o no
    public String enviar(){
        if(this.candidato.getNombre().equals("Juan")){
            //No es necesario indicar la extencion de la pagina, ya que en automatico se va a buscar una pagina con el siguiente nombre
            return "exito";
        }else{
            return "fallo";
        }
    }
    
}

package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

//Para que la clase sea reconocida por el freamwork de JavaServer Faces se coloca la siguiente anotacion
@Named
//Y se especifica el alcance con otra anotacion
@RequestScoped
public class Candidato {
    //Como mencionamos, los managed bean son comolos java beans, deben tener sus atributos en privado con su getter y setter y un contructor vacio
    private String nombre = "Introduce tu nombre";

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

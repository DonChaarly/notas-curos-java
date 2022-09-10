package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped
public class Candidato {
    private String nombre;
    
    //Agregamos los atributos de apellido y salario deseado
    private String apellido;
    private String salarioDeseado;
    
    Logger log = LogManager.getRootLogger();
    
    //Construimos un constructor vacio para inicializar los atriutos
    public Candidato(){
        log.info("Creando el objeto candidato");
        this.setNombre("Introduce tu nombre");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        //Se utiliza la variable log para indicar en el nivel de info que se esta modificando la variable de nomre
        log.info("Modificando la propiedad de nombre: " + this.nombre);
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        log.info("Modificando la propiedad de apellido: " + this.apellido);
    }

    public String getSalarioDeseado() {
        return this.salarioDeseado;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        this.salarioDeseado = salarioDeseado;
        log.info("Modificando la propiedad de salario deseado: " + this.getSalarioDeseado());
    }
    
    
}

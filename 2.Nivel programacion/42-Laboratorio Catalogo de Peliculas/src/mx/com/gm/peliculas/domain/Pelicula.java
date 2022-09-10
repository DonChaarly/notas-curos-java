
package mx.com.gm.peliculas.domain;

public class Pelicula {
    //Atributos
    private String nombre;
    
    //Constructores
    public Pelicula(){   
    }
    
    public Pelicula(String nombre){
        this.nombre = nombre;
    }
    
    //Codigo get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Codigo toString
    @Override
    public String toString() {
        return this.nombre;
    }
}

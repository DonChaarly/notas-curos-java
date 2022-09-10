package domain;

public class Persona {
    //atributos
    private String nombre;

    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //codigo get and set
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}

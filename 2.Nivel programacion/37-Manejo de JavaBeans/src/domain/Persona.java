package domain;

import java.io.Serializable;
/*
para ser una clase JavaBean, debe tener ciertas caracteristicas
debe tener un constructor vacio
cada atributo debe ser privado y tener un codigo get y set
debe implementar una iterfaz llamada serializable
(Seralizable nos permite enviar nuestra clase entre diferentes dispositivos)
*/
public class Persona implements Serializable{
    //Atributos privados
    private String nombre;
    private String apellido;
    
    //Constructor vacio
    public Persona(){
        
    }
    //Agregar mas constructores no es necesario
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
            
    //Metodos get y set

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //No es necesario los metodos toString equals o hash code

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append('}');
        return sb.toString();
    }
    
    
}

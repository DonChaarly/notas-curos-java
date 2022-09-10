package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;

//125 Se coloca la anotacion de Entity para convertir esta clase en una clase de entidad
@Entity
//125 Se agregan unos name Queries donde vamos a especiaficar algunos query para ejecutar en la base de datos 
@NamedQueries({
    @NamedQuery(name = "Persona.encontrarTodasPersonas", query = "SELECT p from Persona p ORDER BY p.idPersona")
})
//125 Debido a que la clase puede enviarse a traves de la red tiene que implementar la clase serializable
public class Persona implements Serializable{
    
    //125 Se definen los atributos de la clase
    
    /*
      125 la anotcion de Id especifica que el atriuto es la llave primaria
          GeneretedValue para especificar la estrategia de identidad y que la base de datos se encarga de generar esta llave primaria 
          column para especificar el verdadero nombre del atributo en la base de datos
    */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private int idPersona;
    
    private String nombre;
    
    //125 Se colocan los constructores vacio, con idPersona y con todos los argumentos
    public Persona(){
        
    }
    public Persona(int idPersona){
        this.idPersona = idPersona;
    }
    public Persona(int idPersona, String nombre){
        this.idPersona = idPersona;
        this.nombre = nombre;
    }
    
    //125 codigos get and set
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //125 codigo toString
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

    
    
    
    
}

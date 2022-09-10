//Esta clase va a mapear con cada uno de nuestros registros

package mx.com.gm.sga.domain;


import java.io.Serializable;
import javax.persistence.*;

//Convertimos esta clase a una de entidad para poder interactuar con el jpa hacia la base de datos
@Entity
//Se utiliza un Query para recuperar todos los objetos persona de la base de datos
@NamedQueries({
    //Se define el nombre con el que llamaremos al query y posteriormente definimos el query
    //El query no esta en lenguaje SQL sino en JPQL, asi no se recupera columnas de la tabla de persona sino objetos completos
    //El quety va a ser un SLECT, definimos el alias para el objeto persona, indicamos la clase que vamos a recuperar, definimos un alias para la clase persona e indicamos que ordene los objetos por el id
    @NamedQuery(name="Persona.findAll", query="SELECT p FROM Persona p ORDER BY p.idPersona")
})
//Si el nombre de la tabla no coincide con el nombre de la clase Java se agrega la siguiente anotacion
//indicamos el nombre de la tabla de la base de datos
@Table(name="persona")
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    
   //Configuramos la llave primaria que es el idPersona
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name="id_persona")
    private int idPersona;
 
    //Agregamos los siguientes campos
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }

}

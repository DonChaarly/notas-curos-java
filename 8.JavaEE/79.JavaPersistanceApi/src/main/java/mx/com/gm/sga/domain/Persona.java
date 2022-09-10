//Esta clase va a mapear con cada uno de nuestros registros

package mx.com.gm.sga.domain;


import java.io.Serializable;
import javax.persistence.*;

//Convertimos esta clase a una de entidad para poder interactuar con el jpa hacia la base de datos 
@Entity
public class Persona implements Serializable{
    private static final long serialVersionUID = 1L;
    
   //Configuramos la llave primaria que es el idPersona
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name="id_persona")
    private int idPersona;
 
    //Agregamos los siguientes campos
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido_paterno, String apellido_materno, String email, String telefono) {
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
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

    public String getApellidoPaterno() {
        return apellido_paterno;
    }

    public void setApellidoPaterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }
    
    public String getApellidoMaterno() {
        return apellido_materno;
    }

    public void setApellidoMaterno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
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
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido_paterno=" + apellido_paterno + ", apellido_materno=" + apellido_materno + ", email=" + email + ", telefono=" + telefono + '}';
    }

}

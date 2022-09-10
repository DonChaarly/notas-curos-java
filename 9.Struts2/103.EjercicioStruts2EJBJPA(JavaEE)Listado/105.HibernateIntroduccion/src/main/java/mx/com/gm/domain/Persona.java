package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;

//Se agrega la anotación de Entity para que el api de JPA identifique que esta clase es una entidad
//Se puede colocar otra anotacion en caso de que no se encuentre la tabla de base de datos debido a las mayusculas y minuculas
//Tambien se implementa la interfaz de serializable
@Entity
@Table(name="persona")
public class Persona implements Serializable{
    
    //Se debe crear un objeto serializable para poder implementar corrctamente la interfaz de Serializabel
    private static final long serialVersionUID = 1L;
    
    //Se definen los campos de la clase
    
    //Se coloca la anotacion de column cuando el nombre que se le va a dar al atributo en java no corresponde al que tiene en la base de datos
    //Se coloca la anotacion de id para indicar que el atributo corresponde al id o llave primaria en la base de datos
    @Column(name="id_persona")
    @Id
    private int idPersona;
    
    private String nombre;
    
    @Column(name="apellido_paterno")
    private String apellidoPaterno;
    
    @Column(name="apellido_materno")
    private String apellidoMaterno;
    
    private String email;
    
    private String telefono;
    
    //Se define un constructor vacio
    public Persona() {
    }
    
    //Se implementan los metodos de getter and setter

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
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
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
    
    
    //Se implementa el metodo toString
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}

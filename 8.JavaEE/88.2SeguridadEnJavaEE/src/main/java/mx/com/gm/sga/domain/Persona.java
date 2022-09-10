//Esta clase no requiere tanta complegidad, simplemente es un JavaBean que utilizaremos para recibir la informacion del servidor
package mx.com.gm.sga.domain;

import java.io.Serializable;

//Se debe implementar la interface serializable ya que se va a enviar a traves de la red del cliente al servidor
public class Persona implements Serializable{
    
    //Se agrega esta variable ya que lo requiere la interface
    private static final long serialVersionUID = 1L;
    
    //Se agrega lo necesario de la clase persona
    private Integer idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;    
    
    public Persona(){
        
    }
    
    public Persona(Integer idPersona){
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
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

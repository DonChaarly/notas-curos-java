/*
Esta clase puede ser creada automaticamente con base de datos
    Para crearla se selecciono new, Entity Class from database
Esta clase va a mapear con cada uno de nuestros registros
*/
package mx.com.gm.capadatos.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

//Se coloca la anotacion de entity para convertit esta clase en una identidad y de esta forma interactuar con el jpa hacia la base de datos
@Entity
//Debido a que el cliente va a utilizar esta clase y va a mandar a llamar de manera remota esta clase, entonces necesita serializarse para poder enviarse del servidor al cliente
public class Persona implements Serializable{
    
    //Agregamos un atributo statico y final llamado serialVersionUID, esto nos requiere la interface de serializable
    private static final long serialVersionUID = 1L;
    
    //Configuramos la llave primaria que es el idPersona
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_persona")
    private Long idPersona;
    
    private String nombre;
    
    @Column (name = "apellido_paterno")
    private String apellidoPaterno;
    
    @Column (name = "apellido_materno")
    private String apellidoMaterno;
    
    private String email;

    
    public Persona() {
        
    }

    public Persona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
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

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" 
                + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
                + ", email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.idPersona);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.idPersona, other.idPersona)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}

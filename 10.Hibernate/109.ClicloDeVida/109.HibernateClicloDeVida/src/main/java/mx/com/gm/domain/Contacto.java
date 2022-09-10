package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Contacto implements Serializable {
    
    //Se crea un atributo Serializable para implementar correctamente la interface
    private static final long serialVersionUID = 1L;
    
    //Se agrega la llave primaria, se puede manejar el tipo primitivo int o el objeo Integer para poder manejar el valor de null
    //Anotacion Id para indicar que el atributo sera la llave primaria
    //Anotacion GeneratedValue para indicar el tipo de llave primaria que se va a generar, con el valor de identity indicamos que la base de datos es la que va a generar la llave(no es necesario colocar la anotacion)
    //Anotacion Column para indicar el nombre que se tiene en la base de datos, ya que el nombre en java no corresponde
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_contacto")
    private Integer idContacto;
    //Se agregan los demas atributos
    private String telefono;
    private String email;

    //Constructor vacio
    public Contacto() {
    }
    
    //Contructor con el id
    public Contacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    //Metodos get and set
    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Contacto{" + "idContacto=" + idContacto + ", telefono=" + telefono + ", email=" + email + '}';
    }

    //Metodos equals and hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idContacto);
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
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.idContacto, other.idContacto)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}

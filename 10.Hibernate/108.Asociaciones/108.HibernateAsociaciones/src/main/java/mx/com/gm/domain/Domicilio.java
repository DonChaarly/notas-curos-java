package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

//La anotacion de Entity es para indicar que la clase se trata de una entidad
//Se implementa la interfaz Serializable
@Entity
public class Domicilio implements Serializable{
    
    //Se crea un atributo Serializable para implementar correctamente la interface
    private static final long serialVersionUID = 1L;
    
    //Se agrega la llave primaria, se puede manejar el tipo primitivo int o el objeo Integer para poder manejar el valor de null
    //Anotacion Id para indicar que el atributo sera la llave primaria
    //Anotacion GeneratedValue para indicar el tipo de llave primaria que se va a generar, con el valor de identity indicamos que la base de datos es la que va a generar la llave(no es necesario colocar la anotacion)
    //Anotacion Column para indicar el nombre que se tiene en la base de datos, ya que el nombre en java no corresponde
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_domicilio")
    private Integer idDomicilio;
    //Se agregan los demas atributos
    private String calle;
    @Column(name="no_calle")
    private String noCalle;
    private String pais;
    
    //Se agrega un constructor vacio para cumplir con el estandar de los JavaBeans
    public Domicilio(){
        
    }
    
    //Se agrega un constructor para manejar la llave primaria
    public Domicilio(Integer idDomicilio){
        this.idDomicilio = idDomicilio;
    }
    
    //Metodos get y set
    public Integer getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Integer idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNoCalle() {
        return noCalle;
    }

    public void setNoCalle(String noCalle) {
        this.noCalle = noCalle;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Domicilio{" + "idDomicilio=" + idDomicilio + ", calle=" + calle + ", noCalle=" + noCalle + ", pais=" + pais + '}';
    }
    
    
    //Se agrega tambien el metodo de equals y hashcode debido a que las clases pueden agregarse a colecciones tambien
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idDomicilio);
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
        final Domicilio other = (Domicilio) obj;
        if (!Objects.equals(this.idDomicilio, other.idDomicilio)) {
            return false;
        }
        return true;
    }
    
    
    
}

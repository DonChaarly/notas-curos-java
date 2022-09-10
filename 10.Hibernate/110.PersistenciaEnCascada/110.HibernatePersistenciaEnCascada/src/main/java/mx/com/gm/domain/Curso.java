package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Curso implements Serializable{
    
    //Se crea un atributo Serializable para implementar correctamente la interface
    private static final long serialVersionUID = 1L;
    
    //Se agrega la llave primaria, se puede manejar el tipo primitivo int o el objeo Integer para poder manejar el valor de null
    //Anotacion Id para indicar que el atributo sera la llave primaria
    //Anotacion GeneratedValue para indicar el tipo de llave primaria que se va a generar, con el valor de identity indicamos que la base de datos es la que va a generar la llave(no es necesario colocar la anotacion)
    //Anotacion Column para indicar el nombre que se tiene en la base de datos, ya que el nombre en java no corresponde
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_curso")
    private Integer idCurso;
    //Se agregan los demas atributos
    private String nombre;
    private Double precio;
    
    //Se agrega la relacion con la clase de asignacion la cual sera de uno a muchos y tendra que guardarse en una lista
    //Se agrega la anotacion de OneToMany y se indica el nombre del atributo con el cual esta relacionado en la otra clase
    //Al tratarse de un mapeo en ambos sentidos en la clase de alumno y en la de asignacion, estamos manejando una mapeo bidireccional
    @OneToMany(mappedBy = "curso")
    private List<Asignacion> asignaciones;

    //Constructor vacio
    public Curso() {
    }

    //Constructor con el id
    public Curso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    //Metodos get and set
    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }
    
    //Metodo toString
    //No vamos a incluir la lista de la clase asignacion ya que esto haria que se pese el proceso del toString al tener que imprimir todos los valores de la lista
    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", nombre=" + nombre + ", precio=" + precio + '}';
    }

    //Metodos equals and hascode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idCurso);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.idCurso, other.idCurso)) {
            return false;
        }
        return true;
    }
    
    
}

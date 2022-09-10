package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Alumno implements Serializable{
    
    //Se crea un atributo Serializable para implementar correctamente la interface
    private static final long serialVersionUID = 1L;
    
    //Se agrega la llave primaria, se puede manejar el tipo primitivo int o el objeo Integer para poder manejar el valor de null
    //Anotacion Id para indicar que el atributo sera la llave primaria
    //Anotacion GeneratedValue para indicar el tipo de llave primaria que se va a generar, con el valor de identity indicamos que la base de datos es la que va a generar la llave(no es necesario colocar la anotacion)
    //Anotacion Column para indicar el nombre que se tiene en la base de datos, ya que el nombre en java no corresponde
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_alumno")
    private Integer idAlumno;
    
    //Se definien los atributos que estan relacionados con la tabla de contacto y domicilio
    //Se Agrega la anotacion de ManyToOne para indicar la relacion
    //Se agrega la anotacion si es que no coincide los nombres de las llaves primarias y foranias (En este casi si coinciden pero igual lo implementamos)
    @JoinColumn(name="id_domicilio", referencedColumnName = "id_domicilio")
    @ManyToOne
    private Domicilio domicilio;
    @JoinColumn(name="id_contacto", referencedColumnName = "id_contacto")
    @ManyToOne
    private Contacto contacto;
    
    //Se agrega la relacion con la clase de asignacion la cual sera de uno a muchos y tendra que guardarse en una lista
    //Se agrega la anotacion de OneToMany y se indica el nombre del atributo con el cual esta relacionado en la otra clase
    //Al tratarse de un mapeo en ambos sentidos en la clase de alumno y en la de asignacion, estamos manejando una mapeo bidireccional
    @OneToMany(mappedBy ="alumno")
    private List<Asignacion> asignaciones;

    //Se agregan los demas atributos
    private String nombre;
    private String apellido;

    //Constructor vacio
    public Alumno() {
    }

    //Constructor con id
    public Alumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    //Metodos get and set
    public Integer getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Integer idAlumno) {
        this.idAlumno = idAlumno;
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

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
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
        return "Alumno{" + "idAlumno=" + idAlumno + ", domicilio=" + domicilio + ", contacto=" + contacto + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    //Metodos equals y hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.idAlumno);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.idAlumno, other.idAlumno)) {
            return false;
        }
        return true;
    }
    
    
    
    
}

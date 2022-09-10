package mx.com.gm.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
public class Asignacion implements Serializable{
    
    //Se crea un atributo Serializable para implementar correctamente la interface
    private static final long serialVersionUID = 1L;
    
    //Se agrega la llave primaria, se puede manejar el tipo primitivo int o el objeo Integer para poder manejar el valor de null
    //Anotacion Id para indicar que el atributo sera la llave primaria
    //Anotacion GeneratedValue para indicar el tipo de llave primaria que se va a generar, con el valor de identity indicamos que la base de datos es la que va a generar la llave(no es necesario colocar la anotacion)
    //Anotacion Column para indicar el nombre que se tiene en la base de datos, ya que el nombre en java no corresponde
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_asignacion")
    private Integer idAsignacion;
    
    //Se definien los atributos que estan relacionados con la tabla de curso y alumno
    //Se Agrega la anotacion de ManyToOne para indicar la relacion
    //Se agrega la anotacion si es que no coincide los nombres de las llaves primarias y foranias (En este caso si coinciden pero igual lo implementamos)
    @JoinColumn(name="id_alumno", referencedColumnName = "id_alumno")
    @ManyToOne
    private Alumno alumno;
    @JoinColumn(name="id_curso", referencedColumnName = "id_curso")
    @ManyToOne 
    private Curso curso;
    
    private String turno;
    
    //Constructor vacio
    public Asignacion() {
    }
    
    //Construcor con id
    public Asignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }
    
    //Metodos get and set
    public Integer getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Integer idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Asignacion{" + "idAsignacion=" + idAsignacion + ", alumno=" + alumno + ", curso=" + curso + ", turno=" + turno + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idAsignacion);
        return hash;
    }

    //Metodos equals and hashcode
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
        final Asignacion other = (Asignacion) obj;
        if (!Objects.equals(this.idAsignacion, other.idAsignacion)) {
            return false;
        }
        return true;
    }
    
    
    
}

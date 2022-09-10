package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

//121 Entity es para que spring reconozca la clase como de entidad, Data es para que lombook nos ahorre el trabajo de colocar los metodos get&set y Table es para especificial el nombre de la tabla en MySql
@Entity
@Data
@Table(name = "rol")
public class Rol implements Serializable{
    private static final long serialVersionUID =1L;
    
    //121 Especificamos la llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;
    
    //121 Agregamos los demas atributos
    //121 Agregamos la validacion de que el campo no puede ser vacio o null
    @NotEmpty
    private String nombre;
    
    
}

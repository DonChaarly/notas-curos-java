package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;


//113 La dependencia de lombook nos facilita la creacion de clases de dominio, con este proyecto ya no tenemos que agregar los metodos de get, set toString etc.
//113 Solo tenemos que agregar la notacionde Data
@Data
//114 Agregamos la anotacion de entity de hibernate para que reconozca esta clase como una entidad 
@Entity
//114 Agregamos la anotacion de table para indicar el nombre que tiene la tabla den la base de datos por si el nonmbre de la clase no corresponde
@Table(name = "persona")
//114 Implementamos tambien la interface de serializable
public class Persona implements Serializable{
    
    //114 Se debe agregar la siguietne constante para la implementacion de seriazable
    private static final long serialVersionUID = 1L;
    
    //114 Debemos mapear la llave primaria, para ello se agrega las anotaciones de Id y GeneratedValue
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String email;
    private String telefono;
            
    
}

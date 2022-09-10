package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

//121 Entity es para que spring reconozca la clase como de entidad, Data es para que lombook nos ahorre el trabajo de colocar los metodos get&set etc y Table es para especificial el nombre de la tabla en MySql
@Entity
@Data
@Table(name = "usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID =1L;
    
    //121 Especificamos la llave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idUsuario;
    
    //121 Agregamos los demas atributos
    //121 Agregamos la validacion para que no pueda ser vacio ni null
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    
    //121 Se hace el mapeo entre la clase de usuario y de rol y especificamos cual es la comuna que se va relacionar entre la tabla de usuario y rol
    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<Rol> roles;
    
    

    
}

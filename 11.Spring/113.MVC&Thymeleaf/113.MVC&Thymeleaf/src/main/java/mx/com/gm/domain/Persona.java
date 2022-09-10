package mx.com.gm.domain;

import lombok.Data;

//La dependencia de lombook nos facilita la creacion de clases de dominio, con este proyecto ya no tenemos que agregar los metodos de get, set toString etc.
//Solo tenemos que agregar la notacionde Data
@Data
public class Persona {
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
            
    
}

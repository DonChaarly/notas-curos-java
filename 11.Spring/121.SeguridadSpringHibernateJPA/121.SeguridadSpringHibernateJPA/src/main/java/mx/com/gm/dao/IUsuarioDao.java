package mx.com.gm.dao;


import mx.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/*  121 Al extender de la clase JpaRepository ya no vamos a tener que crear los metodos insertar, listar, actualizar, eliminar, etc
    Tampoco es necesario crear una implemenatcion, springboot creara una por default
    Si queremos crear otros metodos aparte de los que trae la crud, podemos hacerlo 
    Debido a que la clase JpaRepository es un tipo generico, se debe indicar cual es el tipo de identidad que va a manejar y el tipo de llave primaria que va a manejar
*/
public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
    
    //121 Creamos un metodo findByUserName el cual es parte de la seguridad de spring y debe tener este nombre
    Usuario findByUsername(String username);
    
}

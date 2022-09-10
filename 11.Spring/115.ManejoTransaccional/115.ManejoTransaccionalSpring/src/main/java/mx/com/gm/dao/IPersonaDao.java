package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

/*  114 Al extender de la clase CrudRepository ya no vamos a tener que crear los metodos insertar, listar, actualizar, eliminar, etc
    Tampoco es necesario crear una implemenatcion, springboot creara una por default
    Si queremos crear otros metodos aparte de los que trae la crud, podemos hacerlo 
    Debido a que la clase CrudRepository es un tipo generico, se debe indicar cual es el tipo de identidad que va a manejar y el tipo de llave primaria que va a manejar
*/
public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
    
}

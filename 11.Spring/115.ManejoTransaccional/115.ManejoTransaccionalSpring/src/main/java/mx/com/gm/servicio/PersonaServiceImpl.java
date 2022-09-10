package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.IPersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//115 Se coloca la anotacion de Service par que spring reconozca la clase como de servicio
@Service
public class PersonaServiceImpl implements IPersonaService {

    //115 Creamos una instancia de la clase IPersonaDao para implementar sus meotdos y colocamos la anotacion de Autowired para inyectarla
    @Autowired
    private IPersonaDao personaDao;
    
    /*
    115 Debido a que podriamos estar ejecutando distintas operaciones de tipo Dao 
    en la misma clase de servicio, podriamos estar realizando distintas operaciones 
    sobre varias tablas en la base de datos
    Por ello los metodos hay que marcarlos como transaccionales ya que en caso de error 
    se tiene que hacer un rollback y no guardar ninguna informacion en ninguna tabla
    y en caso de que todo sea exitoso se tiene que hacer un commit
    */
    
    //115 Debido a que este  metodo solo lee informacion se marca como readOnly=true
    @Override
    @Transactional(readOnly = true)
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    //115 Este metodo si va a modificar informacion en la base de datos por ello no se especifica ningun parametro
    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        //115 El metodo findById regresa un tipo Optional con lo cual podemos decidir que hacer en caso que el valor regresado sea de tipo null, como regresar una exception o simplemente regresar null
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
    
}

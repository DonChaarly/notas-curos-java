package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.*;
import mx.com.gm.domain.*;

public class ServicioAlumno {
    
    //Se Crea una instancia de la clase dao de alumno para poder utilizar sus metodos
    AlumnoDAO alumnoDao = new AlumnoDAO();
    
    //Se agregan los meotods de listar, guardar, eliminar y encontrar
    public List<Alumno> listarAlumnos(){
        return alumnoDao.listar();
    }
    
    public void guardarAlumno(Alumno alumno){
        //Comprobamos que el alumno no es null y que no se ha creado, osea que el id es null
        if(alumno != null && alumno.getIdAlumno() == null){
            alumnoDao.insertar(alumno);
        }
        //De lo contrario se hace un update en la base de datos, ya que ya se ha creado con anterioridad
        else{
            alumnoDao.actualizar(alumno);
        } 
    }
    
    public void eliminarAlumno(Alumno alumno){
        alumnoDao.eliminar(alumno);
    }
    
    public Alumno encontarAlumno(Alumno alumno){
        return alumnoDao.buscarPorId(alumno);
    }
    
    
    
}

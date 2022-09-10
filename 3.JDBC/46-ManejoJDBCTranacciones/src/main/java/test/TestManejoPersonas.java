package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;//El objeto de conexion se debe instanciar fuera del bloque try catch para poder usar el metodo de rollback
        try {
            conexion = Conexion.getConnection();//Se crea un objeto Connection para realizar la conexion debido a que ya no tenemosesta en nuetros metodos
            if(conexion.getAutoCommit()== true){//preguntamos si la conexion esta en modo autocommit
                conexion.setAutoCommit(false);//Si es asi, la cambiamos para que no se haga el commit de forma automatica
            }
            
            PersonaDAO personaDao = new PersonaDAO(conexion);//Se introduce la conexion que se esta creando de manera externa 
            
            var cambioPersona = new Persona(2, "Karla Ivonne", "Gomez", "kgomez@gmail.com", "7713445678");
            personaDao.actualizar(cambioPersona);
            
            //var nuevaPersona = new Persona("Carlos", "Ramirezdddddddddddddddddddddddddddddddddddddddd",null ,null );//Provocamosun fallo para ver el funcionamiento de rolleback, el campo apellido en mysql tiene maximo 45 caracteres 
            //var nuevaPersona = new Persona("Carlos", "Ramirez",null ,null );//Este objeto persona no deberia mandar ningun error
            //personaDao.insertar(nuevaPersona);

            conexion.commit();//hasta este momento es que se guardaran los cambios 
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");//En caso de error
            try {
                conexion.rollback();//El metodo rolleback lo que hara es que si hay un error todas las sentencias que provocan cambios en la BD no se ejecutan
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
 
    }
}

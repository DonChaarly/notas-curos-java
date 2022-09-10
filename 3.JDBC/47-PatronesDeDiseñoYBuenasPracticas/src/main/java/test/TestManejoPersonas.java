package test;

import datos.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()== true){
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDao = new PersonaDaoJDBC(conexion);//Se utiliza la interface para que sin importar la tecnologia que utilicemospodamos interactuar con la base de datos sin problemas 
            
            List<PersonaDTO> personas = personaDao.seleccionar();
            for(PersonaDTO persona: personas){
                System.out.println("Persona DTO: " + persona);
            }

            conexion.commit(); 
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

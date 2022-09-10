package datos;

import static datos.Conexion.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Esta clase va a realizar las operaciones de select insert delete update
A esta clase que realizara operaciones dentro de la base de datos se le conoce como DAO(Data Acces Object) que es un patron de diseño
Se podrian tener mas entidades a parte de persona asi que cada una de estas deberian tener una clase DAO
 */
public class PersonaDAO {

    //Al principio de la clase se definen las sentencias que finalmente se veran reflejadas en MySql
    private static final String SQL_SLECT = "SELECT id_persona, nombre, apelido, email, telefono FROM persona";//Es conveniente provar estas senetencias fuera de java para comprobar que se escribieron correctamente
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apelido, email, telefono) VALUES(?, ?, ?, ?)";//En el campo de VALUES se colocan ? que significan parametros que corresponden a nombre, apellito etc, que seran valores en codigos duros
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apelido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    //Metodo que regresara una lista de objetodos de tipo persona
    public List<Persona> seleccionar() {
        //Definimos todas las variables a utilizar
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        //Empezamos a ejecutar la sentencia
        try {
            //Debido a que nuestros metodos son estaticos podemos llamarlos simplemente con el nombre de la clase o hacer un import static de estos metodos
            conn = getConnection();//Definimos nuestra variable de conexion, ahora tenemos una conexion activa a nuestra base de datos
            stmt = conn.prepareStatement(SQL_SLECT);//Definimos cual es la sentencia que vamos a ejecutar
            rs = stmt.executeQuery();//finalmente ejecutamos el query(la sentencia)
            while (rs.next()) {//Se itera cada uno de los registros para crear cada objeto de tipo persona
                //Vamos recuperando cada uno de los elementos de los registros
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apelido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                //Creamos los objetos de tipo persona
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                //Finalmente agreg//Creamos los objetos de tipo personaamos los objetos de tipo persona a nuestra lista de persona
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } //Agregaos un bloque finally el cual siempre se ejecuta sin importar si hay una excepcion o no
        finally {
            try {
                //Vamos cerrando nuestros objetos en el modo inverso en el que los fuimos llamando
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(Persona persona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;//Registros que se modifican
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());//Con el metodo setString se sustituyen los parametros ? con los argumentos de nuestro objeto persona, tenemos que indicar el indice del parametro y el valor de la cadena
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate();//Se utiliza executeUpdate porque estamos alterando el estado de la base de datos, este metodo puede ejecutar sentencias de upset update o delete

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        return registros;
    }
    
    public int eliminar(Persona persona){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }        
        }
        return registros;
    }
}

package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

/*
Esta clase va a realizar las operaciones de select insert delete update
A esta clase que realizara operaciones dentro de la base de datos se le conoce como DAO(Data Acces Object) que es un patron de diseño
Se podrian tener mas entidades a parte de usuario1 asi que cada una de estas deberian tener una clase DAO
 */
public class UsuarioDAO {

    //Al principio de la clase se definen las sentencias que finalmente se veran reflejadas en MySql
    private static final String SQL_SLECT = "SELECT id_usuario, usuario, password FROM usuario";//Es conveniente provar estas senetencias fuera de java para comprobar que se escribieron correctamente
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";//En el campo de VALUES se colocan ? que significan parametros que corresponden a usuario1 y password, que seran valores en codigos duros
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";

    //Metodo que regresara una lista de objetodos de tipo Usuario
    public List<Usuario> seleccionar() {
        //Definimos todas las variables a utilizar
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario1 = null;
        List<Usuario> usuarios = new ArrayList<>();
        //Empezamos a ejecutar la sentencia
        try {
            //Debido a que nuestros metodos son estaticos podemos llamarlos simplemente con el usuario de la clase o hacer un import static de estos metodos
            conn = getConnection();//Definimos nuestra variable de conexion, ahora tenemos una conexion activa a nuestra base de datos
            stmt = conn.prepareStatement(SQL_SLECT);//Definimos cual es la sentencia que vamos a ejecutar
            rs = stmt.executeQuery();//finalmente ejecutamos el query(la sentencia)
            while (rs.next()) {//Se itera cada uno de los registros para crear cada objeto de tipo usuario1
                //Vamos recuperando cada uno de los elementos de los registros
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                //Creamos los objetos de tipo usuario1
                usuario1 = new Usuario(idUsuario, usuario, password);
                //Finalmente agregamos los objetos de tipo usuario1 a nuestra lista de usuario1
                usuarios.add(usuario1);
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
        return usuarios;
    }

    public int insertar(Usuario usuario1) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;//Registros que se modifican
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario1.getUsuario());//Con el metodo setString se sustituyen los parametros ? con los argumentos de nuestro objeto usuario1, tenemos que indicar el indice del parametro y el valor de la cadena
            stmt.setString(2, usuario1.getPassword());
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
    
    public int actualizar(Usuario usuario1){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario1.getUsuario());
            stmt.setString(2, usuario1.getPassword());
            stmt.setInt(3, usuario1.getIdUsuario());
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
    
    public int eliminar(Usuario usuario1){
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario1.getIdUsuario());
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

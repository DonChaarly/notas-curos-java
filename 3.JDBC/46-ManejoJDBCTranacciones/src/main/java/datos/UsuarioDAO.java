package datos;

import static datos.Conexion.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;

/*
Esta clase va a realizar las operaciones de select insert delete update
A esta clase que realizar operaciones dentro de la base de datos de le conoce como DAO(Data Acces Object) que es un patron de diseño
Se podrian tener mas entidades a parte de usuario1 asi que cada una de estas deberian tener una clase DAO
 */
public class UsuarioDAO {

    //Atributos
    private Connection conexionTransaccionalU = null;

    //Al principio de la clase se definen las sentencias que finalmente se veran reflejadas en MySql
    private static final String SQL_SLECT = "SELECT id_usuario, usuario, password FROM usuario";//Es conveniente provar estas senetencias fuera de java para comprobar que se escribieron correctamente
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?, ?)";//En el campo de VALUES se colocan ? que significan parametros que corresponden a usuario1 y password, que seran valores en codigos duros
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario = ?, password = ? WHERE id_usuario = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?";
    
    //Constructor
    public UsuarioDAO(Connection conexionTransaccionalU){
        this.conexionTransaccionalU = conexionTransaccionalU;
    }

    //Metodo que regresara una lista de objetodos de tipo Usuario
    public List<Usuario> seleccionar() throws SQLException {
        //Definimos todas las variables a utilizar
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario1 = null;
        List<Usuario> usuarios = new ArrayList<>();
        //Empezamos a ejecutar la sentencia
        try {
            conn = this.conexionTransaccionalU != null ? this.conexionTransaccionalU : getConnection();
            stmt = conn.prepareStatement(SQL_SLECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idUsuario = rs.getInt("id_usuario");
                String usuario = rs.getString("usuario");
                String password = rs.getString("password");
                usuario1 = new Usuario(idUsuario, usuario, password);
                usuarios.add(usuario1);
            }
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.conexionTransaccionalU == null) {
                Conexion.close(conn);
            }
        }
        return usuarios;
    }

    public int insertar(Usuario usuario1) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccionalU != null ? this.conexionTransaccionalU : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario1.getUsuario());
            stmt.setString(2, usuario1.getPassword());
            registros = stmt.executeUpdate();
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccionalU == null) {
                Conexion.close(conn);
            }
        }
        return registros;
    }

    public int actualizar(Usuario usuario1) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccionalU != null ? this.conexionTransaccionalU : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario1.getUsuario());
            stmt.setString(2, usuario1.getPassword());
            stmt.setInt(3, usuario1.getIdUsuario());
            registros = stmt.executeUpdate();
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccionalU == null) {
                Conexion.close(conn);
            }
        }
        return registros;
    }

    public int eliminar(Usuario usuario1) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccionalU != null ? this.conexionTransaccionalU : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario1.getIdUsuario());
            registros = stmt.executeUpdate();
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccionalU == null) {
                Conexion.close(conn);
            }
        }
        return registros;
    }
}

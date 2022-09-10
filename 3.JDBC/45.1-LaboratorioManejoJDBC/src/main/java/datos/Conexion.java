package datos;

import java.sql.*;

//Esta clas puede utilizarse entre diferentes royectos
public class Conexion {

    //Atibutos
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";//URL de nuestra base de datos
    private static final String JDBC_USER = "root";//Usuario
    private static final String JDBC_PASSWORD = "admin";//contraseña

    //Metodo para obtener conexion a la base de datos
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);//Utilizamos la clase DriverManager para utilizar el metodo getConnetion que nos regresará un objeto de tipo Connection
    }

    //Metodo para cerrar la conexion
    public static void close(ResultSet rs) throws SQLException {//Resive un objeto de tipo ResultSet
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {//Cuando utilizamos objetos de tipo statement tenemos una interfaz llamada PreparedStatement que se utiliza mucho debido a que tiene un mejor performance que el objeto Statement
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}

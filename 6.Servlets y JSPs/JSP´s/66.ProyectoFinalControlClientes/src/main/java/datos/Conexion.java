package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/*
En esta clase se va a establecer laconexion hacia la base de datos de MySql
*/
public class Conexion {
    
    //Se definen las variables que vamos a utilizar como parametros para realizar la conexion
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/control_clientes?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    
    //Cramos un atributo DataSource
    private static BasicDataSource dataSource;
    
    //Se crea el metodo que recuperara la conexion hacia la base de datos
    public static DataSource getDataSource(){
        //Preguntamos si la conexion ya se creo, porque si no se hace, cada vez que se mande a llamar este metodo se va a crear un nuevo pool de conexiones
        if(dataSource == null){
        //se inicializa el atributo dataSource
        dataSource = new BasicDataSource(); //La libreria no me aparecio luegoluego, le di a search Dependency at Maven Repository
        //Lamamos al metodo setURL para especificar la URL para conectarnos a la base de datos
        dataSource.setUrl(JDBC_URL);
        //Lo mismo con el usuario y la contraseña
        dataSource.setUsername(JDBC_USER);
        dataSource.setPassword(JDBC_PASSWORD);
        //Se especifica el tamaño inicial del pool de conexiones
        dataSource.setInitialSize(50);
        }
        
        //Si se tiene problemas en el pool de conexion es mejor usar el pool de conexiones de glassfish 
        return dataSource;
    }
    
    
    //Se crea el metodo para obtener la conexion
    public static Connection getConnection() throws SQLException{
        //Se retorna la conexion utilizando el metodo getDataSource 
        return getDataSource().getConnection();
    }
    
    //Se crean los metodos para cerrar el flujo de conexion
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}

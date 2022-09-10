package datos;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;


public class Conexion {

    //Atibutos
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";//Usuario
    private static final String JDBC_PASSWORD = "admin";//contraseña
    private static BasicDataSource dataSource;

    //Metodo que se encarga de inicializar el pool de conexiones
    public static DataSource getDataSource(){
        if(dataSource == null){
        dataSource = new BasicDataSource();//Se crea un objeto de BasicDataSource
        dataSource.setUrl(JDBC_URL);//Se proporciona cada uno de los valores para configurar el pool de conexiones, los cuales seran los mismos que el del URL
        dataSource.setUsername(JDBC_USER);
        dataSource.setPassword(JDBC_PASSWORD);
        //Definimos el tamaño inicial del pool de conexiones
        dataSource.setInitialSize(5);//En este caso seran 5, se puede empezar por un tamaño pequeño y despues incrmentarlo
        }
        return dataSource;
    }
    
    //Metodo para obtener conexion a la base de datos
    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();//ahora se llama el metodo getDataSource y ya no se necesita mandar los valores, ya se ha configurado todo en ese metodo
    }

    //Metodo para cerrar la conexion
    public static void close(ResultSet rs) throws SQLException {
        rs.close();
    }

    public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }

    public static void close(PreparedStatement smtm) throws SQLException {
        smtm.close();
    }
    
    public static void close(Connection conn) throws SQLException{
        conn.close();
    }
}

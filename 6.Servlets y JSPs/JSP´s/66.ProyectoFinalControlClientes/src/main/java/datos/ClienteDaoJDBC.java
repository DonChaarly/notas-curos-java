package datos;

import datos.Conexion;
import dominio.Cliente;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDaoJDBC {

    //Se agregan las sentencias SQL que vamos a utilizar
    private static final String SQL_SELECT = "SELECT id_cliente, nombre, apellido, email, telefono, saldo FROM cliente";
    private static final String SQL_SELECT_BY_ID = "SELECT id_cliente, nombre, apellido, email, telefono, saldo FROM cliente WHERE id_cliente = ?";
    private static final String SQL_INSERT = "INSERT INTO cliente (nombre, apellido, email, telefono, saldo) VALUES(?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE cliente SET nombre=?, apellido=?, email=?, telefono=?, saldo=? WHERE id_cliente = ?";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente=?";

    //Creamos un metodo para listar los clientes
    public List<Cliente> listar() {
        //Creamos nuestras variables de conexion
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        //Creamos un objeto Cliente 
        Cliente cliente = null;
        //Creamos la lista donde se almacenaran los objeto cliente
        List<Cliente> clientes = new ArrayList<>();

        //Rodeamos las sentencias con un bloque TryCatch
        try {
            //Inicializamos nuestra variables conexion por medio de la clase Conexion
            conn = Conexion.getConnection();
            //Inicializamos nuestro objeto stmt y le mandamos la query que queremos que se ejecute
            stmt = conn.prepareStatement(SQL_SELECT);
            //Ejecutamos la query con nuestro objeto rs
            rs = stmt.executeQuery();

            //Iteramos cada uno de los objetos cliente que hay en la base de datos con elmetodo next que nos posiciona en la siguiente iteracion
            while (rs.next()) {
                //Recuperamos cada uno de los valores del objeto cliente
                int idCliente = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                double saldo = rs.getDouble("saldo");
                //Creamos el objeto cliente
                cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);
                //Adjuntamos este objteto cliente a la lista
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } //Agregamos un bloque finally para cerrar todos nuestros objetos de conexion empezando por el ultimo creado
        finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //retornamos la lista de clientes
        return clientes;
    }

    //Creamos un metodo para encontrar un cliente por el id
    public Cliente encontrar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            //Se especifica el id con el que queremos identificar el cliente
            stmt.setInt(1, cliente.getIdCliente());
            //Se ejecuta el query
            rs = stmt.executeQuery();
            //Nos posicionamos en el primer registro, como lo hizo el metodo de next en el metodo de listar
            rs.next();
            //Se guardan los valores del cliente
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            String email = rs.getString("email");
            String telefono = rs.getString("telefono");
            double saldo = rs.getDouble("saldo");
            //Asignamos estos valores al objeto cliente ue ya tenemos
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEmail(email);
            cliente.setTelefono(telefono);
            cliente.setSaldo(saldo);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }

        //Regresamos el objeto cliente
        return cliente;
    }

    //Creamos el metodo para insertar un nuevo objeto cliente, el cual regresara el numero de registros afectados
    public int insertar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        //El objeto resultset no lo necesitaremos en este metodo, ya que novamos a recuperar informacion, sino que la vamos a insertar
        //definimos una variable para almacenar el no. de registros afectados
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            //Proporcionamos cada uno de los parametros que espera esta sentencia, en el orden en que indicamos en el SQL_INSERT
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefono());
            stmt.setDouble(5, cliente.getSaldo());
            
            //Ejecutamos el query con el metodo executeUpdate y este metodo regresa el no. de registros afectados
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        //retornamos el no de registros
        return rows;
    }
    
    //Creamos un metodo para actualizar un registro
    public int actualizar(Cliente cliente){
        Connection conn = null;
        PreparedStatement stmt = null;
        //Este metodo tampoco utiliza el objeto resultset
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            //Establecemos los nuevos datos y el registro que va a actualizar
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getTelefono());
            stmt.setDouble(5, cliente.getSaldo());
            stmt.setInt(6, cliente.getIdCliente());
            
            //Ejecutamos la sentencia
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        //Retornamos el numero de registros afectados
        return rows;        
    }
    
    //Creamos un metodo para eliminar un registro
    public int eliminar(Cliente cliente){
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            //Establecemos el parametro de idCliente que va a afectar
            stmt.setInt(1, cliente.getIdCliente());
            //Ejecutamos la sentencia
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        
        //Retornamos el numero de registros afectados
        return rows;
    }
}




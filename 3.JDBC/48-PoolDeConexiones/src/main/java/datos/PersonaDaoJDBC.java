package datos;

import static datos.Conexion.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

/*

 */
public class PersonaDaoJDBC implements PersonaDAO{
    //Atributos
    private Connection conexionTransaccional;//Esta variable reemplazara la variable conn que se abre y cierra en cada metodo, ahora ya no se cerrara al finalizar cada metodo
    //La transaccion se manejará fuera de esta clase

    //Sentencias de MySql
    private static final String SQL_SLECT = "SELECT id_persona, nombre, apelido, email, telefono FROM persona";//Es conveniente provar estas senetencias fuera de java para comprobar que se escribieron correctamente
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apelido, email, telefono) VALUES(?, ?, ?, ?)";//En el campo de VALUES se colocan ? que significan parametros que corresponden a nombre, apellito etc, que seran valores en codigos duros
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apelido = ?, email = ?, telefono = ? WHERE id_persona = ?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";
    
    //Constructor
    public PersonaDaoJDBC(){
        
    }
    
    public PersonaDaoJDBC(Connection conexionTransaccional){
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<PersonaDTO> seleccionar() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDTO persona = null;
        List<PersonaDTO> personas = new ArrayList<>();
        try {//Se eliminaron los bloques catch para que en caso de que se procece la excepcion dentro de los metodos, se propague la excepcion
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();//Si el objeto de conexionTransaccional es diferente de null entonces se utilizara este objeto, de lo contrario se obtiene otra conexion que se cerrara dentro de este metodo, pero si la conexion se obtuvo por conexionTransaccional entonces el metodo no cerrará la transaccion
            stmt = conn.prepareStatement(SQL_SLECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apelido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                if(this.conexionTransaccional == null){//Se pregunta de donde se obtuvo la conexion
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            registros = stmt.executeUpdate();
        } finally {
                Conexion.close(stmt);
                if(this.conexionTransaccional == null){//Se pregunta de donde se obtuvo la conexion
                    Conexion.close(conn);
                }
        }
        return registros;
    }

    public int actualizar(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());
            stmt.setInt(5, persona.getIdPersona());
            registros = stmt.executeUpdate();
        } finally {
                Conexion.close(stmt);
                if(this.conexionTransaccional == null){//Se pregunta de donde se obtuvo la conexion
                    Conexion.close(conn);
                }
        }
        return registros;
    }

    public int eliminar(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getIdPersona());
            registros = stmt.executeUpdate();
        } finally {
                Conexion.close(stmt);
                if(this.conexionTransaccional == null){//Se pregunta de donde se obtuvo la conexion
                    Conexion.close(conn);
                }
        }
        return registros;
    }
}


package test;
//Para conectarnos a la base de datos de MySql se tienen que hacer varios pasos

import java.sql.*;


public class TestMySqlJDBC {
    public static void main(String[] args) {
        //Primero se escribe la cadena de conexion de la base de datos a utilizar, cada base de datos tiene una cadena diferente
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";//Hay que tener cuidado en mayusculas y minusculas
//                         IP:#puerto/nombre de base de datos?(Diversos parametros de seguridad)puerto seguro&zona horaria&zona horaria a utilizar&parametro para poderse conectar a la base de datos
        try {
            //La siguiente linea ya casi no se utiliza pero puede encontrarse en algunas aplicaciones web
            //Class.forName("com.mysql.cj.jdbc.Driver");//clase que se encuentra dentro de la libreria que hemos descargado
            Connection conexion = DriverManager.getConnection(url, "root", "admin");//Se declara una variale de tipo Conection y con la clase DriverManager llamamos al metodo getConection con la que nos conectaremos a la base de datos y se ingresa el url el usuario y el pasword
            Statement instruccion = conexion.createStatement();//El objeto Statment nos permite ejecutar sentencias sobre nuestra base de datos
            var sql = "SELECT id_persona, nombre, apellido_paterno, apellido_materno, email, telefono, saldo FROM persona";//Se crea una cadena que contendra la istruccion que se va a ejecutar en mysql, con codigp de mysql
            ResultSet resultado = instruccion.executeQuery(sql);//Se ejecuta la instruccion utilizando el tipo interface ResultSet y con el metodo executeQuery se ejecuta la sentencia
            while(resultado.next()){//Debido a que resutado nos puede regresar mas de un registro lo iteramos para obtener todos los registros, y elmetodo next nos dice si tenemos un elemento todavia por iterar
                System.out.print("Id Persona: " + resultado.getInt("id_persona"));//next tambien nos posiciona en la siguiente liena a iterar, y getInt nos regresará el entero de la columna que indicamos en este caso id_persona, se recomienda utilizar el nombre y no el numero de la columna
                System.out.print(" Nombre: " + resultado.getString("nombre"));//Ahora se utiliza getString porque en esta columna tenemos una variable de tipo string
                System.out.print(" Apellido Paterno: " + resultado.getString("apellido_paterno"));
                System.out.print(" Apellido Materno: " + resultado.getString("apellido_materno"));
                System.out.print(" Email: " + resultado.getString("email"));
                System.out.print(" Telefono: " +resultado.getString("telefono"));
                System.out.print(" Saldo: " +resultado.getString("saldo"));
                System.out.println(" ");
            }
            resultado.close();//Debemos cerrar cada uno de los objetos que hemos abierto
            instruccion.close();//Debe ser en el orden inverso en el que abirmos estos objetos
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

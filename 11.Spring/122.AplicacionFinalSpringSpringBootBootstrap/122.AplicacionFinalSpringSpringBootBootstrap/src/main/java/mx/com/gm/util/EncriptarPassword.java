package mx.com.gm.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    
    public static void main(String[] args) {
        
        //121 Creamos una variable que va a ser nuestro password 
        var password = "123";
        //121 Imprimimos los passwords
        System.out.println("Password = " + password);
        System.out.println("Password encriptado = " + encriptarPassword(password));
        
    }
    
    //121 Agregamos un metodo que va a ser el que encripte el password
    public static String encriptarPassword (String password){
        //121 Se crea un objeto BCryptPasswordEncoder el cual vamos a utilizar par encriptar nuestras contrasenas
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
    
}

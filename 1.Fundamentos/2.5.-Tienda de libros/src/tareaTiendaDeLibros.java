
import java.util.Scanner;


public class tareaTiendaDeLibros {
    public static void main (String args[]){
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el Id:");
        var id = consola.nextLine();
        System.out.println("Proporciona el precio:");
        var precio = consola.nextLine();
        System.out.println("Proporciona el envio gratuito:");
        var envio = consola.nextLine();
        
        System.out.println(nombre + " #" + id);
        System.out.println("Precio = $" + precio +".00");
        System.out.println("Envio gratuito = " + envio); 
    }
    
}

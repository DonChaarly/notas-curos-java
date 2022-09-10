
import java.util.Scanner;

public class tareaMayorDosNumero {
    public static void main (String args[]){
        
        var consola = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Proporciona el Numero 1:");
        numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el Numero 2:");
        numero2 = Integer.parseInt(consola.nextLine());
        
        var numeroMayor = (numero1 > numero2) ? "Numero 1 es mayor" : "Numero 2 es mayor";
        System.out.println("numeroMayor = " + numeroMayor);
    }
    
}

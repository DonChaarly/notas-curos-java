
import java.util.Scanner;

public class tareaRectangulo {
    public static void main (String args[]){
        
        int alto;
        int ancho;
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho;");
        ancho = Integer.parseInt(consola.nextLine());
        var area = alto * ancho;
        var perimetro = (alto + ancho)*2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
    
}

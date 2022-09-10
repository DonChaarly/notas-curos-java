
import java.util.Scanner;

public class calculoEstacionSwitch {
    public static void main (String srgs[]){
        var consola = new Scanner (System.in);
        System.out.println("Proporciona el mes del año");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        
        switch (mes){
            case 1,2,12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primevarea";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;    
        }
        System.out.println("estacion = " + estacion);
    }
    
}

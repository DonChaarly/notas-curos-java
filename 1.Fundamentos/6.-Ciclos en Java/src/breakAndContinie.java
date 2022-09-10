
public class breakAndContinie {
   public static void main(String args[]) {

        /*Notas:
           
         */
        
//        for (var contador = 0; contador < 3; contador++) {
//            if (contador % 2 == 0){
//            System.out.println("contador = " + contador);
//            break; //rompe el ciclo y lo termina
//            }
//        }
        
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0){
                continue; //ir a la siguiente iteracion del ciclo for
            }
            System.out.println("contador = " + contador);
        }
    } 
}

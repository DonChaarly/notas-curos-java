public class etiquetasLabels {
    public static void main(String args[]) {

        /*Notas:
           Las etiquetas nos ayudan a indicar a una palabra continue o break ir a una parte en especifico del programa
           No es conveniente usar estas etiquetas
           La etiqueta puede ser cualquier nombre
         */
        inicio:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0){
                continue inicio; //ir a la etiqueta inicio
            }
            System.out.println("contador = " + contador);
        }
        
        //        for (var contador = 0; contador < 3; contador++) {
//            if (contador % 2 == 0){
//            System.out.println("contador = " + contador);
//            break inicio; 
//            }
//        }
    }
}

package aritmetica;

import excepsiones.OperacionExcepcion;

public class Aritmetica {

    //Metodo 
    public static int division(int numerador, int denominador) throws OperacionExcepcion { //en la firma del metodo tenemos que indicar el tipo de excepsion que arrojara
        if (denominador == 0) {
            throw new OperacionExcepcion("Division entre cero");//reportamos la excepsion e indicamos que la va a arrojar "throw"
        }
        
        return numerador / denominador;
    }

}

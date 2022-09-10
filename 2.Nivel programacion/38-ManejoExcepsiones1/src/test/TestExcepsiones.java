
package test;

import static aritmetica.Aritmetica.division;//Podemos simplificar los metodos estaticos colocando static y el metodo a utilizar
import excepsiones.OperacionExcepcion;

/*
java.lang.ArithmeticException
la primer excepsion es la aritmetica, debido a un error aritmetico la simulacion se interrumpe abruptamente
*/
public class TestExcepsiones {
    public static void main(String[] args) {
        int resultado = 10;
        //Para capturar la excepsion y recuperarnos de esta, primero dentro del bloque try
        //  se coloca la sentencia que puede causar una excepsion
        try{
            resultado = division(10, 0);
        //dentro de catch se captura la excepsion y se manda el bloque de codigo que se desea utilizar
        //Pueden arrojarse mas de una excepsion
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion:");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio un error de tipo Exception: ");
            //e.printStackTrace(System.out);//Con esto se imprime la lista de esxcepsiones que se presentaron
            System.out.println(e.getMessage());//Con esto se manda solo el mensaje del tipo de excepsion
        }
        finally{//Si se agrega finally, el siguiente bloque siempre se va a ejecutar indp si hay una excepsion o no
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}

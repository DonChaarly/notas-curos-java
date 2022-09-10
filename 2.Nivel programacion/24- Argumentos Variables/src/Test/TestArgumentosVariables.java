
package Test;
public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3 , 4 , 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", 8, 9, 10);
    }
    
    /*Cuando en un metodo indicamos un tipo y posteriormente tres puntos,
      esto quiere decir que vamos a recibir argumentos variables.
    */
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: " + numeros[i]);
        }
    }
    
    //El parametro variable tiene que ser el ultimo
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
}

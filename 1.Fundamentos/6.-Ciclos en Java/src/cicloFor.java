
public class cicloFor {

    public static void main(String args[]) {

        /*Notas:
           La estructura dentro del for es, primero se declara una variable, despues se pone la 
           condicion y despues cuanto se va aincrementar la variable.
           La variable creada dentro del for no puede ser utilizada fuera del bloque for, llamada
           variable local.
           Al igual que el if, si solo se tiene una linea de codigo, no son necesarias las llaves {}
         */
        
        for (var contador = 0; contador < 3; contador++) {
            System.out.println("contador = " + contador);
        }
    }

}

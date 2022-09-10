package tests;

//import mx.com.globalmentoring.*;
//import mx.com.globalmentoring.Utileria;
//Al indicar static despues de imprimir estamos diciendo que vamos a utilizar un atributo o un metodo dentro de la clase que indicamos
//import static mx.com.globalmentoring.Utileria.imprimir;

public class TestUtileria {
    public static void main(String[] args) {
        //Utileria.imprimir("Saludos");
        //imprimir ("Adios"); //Ya no es necesario indicar la clase
        mx.com.globalmentoring.Utileria.imprimir("Adios");//para no importar la clase lo que hacemos es llamar el "nombre completamente calificado de la clase"
    }
}

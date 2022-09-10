//Mi primera clase
public class HolaMundo {
    public static void main(String args[]){
        int miVariableEntera = 10;
        //Sout y Soutv mas la tecla de dole flecha, son atajos para imprimir un valor
        System.out.println(miVariableEntera);
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);
        
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);
        //Modificamos el valor de la variable cadena
        miVariableCadena="Adios";
        System.out.println(miVariableCadena);
        
        
        //var - inferencia de tipos en java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "inferencia con var";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
        //Valores permitidos en el nombre de variables
        //Se recomienda empezar por una letra en minuscula
        var miVariable =1;
        var _miVariable =2;
        var $miVariable =3;
        //var áVariable =10; se pueden tener problemas al utilizar acentos
        //var #miVariable =2; no se prermite utilizar caracteres especiales
        
    }
}

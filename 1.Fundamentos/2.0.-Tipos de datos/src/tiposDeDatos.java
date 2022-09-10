
import java.util.Scanner;


public class tiposDeDatos {

    public static void main(String args[]) {
        /*
                    tipos primitivos en java
         */
        //tipos primitivos enteros: byte(8bits), short(16bits), int(32bits), long(64bits)
        byte numeroByte = (byte) 129;//Al colocar antes del valor un parentesis con un tipo primitivo, este valor de convierte al tipo del parentesis 
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);//Con la clase del valor envolvente se puede obtener el valor maximo y minimo de esta variable
        System.out.println("Valos maximo byte;" + Byte.MAX_VALUE);

        short numeroShort = (short) 32768;//Los numeros mostrados (3268) son un valor despues de su maximo valor
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo Short:" + Short.MIN_VALUE);
        System.out.println("Valos maximo Short;" + Short.MAX_VALUE);

        int numeroInt = (int) 2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo Int:" + Integer.MIN_VALUE);
        System.out.println("Valos maximo Int;" + Integer.MAX_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo Long:" + Long.MIN_VALUE);
        System.out.println("Valos maximo Long;" + Long.MAX_VALUE);

        //Tipos primitivos de tipo flotante: float (32bits), double (64bits)
        float numeroFloat = (float) 3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float:" + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float:" + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo Double:" + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo Double:" + Double.MAX_VALUE);

        //Tipo primitivo de tipo char:
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021';//Hay distintas formas de llamar a un valor char,segun su codigo, la letra o numero
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);

        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);

        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);

        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'A';
        System.out.println("letra = " + letra);

        //Tipo primitivo de tipo Boolean
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean == true) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa");
        }
        
        var edad1 = 18;
        //var esAdulto = edad >= 18;
        if (edad1 >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        
        //Conversion de tipos primitivos en Java
        
        //Convertit tipo String a Tipo int
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad +1));
        
        var valorPI =Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        // Pedir un valor con la clase scanner
        
        var consola =new Scanner(System.in);
//        System.out.println("Proporciona tu edad");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
         
        //Convertit tipo int a tipo String
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        //Convertir una cadena de String a un caracter tipo char
        
        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }

}

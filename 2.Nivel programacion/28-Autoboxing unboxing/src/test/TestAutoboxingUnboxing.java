package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clases envolventes o Wrapper de tipos primitivos
        /*
            int-Integer
            long-Long
            float-Float
            double-Double
            boolean-Boolean
            byte-Byte
            char-Character
            short-Short
        */
        //las clases envolventes tienen atributos y metodos
        //si los claclulos son muy complejos no se recomienda usar clases envolventes
        
        //int entero = 10;
        //estamos envolviendo el tipo primitivo en un objeto, esto es Autoboxing
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero en string = " + entero.toString());
        System.out.println("entero en double = " + entero.doubleValue());
        
        //del objeto que teniamos se le extrae la literal y esto se conoce como unboxing
        int entero2 = entero;
        System.out.println("entero = " + entero);
        
    }
    
}

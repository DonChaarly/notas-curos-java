package pasoporreferencia;

import persona.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre: = " + persona1.nombre);
        cambiaValor(persona1);
        System.out.println("persona1 cambio de nombre= " + persona1.nombre);
    }
    
    public static void cambiaValor (Persona persona){
        persona.nombre = "Karla";
    }
}

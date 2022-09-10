package pasoporreferencia;

import persona.Persona;

public class PasoPorReferenciaReturnNull {
    public static void main(String[] args) {
        //Persona persona1 = new Persona();
        Persona persona1 = null;
        //persona1.nombre = "Juan";
        //System.out.println("persona1 nombre: = " + persona1.nombre);
        persona1 = cambiaValor(persona1);
       // System.out.println("persona1 cambio de nombre= " + persona1.nombre);
    }
    
    public static Persona cambiaValor (Persona persona){
        if (persona == null){
            System.out.println("Valor de persona invalido");
            return null;
        }
        persona.nombre = "Karla";
        return persona;
    }
}

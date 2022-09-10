
package test;

import domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        
        Persona persona2 = new Persona("Karla");
        System.out.println("persona2 = " + persona2);
        
        imprimir(persona1);//el metodo a llamar dentro de un metodo estatico tambien debe ser estatico
        imprimir(persona2);
    }
    
    public static void imprimir(Persona persona){ //Este metodo debe ser estatico si lo queremos llamar en otro metodo que es estatico
        System.out.println("persona = " + persona);
    }
    
}

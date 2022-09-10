package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[3];
        
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        personas[2] = new Persona("Carlos");
        
        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);
        System.out.println("personas 2 = " + personas[2]);
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas  " + i + "= " + personas[i]);
        }
        
        String frutas[] = {"Naranja", "Platano", "Banana", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
            
        }
    }
    
}

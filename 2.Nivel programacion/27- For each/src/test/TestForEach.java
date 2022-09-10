
package test;

import domain.Persona;

/*
    For each es un for mejorado, simplifica la forma en la que recorremos los arreglos colecciones que tengamos
*/
public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        //Se define una variable del tipo de dato del arreglo y el arreglo que queremos iterar
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustin")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
    
}

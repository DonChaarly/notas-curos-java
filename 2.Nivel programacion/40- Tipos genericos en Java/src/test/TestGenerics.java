
package test;

import genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(10);//Se crea un objeto pero se tiene que especificar el tipo entre pico parentesis <>
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan"); //solo se pueden usar clases de tipo Object y el contenido debe ser compatible, osea de una clase hija en una padre y asi
        objetoString.obtenerTipo();
    }
    
}

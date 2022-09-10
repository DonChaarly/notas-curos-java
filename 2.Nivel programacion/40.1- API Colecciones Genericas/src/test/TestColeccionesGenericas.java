/*
El API de Collections soporta tipos genericos
 */
package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>(); //Despues de List se puede indicar el tipo con el que se va a trabajar y despues de Array igual pero se puede omitir el tipo y solo poner la notacion de diamante <>
        miLista.add("Lunes");// Ahora en vez de almacenar elementos de tipo Object se almacenaran elementos de tipo String
        miLista.add("Martes");//Esto trae ventajas porque Object es demasiado generico
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elementoList = miLista.get(0);//Se puede mandar llamar cualquier elemento sin necesidad de convertirlo de Object al tipo que se requiere
        System.out.println("elementoList = " + elementoList);
        imprimir(miLista);

//        miLista.forEach(elemento -> { //Se utiliza una funcion Lambda "->" en vez del forEach clasico
//            System.out.println("elemento = " + elemento);
//        });
//        for(String elemento: miLista){ // Forma tradicional de iterar la lista
//            System.out.println("elemento = " + elemento);
//        }
        Set<String> miSet = new HashSet<>();//Se convirtio tambien el Set en un tipo generico
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);

        Map<String, String> miMapa = new HashMap<>();//Par el Map se indica el tipo de la llave y del valor, pueden ser de diferentes tipos 
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karlos");
        miMapa.put("valor3", "Rosario");

        String elementoMapa = miMapa.get("valor3");//Podemos evitar la conversion
        System.out.println("elementoMapa = " + elementoMapa);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {//Se puede especificar que el metodo trabaje solo con elementos que soporte colecciones solo de tipo String
        coleccion.forEach(elemento -> {//Nuevamente se utiliza funcion flecha para iterar los elementos de la lista
            System.out.println("elemento = " + elemento);
        });
    }
}

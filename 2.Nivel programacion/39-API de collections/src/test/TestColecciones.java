/*
 En el API de colecciones de java tenemos dos grandes secciones las cuales son interfaces
    *Collection (Tiene sus interfaces:)
        *Set (Tiene clases que implementan estas interfaces:)
            *HasSet
        *List
            *ArrayList
            *Vector
    *Map (Tiene sus clases que implementan la interface map:)(Se maneja el concepto de llave valor)
        *HasMap
 */
package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList(); //Se crea un objeto de tipo List, es como un array pero no se debe indicar la cantidad de elementos de la lista, mantiene el orden pero puede su ejecucuion tarda mas que la del set
        miLista.add("Lunes");// Con .add se agregan elementos a la lista
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");//Pueden duplicarse elementos
        imprimir(miLista);
        
        //Se puede crear una lista de las siguiente manera tambien
        List lista2 = Arrays.asList("Elemento1","Elemento2","Elemento3");
        imprimir(lista2);

//        miLista.forEach(elemento -> { //Se utiliza una funcion Lambda "->" en vez del forEach clasico
//            System.out.println("elemento = " + elemento);
//        });
//        for(Object elemento: miLista){ // Forma tradicional de iterar la lista
//            System.out.println("elemento = " + elemento);
//        }
        Set miSet = new HashSet();//Se crea uun objeto de tipo Set, este tipo de lista no mantiene el orden pero su ejecucion puede ser mas rapida
        miSet.add("Lunes");//Tambien se puede utilizar el metodo add porque es un metodo heredado de la clase padre de ambas Collection
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //miSet.add("Viernes");//No se pueden Dupicar objetos
        imprimir(miSet);
        
        Map miMapa = new HashMap();//Se crea un objeto de tipo Map 
        miMapa.put("valor1", "Juan");//Ya no se usa add, ahora se utiliza put porque no hereda de collection, sino de Map
        miMapa.put("valor2", "Karlos");//Se coloca una llave y un valor
        miMapa.put("valor3", "Rosario");//la llave o valor pueden ser de cualquier tipo
        miMapa.put("valor3", "Carlos");//Si se duplica un elemento, en este caso el valor3 quedara con Carlos, Rosario por ende se borrara
        
        String elemento = (String)miMapa.get("valor1");//Teemos que convertirlo a un tipo String porque get nos regresa un tipo object
        System.out.println("elemento = " + elemento);
        
        imprimir(miMapa.keySet());//Se imprime el set de las llaves de nuestro mapa sin orden porque es set
        imprimir(miMapa.values());//Se imprime el set de los valores de nuestro mapa
    }
    
    public static void imprimir(Collection coleccion) {//Se crea un metodo aplicando polimorfismo para ahorrar lineas de codigo
        coleccion.forEach(elemento -> {//Nuevamente se utiliza funcion flecha para iterar los elementos de la lista
            System.out.println("elemento = " + elemento);
        });
    }
}

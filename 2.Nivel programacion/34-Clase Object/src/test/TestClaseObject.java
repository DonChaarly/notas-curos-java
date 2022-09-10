package test;

import doamin.*;

public class TestClaseObject {
    public static void main(String[] args) {
        //Cuando vemos la palabra new, lo que hacemos es solicitar una nueva referencia en memoria, por lo tanto empleado1 y empleado2 tienen diferentes referencias en memoria
        Empleado empleado1 = new Empleado ("Juan", 5000);
        Empleado empleado2 = new Empleado ("Juan", 5000);
        
        //Al preguntar con == estamos preguntando por la referencia en memoria
        if (empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        //Al preguntar con equals estamos preguntando por el cotenido del objeto
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }
        else {
            System.out.println("Los objetos son distintos en contenido");
        }
        
        //Aqui preguntamos por el valor hasCode que regresa un entero y si tienen el mismo contenido ambos objetos este valor debe ser igual
        if (empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hasCode es igual");
        }
        else{
            System.out.println("El valor hasCode es distinto");
        }
    }
    
}

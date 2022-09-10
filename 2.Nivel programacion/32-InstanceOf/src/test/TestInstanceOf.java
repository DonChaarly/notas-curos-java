package test;

import doamin.*;
//La palabra instanceOf nos dice el tipo de la referencia que esta apuntando un objeto

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);

        empleado = new Gerente("Karla", 10000, "Contabilidad");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        //Noralmente se utiliza para preguntar y se recomienda empezar por la instancia mas especifica y seguir con las mas genericas
        //instanceof reponde verdadero a tipos mas genericos, por ello estamos usando else if, por eso es necesario preguntar desde el mas especifico
        if (empleado instanceof Gerente) {//se pregunta si la variable empleado es de tipo gerente
            System.out.println("Es de tipo gerente");
            //Aunque sabemos que la variable es de tipo hija, no podemos acceder a sus metodos, debemos convertir la variable empleado a tpo gerente
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } 
        else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo padre");
            //No podemos convertir un tipo padre que contiene una referencia de tipo padre a un tipo hijo
            //Gerente gerente = (Gerente)empleado;
            //System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = " + empleado.getNombre());
        } 
        else if (empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }

}

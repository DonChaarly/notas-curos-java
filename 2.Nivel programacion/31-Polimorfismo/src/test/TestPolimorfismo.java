
package test;

import doamin.*;
//Para el polimorfismo necesitamos herencia y haber sobreescrito un metodo de la clase padre en la clase hija
public class TestPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        empleado = new Gerente("Karla", 10000, "Contabilidad");
        //System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(empleado);
    }
    //El polimorfismo nos ayuda hacer nuestros codigos mas genericos, ya que este codigo servira para ejecutar el metodo dependiendo de la referencia que le indiquemos
    public static void imprimir(Empleado empleado){//Se utiliza un tipo compatible, de preferencia el mas generico que en este caso es el de Empleado ya que es la clase padre
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
        
    }
    
}

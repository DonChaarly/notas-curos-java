
package test;

import doamin.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());
        
        //No es posible llamar el metodo debido a que este solo esta definido en la clase hija y no en la padre, debemos hacer una conversion de objetos
        //empleado.getTipoEscritura();
        //DownCasting, convirtiendo un tipo padre en uno hija
        //((Escritor)empleado).getTipoEscitura(); primera forma de realizar la conversion
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscitura();
        
        //UpCasting, no es necesario indicar una conversion de manera explicita debido a que la variable lo soporta
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
    }
    
}

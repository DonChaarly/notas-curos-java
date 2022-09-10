
package test;

import doamin.Gerente;

public class TestSobreescitura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("gerente1: " + gerente1.obtenerDetalles());
    }
    
}

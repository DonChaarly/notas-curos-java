
package test;

import domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica(); No se pueden crear objetos de una clase abstracta
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
    
}

package Caja;
public class PruebaCaja {
    public static void main(String[] args) {
        
        Caja caja1 = new Caja();
        caja1.alto = 2;
        caja1.ancho = 3;
        caja1.profundo =6;
        int resultado = caja1.calcularVolumen();
        System.out.println("resultado = " + resultado);
        
        
        Caja caja2 = new Caja(3, 2, 6);
        caja2.calcularVolumen();
        resultado = caja2.calcularVolumen();
        System.out.println("resultado = " + resultado);
        
    }
    
}

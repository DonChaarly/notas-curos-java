package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        
        Monitor monitor1 = new Monitor("LG", 32.00);
        Raton raton1 = new Raton("USB", "Rizer");
        Teclado teclado1 = new Teclado("USB", "HP");
        Computadora computadora1 = new Computadora("HP 2021", monitor1, teclado1, raton1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();        
    }
    
}

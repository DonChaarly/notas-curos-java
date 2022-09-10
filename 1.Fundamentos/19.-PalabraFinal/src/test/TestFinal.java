
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        //La palabra final en variables significa que no se podra midificar el valor de esta en el futuro
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;
        
        //Persona.MI_CONSTANTE = 5;
        System.out.println("Mi constante = " + Persona.MI_CONSTANTE);
        
        //La palabra final en objetos nos impide asignar una nueva referencia a la misma, pero aun podemos cambiar el contenido del objeto al cual esta apuntando
        final Persona persona1 = new Persona();
        //persona1 = new Persona();
        persona1.setNombre("Juan");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("carlos");
        System.out.println("persona1 = " + persona1.getNombre());
    }
    
}

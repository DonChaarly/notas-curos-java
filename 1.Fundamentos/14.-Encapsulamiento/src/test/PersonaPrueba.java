/*
 *Las clases de prueba se depositaran en el folder test
 */
package test;
// import dominio.*; Esto importa todas las clases del paquete o folder, no importa hacer esto ya que no se consume memoria extra

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", 5000.00, false);
        //System.out.println("persona nombre:" + persona1.getNombre());
        System.out.println("persona1 = " + persona1); //No es necesario llamar el metodo toString el metodo println lo hace por nosotros
        persona1.setNombre("Juan Carlos");
        //persona1.nombre = "Juan Carlos"; Ya no se puede modificar asi nadamas
        //System.out.println("nombre = " + persona1.nombre); Tampoco esta linea se puede usar
//        System.out.println("persona nombre con cambio:" + persona1.getNombre());
//        System.out.println("persona1 sueldo:" + persona1.getSueldo());
//        System.out.println("persona1 eliminado:" + persona1.isEliminado());
        System.out.println("persona1 = " + persona1.toString());
        
        Persona persona2 = new Persona("Carlos", 1000.00, false);
        System.out.println("persona nombre: " + persona2.getNombre());
        System.out.println("persona1 sueldo: " + persona2.getSueldo());
        System.out.println("persona1 eliminado: " + persona2.isEliminado());
        persona2.setNombre("Carlos Ramos");
        persona2.setSueldo(1100.00);
        persona2.setEliminado(true);
        System.out.println("persona nombre con cambio: " + persona2.getNombre());
        System.out.println("persona1 sueldo con cambio: " + persona2.getSueldo());
        System.out.println("persona1 eliminado con cambio: " + persona2.isEliminado());
        
    }
}

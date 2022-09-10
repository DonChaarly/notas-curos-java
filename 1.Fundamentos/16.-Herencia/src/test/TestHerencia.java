package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000.0);
        System.out.println("empleado1 = " + empleado1);
        
        var fecha = new Date();        
        Cliente cliente1 = new Cliente(fecha, true, "Carlos", 'H', 23, "Av. Lazaro Cardenas");
        System.out.println("cliente1 = " + cliente1);
        
        Persona persona1 = new Persona();
    }
}

package test;

import domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();//Normalmente las tecnologias avanzadas crearan objetos con el constructor vacio
        persona.setNombre("Juan");//Por ello se necesitan los codigos set para asignar valores a los atributos
        persona.setApellido("Perez");
        
        System.out.println("persona = " + persona);
        
        System.out.println("Persona nombre: " + persona.getNombre());//Lo mismo con los codigos get
        System.out.println("Persona apellido; " + persona.getApellido());
    }
    
    
}

package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);
    }
    
}

class Persona {
    String nombre;
    String apellido;
    
    Persona (String nombre, String apellido){
        //super(); Llamada implicita al constructor de la clase Padre (Object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this);
        //Imprimir impimir = new Imprimir();
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    public void imprimir (Persona persona){
        System.out.println("persona desde impimir:" + persona);
        System.out.println("Impresion del objeto actual (this):" +this);
    }
}
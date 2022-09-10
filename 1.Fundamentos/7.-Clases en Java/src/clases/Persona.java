package clases;

public class Persona {
    //Atributos de la clase (se recomienda que se declaren al principio de la clase)
    String nombre;
    String apellido;
    
    //Metodos de la clase (parte de codigo que se puede reutilizar)
    //la palabra void significa que el metodo no regresa nada de informacion
    public void desplegarInformacion (){
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
    }
}

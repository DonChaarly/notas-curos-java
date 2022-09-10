package domain;
//La palabra final en clases signidfica que ya no se podran crear claes hijas de esta clase

public class Persona {

    //cuando se juntan las palabras final static, estamos indicando que el atributo es constante, osea que no podemos cambiar su valor
    //las constantes se nombran en mayusculas y con guion bajo para separar palabras
    public final static int MI_CONSTANTE = 1;
    private String nombre;

    //La palabra final en los metodos significa que ya no se podra modificar el comportamiento de estos en la clase padre, y ya no se puede sobreescribir el metodo en la clase hija
    public final void imprimir() {
        System.out.println("Metodo imprimir");

    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

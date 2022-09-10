
package domain;

public class Persona {
    //Atributos protected, asi solamente las clases hijas podran acceder a ellos
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //Constructor vacio
    public Persona (){
    }
    
    //Constructor con argumento nombre
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Constructor con todos los argumentos
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    //Codigos get and set de todos los atributos
    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Codigo toString para saber el estado de la variable de tipo Persona

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}

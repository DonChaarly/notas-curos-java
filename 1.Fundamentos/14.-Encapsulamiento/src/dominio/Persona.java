//Normalmente se le llama dominio al paquete donde se depositan las clases
//que resuelve el problema que estamos analisando
package dominio;

public class Persona {
    //Atributos de la clase pero ahora con el modificador de acceso privado
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
   //Constructor de la clase
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;        
    }
    
    //Metodos get y set (puede agregarse insertando el codigo con click derecho en insert code)
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){ //Se utiliza la palabra is para boolean porque ahora estamos como preguntando
        return this.eliminado;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    //Metodo autoString
    public String toString(){
        return "Persona [ nombre:" + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
    }
}

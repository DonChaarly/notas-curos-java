
package genericos;

public class ClaseGenerica<T> {//Se especifica que se utilizará un tipo generico
    //Atributos
    private T objeto;//Se define el tipo generico, puede ser privado o no
    
    //Constructor
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    //Metodos
    public void obtenerTipo(){
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());//Se imprime el tipo del atributo objeto
    }
}

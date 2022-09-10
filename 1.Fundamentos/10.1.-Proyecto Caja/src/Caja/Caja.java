package Caja;
public class Caja {
    //Atributos de la clase caja
    int ancho;
    int alto;
    int profundo;
    
    //Constructor vacio
    public Caja(){
        System.out.println("Ejecutando constructor vacio");
    }  
    //Constructor con argumentos
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodo de calculo de volumen de la caja
    public int calcularVolumen (){
        return this.ancho * this.alto * this.profundo;
    }
}

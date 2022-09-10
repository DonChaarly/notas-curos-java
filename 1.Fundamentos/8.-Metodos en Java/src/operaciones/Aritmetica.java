package operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    //No es necesario agregar el constructor vacio porque el IDE lo hace por nosotros
    public Aritmetica(){
        System.out.println("Ejecutando constructor"); 
    }
    
    //Sobrecarga de constructores 
    //var no se puede utilizar al definir argumentos de un metodo
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    //Metodo
    public void sumar(){                                   //7
       int resultado = a + b;                              //> CUERPO DEL METODO
        System.out.println("resultado = " + resultado);    //|
    }                                                      //J
    
    public int sumarConRetorno (){ //al ponerle el int estamos diciendo que el metodo va a regresar un valor de tipo int
//        int resultado = a + b;
//        return resultado;
        return a + b;
    }
    
    public int sumarConArgumentos (int arg1, int arg2){
        this.a = arg1;//El argumento a se asigna al atributo this.a
        this.b = arg2;
        //return a + b; 
        return this.sumarConRetorno();
    }
}

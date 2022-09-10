package paquete1;

import paquete1.Clase1; //Una clase padre definida como default no podra utilizarse desde otro paquete

public class ClaseHija extends Clase1{
    
    public ClaseHija(){
        super(); //Podemos llamar el constructor protegido dela clase padre
        this.atributoPortected = "Modificacion atributo protected"; //Podemos usar el atributo protegido desde la clase hija
        System.out.println("atributoProtected = " + this.atributoPortected);
        this.metodoProtected(); //Podemos llamar el metodo protected desde la clase hija
        
        //this.atrinbutoDefault = "Modificacion atributo default"; tenemos acceso a los atributos y metodos default
        //this.metodoDefault();
        
        //this.atributoPrivate; no tenemos acceso al atributo, constructor ni al metodo privado desde la clase hija
        //this.metodoPrivate();
    }
    

        
    
}

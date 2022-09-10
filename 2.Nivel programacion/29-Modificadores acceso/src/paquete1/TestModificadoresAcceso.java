
package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        //No tenemos problema en utilizar cosas publicas desde otras clases
        Clase1 clase1 = new Clase1("Publico"); //La clase 1 no es publica es default por ende no se puede utilizar desde otro paquete
        System.out.println("clase1 = " + clase1);
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        
        //No podemos acceder al constructor protected, solo la clase hija con super puede
        //System.out.println("clase1 = " + clase1.atributoProtected); no podemos utilizar el atributo protected sin ser clase hija
        //clase1.metodoProtected(); no podemos utilzar el metodo protected sin ser clase hija
        
        System.out.println(" ");
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        
        System.out.println("");
        Clase1 clase11 = new Clase1("Default", "Package");
        System.out.println("atibuto default: " + clase1.atrinbutoDefault);
        clase1.metodoDefault();
        
        System.out.println("");
        //No podemos acceder a ningun metodo, constructor o atributo privado
        System.out.println("atributo privado desde el codigo get= " +clase1.getAtributoPrivate());
    }
    
}


package test;

import accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        //Se crea una variable de tipo interface
        //IAccesoDatos datos = new IAccesoDatos(); no podemos crear objetos de una interface porque es abstracta
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar();
        imprimir(datos);
        
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}

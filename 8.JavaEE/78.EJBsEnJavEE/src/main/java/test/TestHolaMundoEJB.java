
package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

public class TestHolaMundoEJB {
    public static void main(String[] args) {
        //probamos la llamada al EJB
        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        //Se utiliza un bloque try catch porque puede arrojar un error de tipo Naming exception
        try{
            //Definimos una variable de tipo context
            Context jndi = new InitialContext();
            //Ubicamos nuestra variable EJB con el metodo lookup con la variable jndi 
            HolaMundoEjbRemote holaMundoEjb = (HolaMundoEjbRemote) jndi.lookup("java:global/78.EJBsEnJavEE/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holaMundoEjb.sumar(5, 3);
            System.out.println("Resultado EJB suma 5+3= " + resultado);
            
            
        }catch(NamingException e) {
            e.printStackTrace(System.out);
        }
        
    }
    
}

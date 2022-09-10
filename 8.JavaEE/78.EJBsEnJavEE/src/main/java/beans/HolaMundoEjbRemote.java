package beans;

//Vamos a especificar la interface que va a utilizar el cliente 

import javax.ejb.Remote;

//Se utiliza esta interface para colocar una barrera y asi el cliente no acceda directamente al EJB

//Colocamos la anotacion Remote para qye el cliente la pueda llamar de manera remota
@Remote
public interface HolaMundoEjbRemote {
    
    //Definimos el metodo que va a llamar el cliente
    public int sumar(int a, int b);
    
}

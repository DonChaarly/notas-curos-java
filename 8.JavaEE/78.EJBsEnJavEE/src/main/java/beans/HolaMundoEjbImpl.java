package beans;

//Para definir a la clase como un EJB colocamos la anotacion de Stateless

import javax.ejb.Stateless;

@Stateless
//implementamos la interface a la que va a acceder el cliente
public class HolaMundoEjbImpl implements HolaMundoEjbRemote{

    //implementamos los metodos abstractos de la interface
    @Override
    public int sumar(int a, int b) {
        System.out.println("Ejecutando metodo en el servidor");
        return a + b;
    }
    
    //Se tiene que desplegar la aplicacion en el servidor de Glassfish, para esto hacemos clean and build y copiamos la ruta del archivo jar que creo hasta target
    //iniciamos el servidor de glassfish
    //en el servidor de glassfish damos click en View domain admin control
    //Ya en la consola damos clik en aplication, deploy, damos clik en seleccionar archivo y proporcionamos la ruta
    //definimos el nombre de la aplicacion
    //damos clik en ok
    //en la salida de glassfish hasta el final se muestran los nombres JNDI que se pueden utilizar
    //JNDI (Java Naming & and Ditectoy Interface)
    //JNDI nos permite ubicar los componentes que tenemood en el servidor de glassfish y utilizarlos por ejemplo desde nuestro cliente

    
}

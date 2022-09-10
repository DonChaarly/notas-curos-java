
public class Concatenacion {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        
        System.out.println(i + j);//aqui se realiza la suma de numeros
        System.out.println(i + j + usuario);// si se tienen numeros primero, se realizara la suma
        System.out.println(usuario + i + j);//si encuntra primero una cadena, los demas los tomara como cadesnas "contexto cadena"
        System.out.println(usuario + (i + j));// si se utilizan parentesisis lo que este dentro de parentesisis lo sumara pero lo seguira tomando como una cadena
    }
}

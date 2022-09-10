public class sentenciasControlIf {
    public static void main (String args[]){
        
        var condicion = false;
        //Cuando es solo una linea de codigo no hay necediad de poner llaves
        if (condicion){
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        
        //Sentencia else if
        var numero = 1;
        var numeroTexto = "Numero desconocido";
        
        if (numero == 1){
            numeroTexto = "Numero uno";
        }else if (numero == 2){
            numeroTexto = "Numero dos"; 
        }else if (numero == 3){
            numeroTexto = "Numero tres";
        }else if (numero == 4){
            numeroTexto = "Numero cuatro";
        }else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
    
}

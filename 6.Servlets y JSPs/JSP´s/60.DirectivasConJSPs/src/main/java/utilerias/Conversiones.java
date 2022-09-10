
package utilerias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversiones {
    //atributo static del formatp de fecha
    private static final String FORMATO_FECHA = "dd-MM";
    
    //Estamos simulando un error, el tipo d dato deberia ser Date
    public static String formato(String fecha){
        SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
        return formateador.format(fecha);
    }
    
}

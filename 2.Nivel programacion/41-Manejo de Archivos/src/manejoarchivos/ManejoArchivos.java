package manejoarchivos;

import java.io.*;//io significa input output asi que es el paquete de entrada salida de Java

/*
En esta clase se van a manejar varios metodos debido a que el manejo de archivos implica varias operaciones
Estos metodos seran estaticos para poder utilizarlos sin problemas en diferentes clases
Se utilizará la clase File para estas operaciones
 */
public class ManejoArchivos {

    //Metodos 
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);//Creamos un objeto de tipo File en memoria
        try {//PrintWriter puede llamar una Excepcion por ello la envolvimos en un bloque try catch
            PrintWriter salida = new PrintWriter(archivo);//Se utiliza la clase PrintWriter para abrir el archivo
            salida.close();//Cuando cerramos el archivo es cuando realmente se guarda y asi tambien cerramos el flujo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);//nuestro objeto de tipo PrintWriter tiene el metodo println al que le pasaremos nuestro contenido, pero se sobreescribira lo queponamos
            salida.close();
            System.out.println("Se ha escrito al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));//No pasamos la informacion directamente a PrintWriter, sino a una clase intermedia FileWriter, y colocamos true para dar a entender que queremos dar appen (anexar) informacion al archivo
            salida.println(contenido);//nuestro objeto de tipo PrintWriter tiene el metodo println al que le pasaremos nuestro contenido, pero se sobreescribira lo que ponamos
            salida.close();
            System.out.println("Se ha anexado informacion al archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);//Se puede utilizar var 
        try {
            var entrada = new BufferedReader(new FileReader(archivo));  //Con la clase BufferReader se puede leer lineas completas de un archivo
            var lectura = entrada.readLine();//Con el metodo readLine se leen lineas completas
            while(lectura !=null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}

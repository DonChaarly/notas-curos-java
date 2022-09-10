package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";//Aparte del nombre de archivo se puede indicar la ruta del archivo
        //crearArchivo(nombreArchivo);

//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "adios");
        leerArchivo(nombreArchivo);
    }

}

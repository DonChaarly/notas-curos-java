package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.pelicuas.negocio.*;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        int opcion = -1;
        String nombreRecurso;
        ICatalogoPeliculas catalogoPeliculas = new CatalogoPeliculasImpl();
        var consola = new Scanner(System.in);
        System.out.println("Elige una opcion: \n"
                + "1.- Iniciar catalogo peliculas \n"
                + "2.- Agregar pelicula \n"
                + "3.- Listar Peliculas \n"
                + "4.- Buscar Pelicula \n"
                + "0.- Salir ");

        while (opcion != 0) {

            opcion = Integer.parseInt(consola.nextLine());
            switch (opcion) {
                case 1:
                    catalogoPeliculas.iniciarRecurso();
                    break;
                case 2:
                    System.out.println("Escribe el nombre de la pelicula: ");
                    var pelicula = consola.nextLine();
                    catalogoPeliculas.agregarPelicula(pelicula);
                    System.out.println("Pelicula = " + pelicula);
                    break;
                case 3:
                    System.out.println("Indice de peliculas: ");
                    catalogoPeliculas.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la pelicula a buscar: ");
                    pelicula = consola.nextLine();
                    catalogoPeliculas.buscarPelicula(pelicula);
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;
            }
        }
    }

}

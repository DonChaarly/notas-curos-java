package mx.com.gm.pelicuas.negocio;

import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    //Atributo de la clase
    private final IAccesoDatos datos;

    //Constructor Vacio
    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    //Metodos sobreescritos de ICatalogoPeliculas
    @Override
    public void agregarPelicula(String nombrePeliculas) {
        try {
            var pelicula = new Pelicula(nombrePeliculas);
            boolean anexar = false;
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
            
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
                var peliculas = datos.listar(NOMBRE_RECURSO);
                var indice = 1;
                System.out.println("Peliculas en el Catalogo: ");
                for(Pelicula elemento: peliculas){
                    System.out.println(indice + ".- " +elemento.getNombre());
                    indice++;
                }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de accesp datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        try {
            String resultado = null;
            resultado = datos.buscar(NOMBRE_RECURSO, buscar);
            if(resultado != null){
            System.out.println(resultado);
        }else{
            System.out.println("Pelicula no encontrada");
        }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void iniciarRecurso() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);
        }
    }

}

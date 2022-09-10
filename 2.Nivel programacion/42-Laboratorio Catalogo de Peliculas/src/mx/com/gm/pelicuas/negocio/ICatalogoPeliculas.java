package mx.com.gm.pelicuas.negocio;

import mx.com.gm.peliculas.excepciones.*;

public interface ICatalogoPeliculas {
    
    //Atributo final static
    String NOMBRE_RECURSO = "peliculas.txt";
    
    //Metodos sin definir
    void agregarPelicula(String nombrePeliculas);
    
    void listarPeliculas();
    
    void buscarPelicula(String buscar);
    
    void iniciarRecurso();
}

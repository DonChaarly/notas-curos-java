
package doamin;

public enum TipoEscritura {
    //Atributos constantes de la enueracion con una caracteristica
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    //Definiendo la variable descripcion
    private final String descripcion;
    
    //Constructor en donde inicializamos la variable descripcion
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

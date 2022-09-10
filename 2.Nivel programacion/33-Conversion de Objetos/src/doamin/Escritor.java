
package doamin;

public class Escritor extends Empleado{
    //Atributo de tipo default y final
    private final TipoEscritura tipoEscitura;
    
    //Constructor de la clase escritor con tres argumentos
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscitura = tipoEscritura;
    }
    
    //Metodo sobreescrito de obtener detalles
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", tipoEscritura: " + this.tipoEscitura;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escritor{tipoEscitura=").append(tipoEscitura);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    //Metodo get
    public TipoEscritura getTipoEscitura() {
        return this.tipoEscitura;
    }
    
    
    
}

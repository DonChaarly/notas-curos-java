
package domain;
/*
Las clases abstractas son aquellas que contienen almenos un metodo abstracto
los cuales no tienen un comportamiento definido debido a que es muy ambiguo para
especificarlo, por ello este comportamiento se define en las clases hijas.
*/
public abstract class FiguraGeometrica {
    //Atributos
    private String tipoFigura;
    
    //Constructor
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    //Metodo abstracto
    public abstract void dibujar();
    
    //Getter and setter

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }
    
}

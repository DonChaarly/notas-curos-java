package beans;

public class Rectangulo {
    
    private int base;
    private int altura;
    
    //El constructor vacio ya se a agregado por default, solo se agrega manualmente si es que se agrego un segundo contructor

    public int getBase() {
        return this.base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public int getArea(){
        return this.altura * this.base;
    }
    
}

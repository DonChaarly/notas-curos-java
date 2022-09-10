package com.gm.mundopc;

public class Monitor {
    //Atributos clase Monitor
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;
    
    //Constructores de la clase monitor
    private Monitor(){
        this.idMonitor = ++contadorMonitores;
    }
    
    public Monitor(String marca, double tamano){
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    //Codigos get and set
    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return this.tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    //Codigo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamano=").append(tamano);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}

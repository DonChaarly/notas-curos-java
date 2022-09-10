package com.gm.mundopc;

public class Computadora {
    //Atributos de la clase computadora
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton Raton;
    private static int contadorComputadoras;
    
    //Constructores de la clase Computadora

    private Computadora() {
        this.idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton Raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.Raton = Raton;
    }

    //Codigos get and set
    public int getIdComputadora() {
        return this.idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.Raton;
    }

    public void setRaton(Raton Raton) {
        this.Raton = Raton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{idComputadora=").append(idComputadora);
        sb.append(", nombre=").append(nombre);
        sb.append(", ").append(monitor);
        sb.append(", ").append(teclado);
        sb.append(", ").append(Raton);
        sb.append('}');
        return sb.toString();
    }
       
}

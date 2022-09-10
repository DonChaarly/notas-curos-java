package com.gm.mundopc;

public class Orden {

    //Atributos de la clase orden
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private final static int MAX_COMPUTADORAS = 20;

    //Constructor Orden vacio
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    //Metodo para agregar computadoras
    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Alcanzado limite de computadoras");
        }
    }

    //Metodo mostrar orden
    public void mostrarOrden() {
        System.out.println("Orden #" + this.idOrden + ":");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);;
        }
    }
}

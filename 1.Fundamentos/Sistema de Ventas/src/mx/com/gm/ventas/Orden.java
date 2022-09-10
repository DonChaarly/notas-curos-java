package mx.com.gm.ventas;

import mx.com.gm.ventas.Producto;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;
    private int contadorProductos;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos= new Producto[Orden.MAX_PRODUCTOS]; 
    }
    
    public void agregarProducto(Producto producto){
        if (this.contadorProductos < Orden.MAX_PRODUCTOS){
        productos[this.contadorProductos++] = producto;
        } else{
            System.out.println("Se ha superado el limite de productos");
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total = total + this.productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("idOrden: " + this.idOrden);
        System.out.println("Cantidad de productos seleccionado: " + this.contadorProductos);
        System.out.println("Descripcion:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        System.out.println("Total a pagar: $" + this.calcularTotal());
    }
    
}

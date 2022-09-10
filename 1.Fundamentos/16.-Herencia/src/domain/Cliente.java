
package domain;

import java.util.Date;

public class Cliente extends Persona {
    //Atributos de la clase
    private int idCliente;
    private static int contadorCliente;
    private Date fechaDeRegistro;
    private boolean vip;
    
    //Constructor de clase cliente

    public Cliente(Date fechaDeRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fechaDeRegistro = fechaDeRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    }
    
    
    //Metodos get y set
    public int getIdCliente() {
        return this.idCliente;
    }

    public java.util.Date getFechaDeRegistro() {
        return this.fechaDeRegistro;
    }

    public void setFechaDeRegistro(java.util.Date fechaDeRegistro) {
        this.fechaDeRegistro = fechaDeRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", fechaDeRegistro=").append(fechaDeRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}

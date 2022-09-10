
package doamin;

import doamin.Empleado;

public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departameto){
        super(nombre, sueldo);
        this.departamento = departameto;
    }
    
    @Override //la anotacion nos indica que estamos sobreescriviendo el metodo
    public String obtenerDetalles(){ //Para sobreescribir el metodo, este tiene que tener el mismo nombre que el metodo del padre
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}

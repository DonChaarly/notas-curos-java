
package domain;
//Se coloca la sentencia extends y el nombre de la clase padre para poder utilizar las caracteristicas de esta
public class Empleado extends Persona{
    //Atributos de la clase empleado en private porque se considera que no tendremos clases hijas de esta clase
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    //Constructores de la clase
    
   public Empleado(){
      this.idEmpleado = ++Empleado.contadorEmpleado; 
   }
   
    public Empleado(String nombre, double sueldo) {
        //super(nombre);//Se utiliza la palabra super para poder inicializar la variable nombre, esto porque estamos utilizando una variable de la clase padre
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    
    //Metodos get y set
    public int getIdEmpleado() {
        return idEmpleado;
    }

    //Se elimina este setporque no queremos modificar este valor una vez que se inisializo
//    public void setIdEmpleado(int idEmpleado) {
//        this.idEmpleado = idEmpleado;
//    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}

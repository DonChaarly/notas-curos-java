package operaciones;
//La sobrecarga de metodos es definir dos o mas veces el metodo a usar pero poniendo el mismo nombre
public class Operaciones {
    public static int sumar(int a, int b){
        System.out.println("sumar (int a, int b)");
        return a+ b;
    }
    
    public static double sumar(double a,double b){
        System.out.println("sumar(double a, double b)");
        return a + b;
    }
}

package accesodatos;
//Para implementar una interface se utiliza la palabra reservada implements
//Tenemos que implementar los metodos de la clase padre, si no nos mandará error el IDE
public class ImplementacionMySql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde My Sql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde My Sql");
    }

    @Override
    public void actualizar() {
        System.out.println("Ectualizar desde My Sql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde My Sql");
    }

}

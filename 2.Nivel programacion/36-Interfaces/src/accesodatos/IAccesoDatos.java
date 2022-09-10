
package accesodatos;
/*
Las interfaces son una nueva clase y se utiliza la palabra reservada interface
las interfaces son similares a las clases abstractas, tambien tienen metodos abstractos pero las interfaces se utilizan
mas para definir comportamientos en vez de caracteristicas
Las interfaces no extienden de la clase object, pero pueden extender de otras clases de tipo interface
*/
public interface IAccesoDatos {
   //Atributos siempre constantes 
    int MAX_REGISTRO = 10;
    
    //Cualquier metodo sera publico y abstracto siempre
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
    
    
}

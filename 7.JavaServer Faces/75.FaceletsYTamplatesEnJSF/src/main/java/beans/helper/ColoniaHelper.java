//Esta clase sera un intermediario para conectarse a la base de datos o a donde venga la informacion de la colonia y el codigo postal

package beans.helper;
//Se define el MangeBean y el alcance

import beans.model.Colonia;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named
@RequestScoped
public class ColoniaHelper {
    
    
    //Agregamos el metodo getColonia el cual regresara una lista de objetos de tipo colonia
    public List<Colonia> getColonias(){
        //Creamos la lista de colonias donde se almacenaran nuestros objetos
        List<Colonia> colonias = new ArrayList<>();
        
        //Definimos el id de las colonias el cual se va a ir incrementando
        int coloniaId = 1;
        //Creamos nuestro objet colonia
        //El codigo postal si empieza por un 0 no se va colocar porque va a tomar el valor como numero octal
        Colonia colonia = new Colonia(coloniaId++,"Napoles", 3810);
        //Agregamos nuestro objeto a la lista de colonias
        colonias.add(colonia);
        
        colonia = new Colonia(coloniaId++,"Polanco", 11530);
        colonias.add(colonia);
        
        colonia = new Colonia(coloniaId++,"Polanco", 3100);
        colonias.add(colonia); 
        
        return colonias;
    }
    
    
    //Agregamos el metodo para encontrar una colonia por nombre
    public int getColoniaIdPorNombre(String nombreColonia){
        //Definimos en donde se va a guardar el coloniaId
        int coloniaId = 0;
        //Definimos una variable que va a almacenar la lista de colonias y hacemos uso del metodo getColonias que acabamos de definir
        List<Colonia> colonias = this.getColonias();
        
        //Buscamos por alguna coincidencia en un bucle for
        for(Colonia colonia: colonias){
            if (nombreColonia.equals(colonia.getNombreColonia())) {
                coloniaId = colonia.getColoniaId();
                break;
            }
        }
        
        return coloniaId;
    }
    
    //Agregamos el metodo para encontrar el id de la colonia por codigo postal
    public int getColoniaIdPorCP(int codigoPostal){
        int coloniaId = 0;
        //Definimos una variable que va a almacenar la lista de colonias y hacemos uso del metodo getColonias que acabamos de definir
        List<Colonia> colonias = this.getColonias();
        
        //Buscamos por alguna coincidencia en un bucle for
        for(Colonia colonia: colonias){
            if (codigoPostal == colonia.getCodigoPostal()) {
                coloniaId = colonia.getColoniaId();
                break;
            }
        }
        
        return coloniaId;
    }
    
    //Agregamos un metodo que se encarga de recuperar cada uno de los objetos de tipo colonia pero convirtiendolos en selectItem para poder usarlos en el index
   public List<SelectItem> getSelectItems(){
       //Creamos nuetra lista de slectItems
       List<SelectItem> selectItems = new ArrayList<>();
       //recuperamos nuestras colonias
       List<Colonia> colonias = this.getColonias();
       
       for(Colonia colonia: colonias){
           //Creamos nuestros objetos selectItem, Agregamos el valor del objeto y la etiqueta
           SelectItem selectItem = new SelectItem(colonia.getColoniaId(), colonia.getNombreColonia());
           //Agregamos los objetos  a la lista de slectItems
           selectItems.add(selectItem);
       }
       
       return selectItems;
   }
}

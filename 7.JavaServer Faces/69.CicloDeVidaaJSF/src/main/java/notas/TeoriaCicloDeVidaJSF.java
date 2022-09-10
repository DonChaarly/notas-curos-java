package notas;

public class TeoriaCicloDeVidaJSF {
    
    /*
                Cliclo de vida de los JSF
    
    Se comienza con una peticion del usuario
    1. Restauracion de la vista:    
        En caso de que sea la primera vez que se solicita la vista
        Se crearan cada uno de los componentes que representan las etiquetas
        de la pagina JSF
        En caso que la peticion sea GET o sin parametros, el freamworkno tiene
        mas que realizar y simplemente regresa la respuesta al cliente
    2. Procesamiento de parametros:
        Se aplican los valores de la peticion, los paraemtros enviados son 
        mapeados con cada uno de los componentes Java correspondientes,
        esto nos permitira llenar con informacion que nos estan enviando a nuestra
        aplicacion Java
    3. Procesamiento de validaciones y conversiones:
        En el punto 2 aun no sabemos si los valores son adecuados o si es necario 
        convertirlos a cierto tipo de dato
        En este punto se validan los valores y si alguno falla el estado del 
        componente Java se marca como invalido y se pasa directamente al estado 6
    4. Procesamiento del Modelo:
        En caso de no tener problemas con las validaciones en el paso 4 el freamwork 
        actualiza los valores de las clases de modelo con la infromacion ya procesada 
        del paso 3
        En Java Server faces mucho del trabajo de validaciones queda resuelto, no como
        en los Servlets o JSP
    5. Invocacion de la aplicacion:
        Se incoca nuestra aplicacion o mas bien los metodos que procesan las peticiones 
        de nuestros usuarios
        En este punto se ejecutan los metodos action que etan almacenados en los Managed Bens
        Los metodos action listener son llamados antes que los actions
    6. Envio de respuesta
        
        
    */
    
}

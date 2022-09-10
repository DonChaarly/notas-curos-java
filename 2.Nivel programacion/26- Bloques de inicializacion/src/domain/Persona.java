package domain;

/*
  Hay bloques de inicializacion estaticos y no estaticos
estos van a ejecutarse antes del constructor
*/
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de codigo de inicializacion estatico
    //  Este bloque se ejecuta solamente cuandose asigna la clase a la memoria
    static{
        System.out.println("Ejecucion de bloque estatico.");
        ++Persona.contadorPersonas;
        //idPersona = 10; el atributo idPersona al ser no estatico no puede ser llamado dentro de un contexto estatico
    }
    
    //Bloque de inicializacion no estatico
    // Este bloque se ejecuta cada vez que se crea un objeto y se llama al constructor
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    //Constructor de la clase
    public Persona(){
        System.out.println("Ejecucion de constructor");
    }

    //Codigo get de idPersona
    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
}

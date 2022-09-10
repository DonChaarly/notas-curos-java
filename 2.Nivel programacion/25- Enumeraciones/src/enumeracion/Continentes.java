package enumeracion;

public enum Continentes {
    //Lista de atributos
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "1.3 billones"),
    ASIA(44, "1.8 billones"),
    AMERICA(34, "5 personas"),
    OCEANIA(14, "4 pinguinos"); //Se coloca ; en el ultimo atributo si se va a seguir trabajando en la enumeracion

    private final int paises;
    private final String habitantes;

    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
    
}

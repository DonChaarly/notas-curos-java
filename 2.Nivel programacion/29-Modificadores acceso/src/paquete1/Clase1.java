package paquete1;
//el modificador public es el menos restrictivo y se puede usar en clases, metodos, atributos y constructores
class Clase1 { //Desde la clase se puede utilizar el modificador default o package
///////////////////////            MODIFICADOR PUBLICO             ////////////////////////////////////////////////////
    
    //Atributo publico
    public String atributoPublico = "Atributo Publico";
    
    //Constructor publico
    public Clase1(String arg) {
        System.out.println("Constructor publico");
    }
    
    //Metodo publico
    public void metodoPublico() {
        System.out.println("MetodoPublico");
    }
///////////////////////            MODIFICADOR PROTECTED             ////////////////////////////////////////////////////
    
    //Atributo protected
    protected String atributoPortected = "Atributo Protected";
    //Constructor Protected
    protected Clase1(){ //Este constructor solo se podra llamar desde una clase hija con super
        System.out.println("Constructor protected");
    }
    //Metodo Protected
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
///////////////////////            MODIFICADOR DEFAULT             ////////////////////////////////////////////////////
    
    //Atributo default o package
    String atrinbutoDefault = "Atributo default o package";
    //constructor default o package
    Clase1(String arg, String arg1){
        System.out.println("Constructor default");
    }
    void metodoDefault(){
        System.out.println("Metodo defoult o package");
    }

///////////////////////            MODIFICADOR PRIVATE             ////////////////////////////////////////////////////
    
    //Atributo privado
    private String atributoPrivate = "Atributo Privado";
    //Constrictor privado
    private Clase1(String arg, String arg2, String arg3){
        System.out.println("Constructor privado");
    }
    //Metodo privado
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    //Para acceder a atributos privados se utilizan codigos get y set
    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
}

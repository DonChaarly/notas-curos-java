package domain;
//Esta clase se utilizar para insterar, mostrar, recuperar, borrar o modificar informacion en la base de datos
public class PersonaDTO {
    //Atributos que representan cada una de las columnas segun nuestra base de datos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    //Constructores
    public PersonaDTO() {
    }

    public PersonaDTO(int idPersona) {
        this.idPersona = idPersona;
    }

    public PersonaDTO(String nombre, String apellido, String email, String telefono) {//Tenemos tambien un contructor con los demas atributoas excepto idPersona deido a que no lo necesitamos por ejemplo al insertar un nuevo registro, este solo se incrementa y asigna
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    public PersonaDTO(int idPersona, String nombre, String apellido, String email, String telefono) {//Tenemos tambien un contructor con todos los atributos para por ejemplo modificar alguno de estos, debido a que necesitamos especificar el atributo y el idPersona a modificar
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    //Metodos geter and setter para modificar alguno de los atributos o llamarlo
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
}

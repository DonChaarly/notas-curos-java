package domain;
//Esta clase se utilizar para insterar, mostrar, recuperar, borrar o modificar informacion en la base de datos
public class UsuarioDTO {
    //Atributos que representan cada una de las columnas segun nuestra base de datos
    private int idUsuario;
    private String usuario;//Debido a que en java no tenemos la variable varchar que almancena varios caracteres, en vez utilizamos String
    private String password;
    
    //Constructores
    public UsuarioDTO() {
    }

    public UsuarioDTO(int idUsuario) {//Constructor con idUsuario para por ejemplo eliminar un registro, podria ser util utilizar solamente el idUsuario
        this.idUsuario = idUsuario;
    }

    public UsuarioDTO(String usuario, String password) {//Tenemos tambien un contructor con los demas atributoas excepto idUsuario deido a que no lo necesitamos por ejemplo al insertar un nuevo registro, este solo se incrementa y asigna
        this.usuario = usuario;
        this.password = password;

    }

    public UsuarioDTO(int idUsuario, String usuario, String password) {//Tenemos tambien un contructor con todos los atributos para por ejemplo modificar alguno de estos, debido a que necesitamos especificar el atributo y el idUsuario a modificar
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.password = password;
    }
    

    //Metodos geter and setter para modificar alguno de los atributos o llamarlo
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", usuario=" + usuario + ", password=" + password + '}';
    }
    
}

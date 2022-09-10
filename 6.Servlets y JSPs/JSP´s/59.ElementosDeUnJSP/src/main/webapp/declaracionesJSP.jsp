<%--Las declaraciones se utilizan precisamente para declarar variables y estas se asociaran a la clase del servlet que se crea
Si se utiliza un scriptlet para esto, estas variables solo se podran utilizar dentro del bloque try del servlet--%>
<%!
    //Declaramos una variable usuario y agregamos su metodo get
    private String usuario = "Juan";

    public String getUsuario() {
        return this.usuario;
    }
    
    //Declaramos una variable contadorVisitas
    private int contadorVisitas = 1;

    //Estas variables se pueden observar en el servlet asociado
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Declaraciones con JSP</title>
    </head>
    <body>
        <h1>Ejemplo Declaraciones con JSP</h1>
        <%--Para llamar a la variable se puede hacer uso de this ya que la variable esta asociada a la clase--%>
        Valor usuario por medio de atributo: <%=this.usuario%>
        <br/>
        Valor usuario por medio del metodo get: <%= this.getUsuario()%>
        <br/>
        Contador de visitas: <%=this.contadorVisitas++%>
        <br/>
        <a href="index.html">Regreso a inicio</a>
    </body>
</html>

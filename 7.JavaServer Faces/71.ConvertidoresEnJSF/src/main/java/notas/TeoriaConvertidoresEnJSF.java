package notas;

public class TeoriaConvertidoresEnJSF {
    
    /*
                                Convertidores en JSF
    Los convertidores cubren la necesidad de asignar valores entre la vista y el modelo de manera automatica
    
    Por ejemplo podemos cubrir la necesidad de convertir un valor de la vista a un modelo de forma automatica
        Vista -> Conversion a un tipo de datos -> Modelo
    y viceversa
        Modelo -> Formato a desplegar ->
    
                    Tipos de convertidores en JSF
    Conversiones Implicitas:
        Son todas las conversiones que JSF realiza de manera automatica, por ejemplo
        al usar tipos primitivos, BigInteger o String.
        Por ejemplo al capturar un elemento con input text, si lo asignamos a un atributo de un objeto el cual es de tipo entero, JSF realizara la conversion automaticamente
            <h:inputText id="edadId" value="#{empleadoBean.edad}"/>
    Conversiones Explicitas:
        Utilizando el atribuuto converter, por ejemplo:
            <h:inputText value="#{empleadoBean.edad}"
                converter="javax.faces.Integer" />
        Utilizando un componente de tipo converte
            <h:inputText value="#{empleadoBean.edad}">
                <f:converter converterId="javax.faces.Integer" />
            </h:inputText>
    
    
                Convertidores Personalizados
    JSF permite crear comvertidore perzonalizados
    Pasos para crear y utilizar una clase converter:
        En la pagina JSF:
            <h:inputTex id="fechaId" value="#{empleadoBean.fechaNacimiento}"
                convert="util.convertidorFecha"/>//Se especifica cual es la clase que va a realizar la conversion respectiva
        Clase Java de tipo Convert contiene el codigo del convertidor. Debe implementar la interfaz javax.faces.convert.Converter
        La clase Converter se registra en faces-config.xml o agregar la anotacion @FacesConverter a la clase de tipo Converter
    
    */
    
}

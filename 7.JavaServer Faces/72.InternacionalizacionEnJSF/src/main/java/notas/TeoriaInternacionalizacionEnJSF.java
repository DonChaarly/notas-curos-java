package notas;

public class TeoriaInternacionalizacionEnJSF {
    
    /*
                                Internacionalizacion en JSF
    
    JSF tiene soporte tota para la especificacion I8n de Java, para la especificaio 
    del idioma en la aplicacion WEB
        Estos archivos nos permiten especificar nuestras etiquetas de nuestra paginas web
    
    CODIGO DEL LENGUAJE             DESCRIPCION
    es                              Español
    es_MX                           Español / Mexico
    en                              Ingles  
    en_GB                           Inlesn/Britanico
    en_US                           Ingles/Estados Unidos
    
    El idioma por default sepuede especificar desde el archivo de feces-config o
    via programatica en algun metodo action en algun Manage Bean
    
    
            Resource boundel en JSF
    JSF puede cargar las etiquetas de un archivo de propiedades (Resource Boundel)
    En el archivo faces-config.xml se cofigura el archivo autilizar
    
    <application>
        <resource-bundel>
            <base-name>mensajes</base-name>
            <var>msg</var>
        </resource-bundel>
    </application>
    
    Podemos utilizar el arcivo de propiedades en la pagina JSF como sigue:
    <h:outputText value="#{msg['form.usuario']}" />
    <h:commanButton value="#{msg.enviar}" type"submit" action="login" />
    
            Sobreescritura de mensajes JSF
    Se debe crear un archivo (no importa el nombre) de propiedades,se coloca un guion bajo seguido del nombre del idioma que estamos configurando
        jsf_es.properties
    Se sobreescriben los mensajes del sistema deseados
        java. coponent.UIInput.REQUIRED=Valor Requerido
    Se cofigura en el archivo faces-config.xml
        <application>
            <message-bundle>jsf</message-bundle>
        </application>
            
    
    */
    
}

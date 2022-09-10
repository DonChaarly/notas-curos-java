<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Se agrega el taglib de struts para utilizar sus etiquetas-->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <!--Se utiliza la etiqueta de text para llamar un mensaje del archivo de propiedades-->
        <title><s:text name="persona.titulo"/>"</title>
    </head>
    <body>
        <h1><s:text name="persona.titulo"/></h1>
        
        <!--Se utiliza una etiqueta condicional de struts-->
        <s:if test="personas.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.idPersona" /></th>
                        <th><s:text name="p.nombre" /></th>
                        <th><s:text name="p.apePat" /></th>
                        <th><s:text name="p.apeMat" /></th>
                        <th><s:text name="p.email" /></th>
                    </tr>
                    
                    <!--Se utiliza un iterador para iterar todas las personas de la variable personas que nos paso la clase Action-->
                    <s:iterator value="personas">
                        <tr>
                            <!--Se obtienen todos los valores de los objetos personas con la etiqueta property-->
                            <th><s:property value="idPersona"/></th>
                            <th><s:property value="nombre"/></th>
                            <th><s:property value="apellidoPaterno"/></th>
                            <th><s:property value="apellidoMaterno"/></th>
                            <th><s:property value="email"/></th>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>
        
        <!--Se utiliza un formulario para colocar un boton y con este refrescar la pagina-->
        <s:form>
            <s:submit key="persona.boton" name="submit"/>
        </s:form>
        
        <div><s:text name="persona.contador" />: <s:property value="contadorPersonas"/></div>
    </body>
</html>

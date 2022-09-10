<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Se agregan las etiquetas de struts-->
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="persona.titulo" /></title>
    </head>
    <body>
        <h1><s:text name="persona.titulo" /></h1>
        
        <!--Se analiza el tamaño de la tabla persona de la base de datos-->
        <s:if test="personas.size() > 0" >
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.idPersona"/></th>
                        <th><s:text name="p.nombre"/></th>
                        <th><s:text name="p.apePat"/></th>
                        <th><s:text name="p.apeMat"/></th>
                        <th><s:text name="p.email"/></th>
                        <th><s:text name="p.telefono"/></th>
                    </tr>
                    <s:iterator value="personas">
                        <tr>
                            <td><s:property value="idPersona"/></td>
                            <td><s:property value="nombre"/></td>
                            <td><s:property value="apellidoPaterno"/></td>
                            <td><s:property value="apellidoMaterno"/></td>
                            <td><s:property value="email"/></td>
                            <td><s:property value="telefono"/></td>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if> 
        
        <s:form>
            <s:submit key="persona.boton" name="submit"/>
        </s:form>
        <div>
            <s:text name="persona.contador"/>: <s:property value="contadorPersonas"/>
        </div>

    </body>
</html>

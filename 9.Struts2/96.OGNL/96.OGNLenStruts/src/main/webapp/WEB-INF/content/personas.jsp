<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Se agrega el taglib de struts para poder usar sus elementos--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Formulario Personas</title>
        <s:head/>
    </head>
    <body>
        <h1>Formulario de Personas (OGNL)</h1>
        <s:form>
            <!--Con el concepto de OGNL se puede acceder a los objetos y atributos facilmente
                Al ser la etiqueta de textfield, OGNL llamaria al metodo set para definir el valor del atributo-->
            <s:textfield label="Nombre" name="persona.nombre"/>
            <s:textfield label="Calle" name="persona.domicilio.calle" />
            <s:textfield label="No. Calle" name="persona.domicilio.numeroCalle"/>
            <s:textfield label="Pais" name="persona.domicilio.pais"/>
            <s:submit value="Enviar"/>
        </s:form>
        
        <h2>Valores Proporcionados:</h2>
        <!--Al ser la etiqueta de property OGNL llamaria al metodo get para recuperar el valor del atributo-->
        Nombre: <s:property value="persona.nombre"/><br/>
        Calle: <s:property value="persona.domicilio.calle"/><br/>
        No. Calle: <s:property value="persona.domicilio.numeroCalle"/><br/>
        Pais: <s:property value="persona.domicilio.pais"/>
    </body>
</html>

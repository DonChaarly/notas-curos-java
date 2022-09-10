<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Se agrega el taglib de struts para poder usar sus elementos--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="form.titulo" /></title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="form.titulo" /></h1>
        <s:form>
            <!--Con el concepto de OGNL se puede acceder a los objetos y atributos facilmente
                Al ser la etiqueta de textfield, OGNL llamaria al metodo set para definir el valor del atributo-->
            <s:textfield key="form.nombre" name="persona.nombre"/>
            <s:textfield key="form.calle" name="persona.domicilio.calle" />
            <s:textfield key="form.no.calle" name="persona.domicilio.numeroCalle"/>
            <s:textfield key="form.pais" name="persona.domicilio.pais"/>
            <s:submit key="form.enviar"/>
        </s:form>

        <h2><s:text name="form.resultado" />:</h2>
        <!--Al ser la etiqueta de property OGNL llamaria al metodo get para recuperar el valor del atributo-->
        <s:text name="form.nombre" />: <s:property value="persona.nombre"/><br/>
        <s:text name="form.calle" />: <s:property value="persona.domicilio.calle"/><br/>
        <s:text name="form.no.calle" />: <s:property value="persona.domicilio.numeroCalle"/><br/>
        <s:text name="form.pais" />: <s:property value="persona.domicilio.pais"/>
        <br/>

        <!--Se agrega el codigo para manejar los diferentes tipos de idiomas
            Se utiliza la etiqueta de url, con var se define el nombre de la accion con el que la llamaremos
        -->
        <s:url var="localeES" action="personas">
            <!--vamos a proporcionar un parametro con el que definiremos que idioma vamos a manejar-->
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:url var="localeEN" action="personas">
            <s:param name="request_locale">en</s:param>
        </s:url>


        <!--Se agregan los link para que el usuario pueda cambiar el idioma-->
        <s:a href="%{localeES}"><s:text name="form.idioma.espaniol"/></s:a>
            |
        <s:a href="%{localeEN}"><s:text name="form.idioma.ingles"/></s:a>
    </body>
</html>

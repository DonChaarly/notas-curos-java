<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Para utilizar los lags de struts necesitamos agregar el siguiente taglib--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Se manda a llamar el metodo getTitulo de la clase java para obtener el mensaeje del archivo de proterties-->
        <title><s:property value="titulo"/></title>
    </head>
    <body>
        <h1><s:property value="titulo"/>    </h1>
        <!--Agregamos un formulario de struts con la etiqueta de s:form-->
        <s:form>
            <!--Agregamos un textfield para capturar el valor del nombre-->
            <s:textfield name="nombre"/>
            <!--Agregamos un boton para enviar el formulario
                Tambien se puede acceder a los mensajes agregando el atributo de key y con esto accederemos al archivo de porperties directamente-->
            <s:submit key="persona.boton" name="submit"/>
        </s:form>
        <!--Agregamos un div para mostrar lo que escribio el usuario-->
        <div>
            <s:property value="valor" /> :
            <s:property value="nombre" />
        </div>
    </body>
</html>

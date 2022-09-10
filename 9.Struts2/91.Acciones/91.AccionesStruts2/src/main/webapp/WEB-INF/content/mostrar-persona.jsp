<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Para utilizar los lags de struts necesitamos agregar el siguiente taglib--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar persona con Struts 2</title>
    </head>
    <body>
        <h1>Personas con Struts 2</h1>
        <!--Agregamos un formulario de struts con la etiqueta de s:form-->
        <s:form>
            <!--Agregamos un textfield para capturar el valor del nombre-->
            <s:textfield name="nombre"/>
            <!--Agregamos un boton para enviar el formulario-->
            <s:submit value="Enviar"/>
        </s:form>
        <!--Agregamos un div para mostrar lo que escribio el usuario-->
        <div>
            Nombre proporcionado:  <s:property value="nombre" />
        </div>
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Se agrega el taglib de struts para poder usar sus elementos--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--Se utiliza la text para mandar a llamar un mensaje del archivo de propiedades--%>
        <title><s:text name="form.titulo" /></title>
    </head>
    <body>
        <h1><s:text name="form.titulo" /></h1>
        <%--Se agrega un formulario donde capturaremos el usuario y el password y se especifica que se ejecute el path de validar usuario--%>
        <s:form action="validarUsuario">
            <%--Se agrega un textfield para capturar el usuario y otro para capturar el password--%>
            <s:textfield key="form.usuario" name="usuariojsp"/>
            <s:password key="form.password" name="passwordjsp" />
            <%--Se agrega un boton para enviar el formulario--%>
            <s:submit key="form.boton" name="submit"/>
        </s:form>
    </body>
</html>

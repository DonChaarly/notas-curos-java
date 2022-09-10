<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Se agrega el taglib de struts para poder usar sus elementos--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%--Se utiliza la text para mandar a llamar un mensaje del archivo de propiedades--%>
        <title><s:text name="bienvenido.titulo" /></title>
        <!--Se agrega la etiqueta de struts de head para que se agreguen los estilos css de manejo de errores struts de manera automatica--> 
        <s:head/>
    </head>
    <body>
        <h1><s:text name="bienvenido.titulo" /></h1>
        <!--Se agrega la etiqueta actionmessage  para mostrar los mensajes de erorr de struts-->
        <s:actionmessage/>
        <s:actionerror/>
        <h2>
            <s:text name="bienvenido.mensaje"/>:
        </h2>
        <br/>
        <s:text name="form.usuario"/>: <s:property value="usuariojsp"/>
        <br/>
        <s:text name="form.password"/>: <s:property value="passwordjsp"/>
        <br/>
        <a href="<s:url action="login"/>"><s:text name="bienvenido.regresar"/></a>
    </body>
</html>

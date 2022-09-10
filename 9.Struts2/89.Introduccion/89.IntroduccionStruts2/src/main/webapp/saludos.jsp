<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--Para utilizar los lags de struts necesitamos agregar el siguiente taglib--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludos desde Struts</title>
    </head>
    <body>
        <%--Con el tag de s:property mostramos el valor de un atributo mediante el metodo get--%>
        <h1><s:property value="saludosAtr"></s:property></h1>
    </body>
</html>

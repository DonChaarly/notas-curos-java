<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Utilizaremos los tags de struts-->
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<!--No es necesario definir los tags de head o body-->

<!--Agregamos un link para ejecutar la accion bienvenidoAction (el cual fue configurado en la clase LinkAction) haciendo uso de los tags de struts-->
<a href="<s:url action="bienvenidoAction"/>">Bienvenido</a>
<br/>
<!--Agregamos un link para ejecutar la accion personaAction-->
<a href="<s:url action="personasAction"/>">Personas</a>


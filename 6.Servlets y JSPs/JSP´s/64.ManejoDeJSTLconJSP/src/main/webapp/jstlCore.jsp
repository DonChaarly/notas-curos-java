<%--Se importa la libreria de core para poder usarla--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Core</title>
    </head>
    <body>
        <h1>JSTL Core (JSP Standar Tag Library)</h1>
        <%--Maniplacion de variables con set--%>
        <c:set var="nombre" value="Carlos" />
        <%--Impresion de infromacion--%>
        Variable nombre: <c:out value="${nombre}" />
        <br/>
        <%--Impresion de infromacion con codigo html, para esto se tiene que seleccionar false en scapeXml, sino tambien se imprimira el codigo html--%>
        <c:out value="<h4>Texto con codigo Html utilizando JSTL</h4>" escapeXml="false"/>
        <br/><br/>
        <%--Codigo condicionado, uso de if--%>
        <c:set var="bandera" value="true"/>
        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <%--Codigo condicionado, uso de swich y el parametro que se paso--%>
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opcion 1 seleccionado
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br/>
                    Opcion 2 seleccionado
                </c:when>
                <c:otherwise>
                    <br/>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <%--Iteracion de un arreglo--%>
        <%
            String personas[] = {"Rodrigo", "Sergio", "Pablo"};
            //Se tiene que especificar el alcance del arrego para poderlo acceder desde expression language o JSTL
            request.setAttribute("personas", personas);
        %>
        <br/>
        Lista de personas:
        <br/>
        <ul>
            <c:forEach var="persona" items="${personas}">
                <li>${persona}</li>
            </c:forEach>
        </ul>
        <br/>
        <br/>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>

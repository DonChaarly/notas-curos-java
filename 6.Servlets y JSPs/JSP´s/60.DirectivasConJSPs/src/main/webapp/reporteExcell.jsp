<%--Incluimos el JSP que manejara los errores, esta debe ser privada, osa que tiene que estar dentro de la carpeta WEB-INF--%>
<%@page errorPage="WEB-INF/manejoDeErrores.jsp"%>
<%@page import="utilerias.Conversiones, java.util.Date" %>
<%--Hacemos uso del concepto directiva importando la clase Java Conversiones y java.util.Date--%>
<%@page contentType="application/vns.ms-excel" %>
<%
    //Se incluyen los datos para la generacion del archivo excell
    String nombreArchivo ="reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArchivo);
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxys basica de Java</td>
                <%--Estamos provocando un error, el formatodebe contener un new Date()--%>
                <td><%=Conversiones.formato("500") %></td>
            </tr>
            <tr>
                <td>2. Programacion con Java</td>
                <td>Pondremos en practica conceptos de la programacion orientada a objetos</td>
                <td><%=Conversiones.formato("500") %></td>
            </tr>
        </table>
    </body>
</html>

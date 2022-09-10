<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--Esta pagina de layout define los elementos que van a ser heredados por las otroas paginas de tipos tiles-->
<!--Se agrega el taglib de tiles-->
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
    <head>
        <!--Se inserta el primer atributo definido en el documento de tiles
                Se agrega el nombre del atriburo el cual esta definido en el archivo de tiles.xml
                Se agrega el atriburo de ignore en caso de un fallo al cargar la pagina, se ignora el mensaje que esta procesando-->
        <title>
            <tiles:insertAttribute name="title" ignore="true"/>
        </title>
    </head>
    <body>
        <!--Se agrega una tabla-->
        <table border="1" cellpadding="2" cellspacing="2" align="center">
            <!--Se agrega un primer renglon-->
            <tr>
                <td height="30" colspan="2">
                    <!--Se inserta el elemento llamado header definido en el tiles.xml el cual es un jsp y se indica la ruta de este en el tiles.xml-->
                    <tiles:insertAttribute name="header"/>
                </td>
            </tr>
            <!--Se agrega un segundo renglon-->
            <tr>
                <td height="250">
                    <!--Se inserta el elemento llamado menu-->
                    <tiles:insertAttribute name="menu" />
                </td>
                <td width="350">
                    <!--Se inserta el elemento de body-->
                    <tiles:insertAttribute name="body"/>
                </td>
            </tr>
            <!--Se agrega un tercer renglon-->
            <tr>
                <!--Se agrega el elemento llamado footer-->
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="footer" />
                </td>
            </tr>
        </table>
    </body>
</html>

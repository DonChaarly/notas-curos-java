
package notas;

public class CabecerosDeRespuestaTeoria {
    
    /*
    Cabeceros de respuesta con Servlets
    Los cabeceros de respuesta indican al navegador web como debe comportarse ante
    una respuesta del servidor web
    
    Un ejemplo comun es general hojas de excel, pdfs, audio, video, etc
    en lugar de responder con solamente un texto plano
    
    Para indicar el tipo de respuesta se utiliza los tipos MIME(Multiporpose Intenet
    Mail Extensions)
    
    Los tipos MIME son un conjunto de especificaciones con el objetivo de intercambiar 
    archivos a travez de internet como puede ser texto, audio, video, entre otros tipos
    
    Para especificar un tipo mime primero hay que especificar el nombre del tipo mime 
    
    Ejemplos de tipos MIME mas comunes
    application/msword -> Microsoft word Document
    application/pdf ->  Acrobat (.pdf) file
    aplicacion/vndf.ms-excel -> excel spreadsheet
    application/vnd.mspowerpoint ->PowerPoint presentacion
    applicacion/zip ->Zip archive
    audio/x-wab -Microsoft Windows Sound file
    text/css -> HTML cascading styleSheet
    text/html -> HTML document
    text/xml -> XML document
    mage/gif -> GIF image
    image/jpeg -> JPEG image
    image/png -> PNG image
    image/mpeg -> MPEG video clip
    video/mpeg -> MPEG video clip
    video/quicktime -> QuickTime clip
    
    Metodos para establecer valores de los headers
    response.steHeader(String nombreCabecero, String valor cabecero)
    setDateHeader() y setIntHeader(), ponenen un cabcero, si ya existe lo remplazan
    Para agregar cabeceros:
    response.addHeader, addDateHader y addIntHeader agregan nuevos valores en lugar de reemplazarlos
    
    Metodos mas comunes para establecer valores de los headers:
    setContentType(Se utiliza la tabla MIME para establecer su valor)
    setContentLenght largo de contenido que vamos a responder al cliente 
    addCookie
    sendRedirect 
    
    Cabeceros de respuesta mas comunes
    Cache-Control y pragma: se utilizan para el control del cache
    Content-Encoding: indica la codificacion del documento
    Content-Lenght: idnica el numero de bytes en la respuesta 
    Content-Type: indica el tipo MIME a responder 
    Expires: indica el tiempo en el que el documento se considera expidardo
    Last-Modified:indica el tiempo en el que el documento fue modificado
    Refresh: indica al navegador los segundos en que carga la pagina
    Set-Cookie: agrega una cookie al navegador
    WWW-Authenticate: indica el tipo de autenticacion 
    
    
    */
    
}

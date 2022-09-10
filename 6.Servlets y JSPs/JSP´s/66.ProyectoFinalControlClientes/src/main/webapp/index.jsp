<%-- 
    En la pagina de index se agrega un meta el cual refrescara el navegador y llamara al Servlet servlet controlador de forma inmediata
    Con http-equiv indicaos que se hara un refresh
    En content se especifica el tiempo en segundos que va a pasar para que se realice el refresh
    Tambien se especifica el URL al cual le va a hacer refresh
--%>
<meta http-equiv="refresh" content="0;url=${pageContext.request.contextPath}/ServletControlador">

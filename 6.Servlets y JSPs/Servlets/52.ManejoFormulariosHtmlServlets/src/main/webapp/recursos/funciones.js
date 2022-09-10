//Este codigo esta escrito en JavaSrcipt

function validarForma(forma){
    let usuario = forma.usuario;
    if(usuario.value == "" || usuario.value == "Escribir Usuario"){
        //La funcion alerta manda un mensaje al usuario
        alert("Debe colocar un nombre de usuario");
        //La funcion focus coloca la atencion sobre la entrada
        usuario.focus();
        //La funcion select selecciona el texto del recuedro de la entrada
        usuario.select();
        return false;
    }
    
    let password = forma.password;
    if (password.value == "" || password.value.lenght < 3){
        alert("El password debe contener al menos tres caracteres");
        password.focus();
        password.select();
        return false;
    }
    
    let tecnologia = forma.tecnologia;
    let checkSeleccionado = false;
    for (var i = 0; i < tecnologia.length; i++) {
        //La funcion checked nos indica si el checkbotton se selecciono
        if(tecnologia[i].checked){
            checkSeleccionado = true;
        }
    }
    
    if (checkSeleccionado == false) {
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    
    let genero = forma.genero;
    let radiogenero = false;
    for (var i = 0; i < genero.length; i++) {
        if (genero[i].checked) {
            radiogenero = true;
        }
    }
    
    if (!radiogenero) {
        alert("Debe seleccionarse un genero");
        return false;
    }
    
    let ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion");
        ocupacion.focus();
        return false;
    }
    
    
    //El formulario ha sido validado
    return true;
}

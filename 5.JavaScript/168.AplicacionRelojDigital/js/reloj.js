function mostrarHora(){
    let fecha = new Date();
    let hora = fecha.getHours();
    let minutos = fecha.getMinutes();
    let segundos = fecha.getSeconds();
    document.getElementById("hora").innerHTML = `${hora}:${minutos}:${segundos}`;

    let dias = ["Dom", "Lun", "Mar", "Mie", "Jue", "Vie", "Sab"];
    let meses = ["Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"];
    let diaSemana = dias[fecha.getDay()];
    let dia = fecha.getDate();
    let mes = meses[fecha.getMonth()];
    let año = fecha.getFullYear();
    let fechaAño = `${diaSemana}, ${dia} ${mes} ${año}`;
    document.getElementById("fecha").innerHTML = fechaAño;

    //La funcion classList nos dice todas las clases que tiene el elemento html
    //toggle es una funcion que aplicara la clase una vez si y una no, y como estamos llamando nuestra funcion cada segundo, un segundo se llamara y otro no
    document.getElementById("contenedor").classList.toggle("animar");
}

setInterval(mostrarHora, 1000);
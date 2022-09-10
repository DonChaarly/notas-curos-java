console.log("Aplicacion Calculadora")

function sumar(){
    let datoA = Number(document.getElementById("datoA").value);
    let datoB = Number(document.getElementById("datoB").value);
    let resultado = 0;
    console.log(datoA);
    console.log(datoB);

    if(datoA == 0 || datoB == 0){
        resultado = "Rellena todos los campos";
    }else{
        resultado = "Resultado : " + (datoA + datoB);
    }
    document.getElementById("resultado").innerHTML = resultado;
}
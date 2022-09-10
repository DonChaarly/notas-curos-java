
//--------------------Funciones Callback--------------------------//
function miFuncion1(){
    console.log("Mi funcion 1");
}

function miFuncion2(){
    console.log("Mi funcion 2");
}

//Llamamos a las funciones 1 y 2
miFuncion1();
miFuncion2();

//Las Funciones callBack son funciones que obtienen como parametro otra funcion y despues la utilizan dentro de su codigo
function funcionOrden(miFuncion){
    miFuncion();
}

//Llamamos a la funcionOrden que llama a las funciones 1 y 2
funcionOrden(miFuncion1);
funcionOrden(miFuncion2);


//---------------------Otro ejemplo de funcion CallBack-------------------//

//Se tiene una funcion cualquiera
function imprimir(mensaje){
    console.log(mensaje);
}

//La funcion sumar pide como parametro otra funcion
function sumar(arg1, arg2, funcionCallback){
    let res = arg1 + arg2;
    funcionCallback(`Resultado: ${res}`);//Se hace uso de la funcion y se manda un parametro a esta
}

//Se utiliza la funcion sumar pasando como argumento la funcion imprimir sin pasar parametro a la funcion imprimir ni abriendo parentesis
sumar(5, 9, imprimir);

//--------------------Funciones asincronas con uso de metodo setTimeout--------------------------//

//Definimos una funcion 
function funcionSaludo(){
    console.log("Saludo asincrono 1 despues de 3s")
}

//Se utiliza la funcion setTimeout y se pasa como parametro la funcion que queremos que se ejecute y el tiempo que pase para que se ejecute, este tiempo es en milisegundo
setTimeout(funcionSaludo, 3000);

//Se puede definir la funcion a ejecutar directamente dentro del metodo setTimeout
setTimeout(function(){console.log("Saludo asincrono 2 despues de 4s")}, 4000);

//Se puede usar una funcion flecha para simplificar el codigo
setTimeout(() => {console.log("Saludo asincrono 3 despues de 5s")}, 5000);

//A pesar de que la funcion se escriba despues, su llamado esta determinado por el tiempo definido
setTimeout(() => console.log("Saludo asincrono 4 despues de 2s"), 2000);

//--------------------Funciones asincronas setInterval--------------------------//

//Definimos una funcion para llamar
let reloj = () => {
    let fecha = new Date();
    console.log(`${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`);
}

//Utilizamos el metodo setInterval y le pasamos como argumentos la funcion a ejecutar y el intervalo de tiempo en el que se ejecutara
setInterval(reloj, 1000);






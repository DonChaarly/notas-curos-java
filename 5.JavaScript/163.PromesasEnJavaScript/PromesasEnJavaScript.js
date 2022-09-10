//Las promesas son funciones que se ejecutan solo si se cumple la condicion, sino se cumple se manda un error
//La promesa recibe como parametro una funcion
let miPromesa = new Promise((resolver, rejected) => {
    let expresion = false;
    if(expresion){
        resolver ("Resolvio-Correcto");
    }else{
        rejected ("Se produjo un error");
    }
});

//Para llamar a una promesa se utiliza el nombre de la promesa y la funcion then, esta funcion tendra como parametros dos funciones
miPromesa.then(valor => console.log(valor), error => console.log(error));

//Otra forma de llamar a la promesa es la siguiente
miPromesa.then(valor => console.log(valor)).catch(error => console.log(error));

//----------------Promesas con setTimeout----------------//

let miPromesa2 = new Promise( (resolver) => {
    console.log("Inicio de Promesa");
    setTimeout( () => resolver ("Saludos con promesa setTimeout"), 3000);
    console.log("Fin de promesa");
});

miPromesa2.then(valor => console.log(valor));

//-----------------Palabra Async con promesas-------------//

//Async indica que una funcion regresa una promesa

//Al usar async se simplifica el uso de promesas, ya no se tienen que indicar fnciones como parametros en la promesa
async function miFuncionConPromesa(){
    return "Saludos con promesa y async"; // Este codigo es el que regresara en vez de la funcion resolver
}

//Es igual llamara a una promesa con async, solamente que se tienen que poner parentesis en la funcion ahora
miFuncionConPromesa().then(valor => console.log(valor));

//--------------Async con Await en Promesas--------------//


async function funcionConPromesaYAwait(){
    //Dentro de la funcion promesa se define la promesa que se va a ejecutar
    let miPromesa = new Promise ((resolver) => {
        resolver ("Promesa con await");
    });
    //Await solo se puede ejecutar dentro de una promesa con async
    console.log(await miPromesa);
}

//Con await ya no se tiene que colocar .then(valor => console.log(valor));
funcionConPromesaYAwait();

//----------------Promesas con await, async, setTimeout-------------------//

async function promesaEjemploFinal(){
    console.log("inicio de promesa con await y setTimeout");
    let miPromesa = new Promise (resolver => {
        setTimeout( () => resolver ("Promesa con Await y setTimeout despues de 3s"), 3000);
    });
    console.log(await miPromesa);
    console.log("Fin de promesa con await y setTimeout");
}

promesaEjemploFinal();
/*
    Diferencias en Java y JavaScript
    La principal diferencia es que en Java no se puede modificar la cantidad de elementos que contiene el arreglo una vez definido, en JavaScript si se puede
    En JavaSrcrit se puede agregar un elemento utilizando la funcion push();
    En JavaScrit se puede preguntar si un elemento es un arreglo con la Clase y funcion Array.isArray()
*/

/*
En Java la sintaxis es:
String auos = new String[4]
En JavaScrit es:
let autos = new Array('BMW','Mercedes Benz','Volvo');
*/
const autos = ['BMW','Mercedes Benz','Volvo'];
console.log(autos);

console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i + ' : ' + autos[i] );
}

autos[1] = 'MerecedesBenz';
console.log(autos[1]);

autos.push('Audi');
console.log(autos);

console.log(autos.length);
autos[autos.length] = 'Cadillac';

console.log(autos);

autos[6] = 'Porshe';
console.log(autos);

console.log(typeof autos);

console.log( Array.isArray(autos) );

console.log( autos instanceof Array);
let miNumero = "18";
console.log(typeof miNumero);

//Para convertir una cadena a numero en JavaScript se ocupa la funcion Number | En Java se ocupa la clase Integer.parseInt("cadena")
let edad = Number(miNumero);
console.log(typeof edad);

//Cuando la cadena contiene un caracter que no corresponde a un numero se regresara un NaN(Not a Number)
let notANumber = "18x";
let prueba = Number(notANumber);
console.log(prueba);

//Podemos preguntar si prueba es un numero con la funcion isNaN
let resultado = (isNaN(prueba)) ? "Resultado no es un numero" : "Resultado es un numero";
console.log(resultado)


/*
Diferencias con Java:
    Para imprimir ya no se utiliza System.out.println, ahora se utiliza console.log();
    Las variables son dinamicas, pueden cambiar su tipo en el momento que queramos
    Una funcion es lo mismo que un metodo
    Con Typeof podemos saber el tipo de la variable
    No se recomienda utilizar var, se utiliza let o const
    El operador de asignacion == en JavaScript compara el contenido de las variables, en Java compara la referencia de la variable
    Tambien se tiene === en JavaScript, este operador compara tambien el tipo de la variable
*/
//Tipo de dato string
var nombre = "Carlos";
console.log(typeof nombre);

nombre = 10.5;
console.log(typeof nombre);

//Tipo de dato numerico
var numero = 1000;
console.log(numero);

//Tipo de dato object
var objecto = {
    nombre : "Juan",
    apellido : "Perez",
    telefono : "55443322"
}
console.log(typeof objecto);

//Tipo de dato boolean (true, false)
var bandera = false;
console.log(typeof bandera);

//Tipo de dato function
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato SymbolP
var simbolo = Symbol("mi simbolo");
console.log(typeof simbolo);

//Tipo clase es una function
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

//Tipo undefined
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

//null = ausencia de valor
var y = null;
console.log(typeof y);

//arreglo en JavaScript
var autos = ['BMW','Audi','Volvo'];
console.log(autos);
console.log(typeof autos);

//Cadena vacia (empty string)
var z = '';
console.log(z);
console.log(typeof z);

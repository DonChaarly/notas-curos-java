/*
    Diferencias entre Java y JavaScript
    En JavaScript las funiones o metodos no tienen modificadores de acceso como public static, etc. 
    y no dicen si van a regresar un entero o algo, solo se coloca la sentencia funtion elNombre(y, los, argumentos)
    Tambien no es necesario ingresar todos los argumentos que te pide un metodo
    Se pueden colocar valores por default a los parametros de los metodos
    No es necesario que el numero de argumentos coincida con el de los parametros, se pueden colocar mas argumentos de los necesarios
*/

//Declaración de la función
function miFuncion(a = 10, b = 20){//Se pueden colocar argumentos por default
    console.log(arguments.length);//Con arguments.length se obtiene el numero de argumentos de la funcion
    return a + b;
}

//Llamando a la función
let resultado = miFuncion(2, 3);
console.log(resultado);

//Declaración Función de tipo Expresión
//a una variable se le asigna una funcion y la funcion no tiene nombre
let sumar = function (a, b){return a + b};

resultado = sumar(1, 2);
console.log(resultado);

//Funciones de tip self Invoking, osea se invocan a si misma pero solamente una vez, tambien son anonimas osa que no tienen un nombre
(function (a, b){
    console.log('Ejecutando la función: ' + (a + b));
})(3, 4);

console.log(typeof miFuncion);

var miFuncionTexto = miFuncion.toString();
console.log(miFuncionTexto);

//Funcion tipo flecha
const sumarFuncionTipoFlecha = (a, b) => a + b;
resultado = sumarFuncionTipoFlecha(3, 5);
console.log(resultado);

//Paso por valor
let x = 10;

function cambiarValor(a){
    a = 20;
}
cambiarValor(x);//10
console.log(x);

//Paso por referencia
const persona = {
    nombre: 'Juan',
    apellido: 'Perez'
}

function cambiarValorObjeto(p1){
    p1.nombre = 'Carlos';
    p1.apellido = 'Lara';
}

cambiarValorObjeto( persona );
console.log( persona );
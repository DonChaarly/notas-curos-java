/*
    Diferencias entre JavaScript y Java
    Los objetos en JavaScript no deben tener necesariamente una clase, se pueden crear y dotarlos con propiedades o metodos
    al mismo tiempo.
    Se puede crear tambien un constructor sin necesidad de tener una clase asociada o un objeto
    Al igual que todos los tipos de datos, solo se coloca let o cons en vez de la clase o el tipo de dato que es como en Java
    Al imprimir los obetos, no importa si no se tiene el metodo toString, se imprimira los atributos del objeto
*/

//Esta es la fomra mas comun de crear un objeto
let persona = {//Se abren llaves para definir los atributos o propiedades del objeto
    nombre: "Carlos",//se define un atributo y los demas tienen que estar separador por una coma
    apellido: "Santana",
    email: "csantana@mail.com",
    edad: 28,
    idioma: "es",
    //Para agregar un metodo al objeto se tiene que colocar el nombre de la "propiedad" y a este asignarle la funcion, no se puede empezar colocando la palabra funtion
    nombreCompleto: function(){
        return this.nombre + " " + this.apellido;
    },
    //Se puede agregar una fucnion get y de esta forma simplificar la forma en que se llama a la funcion
    get nombreCompletito (){
        return this.nombre + " " + this.apellido;
    },
    get lang () {
        return this.idioma.toUpperCase();//Con toUpperCase la cadena se vuele en mayusculas
    },
    //Se puede agregar tambien un metodo set para modificar alguna propiedad
    set lang ( lang ){
        this.idioma = lang.toUpperCase();
    }
}

//Se puede acceder a los atributos del objeto con un punto
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona.nombreCompleto());//sin get
console.log(persona.nombreCompletito);//con get
//Se puede imprimir todo el objeto tambien
console.log(persona);

//Esta es otra forma de crear un objeto
let persona2 = new Object();//Con new Object se reserva espacio en memoria para el objeto
//Se pueden ir agregando propiedaades dinamicamente
persona2.nombre = "Pablo";
persona2.direccion = "Av. Renacuajo"
persona2.tel = "555999658"
console.log(persona2.tel);


//Formas de acceder a las propiedades de los objetos
console.log(persona2["nombre"]);//Se puede acceder utilizando corchetes y el nombre de la propiedad como string

//For in
for(nombrePropiedad in persona2){//Este for es como un for each que recorre las propiedades del objeto que indiquemos, se coloca una variabe segido de la palabra in y el objeto que queremos recorrer
    console.log(nombrePropiedad);
    console.log(persona2[nombrePropiedad]);
}

//Para eliminar una propiedad de un objeto se coloca la sentencia delete y la propiedad que queremos borrar
console.log(persona2);
delete persona2.tel;
console.log(persona2);

//Formas de imprimir un objeto

console.log(persona2);//Se puede llegara tener errores en navegadores con esta forma
console.log(persona2.nombre + ", " + persona2.direccion);//Concatenando cada valor
for(nombrePropiedad in persona2){//Con un for in
    console.log(persona2[nombrePropiedad]);
}
let personaArray = Object.values( persona2 );//Con el metodo values
console.log(personaArray);
let personaString = JSON.stringify( persona2 );//Con el metodo stringify
console.log(personaString);

//Prueba de codigo set y get
console.log(persona.lang);
persona.lang = "us";
console.log(persona.idioma);
console.log(persona.lang);

//Constructores en JavaScript
function Individuo (nombre, apellido, email){
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    //Se pueden agregar metodos a los constructores
    this.nombreCompleto = function(){
        return this.nombre + " " + this.apellido;
    }
}

let padre = new Individuo("Juan", "Orozco", "jorozco@mail.com");
let madre = new Individuo("Leticia", "Snachez", "lsanchez@mail.com");

console.log(padre);
console.log(padre.nombreCompleto());
console.log(madre);
console.log(madre.nombreCompleto());

//Formas de crear objetos de cualquier tipo
let miObjeto = new Object();
let miObjeto2 = {};

let miaCdena = new String("Hola");
let miCadena2 = "Hola";

let miNumber = new Number(1);
let miNumber2 = 2;

let miBoolean = new Boolean(false);
let miBoolean2 = false;

let miArray = new Array();
let miArray2 = [];

let miFuncion = new Function();
let miFuncion2 = function(){};

//Funcion Prototype, nos sirve para agregar un nuevo atributo al constructor desde cualquier otra parte

Individuo.prototype.tel = "55889966";

padre.tel = "44566697"
console.log(padre.tel);
console.log(madre.tel);

//Metodo call y metodo apply, este metodo nos ayudara a poder utilizar metodos que estan definidos en otros objetos

let persona1 = {
    nombre: "Carlos",
    apellido: "Sanchez",
    nombreCompleto: function(titulo, tel){
        return titulo + " " + this.nombre + " " + this.apellido + " " + tel;
    }
}

let persona3 = {
    nombre: "Juan",
    apellido: "Vasquez"
    //La funcion nombreCompleto no esta definida en este objeto
}

console.log(persona1.nombreCompleto("Dr.", "55599782"));
//Se hace uso de call y se pasa el parametro del objeto donde lo requerimos, asi como los parametros que nos pide el metodo
console.log(persona1.nombreCompleto.call(persona3, "Ing.", "555888879"));

//Se hace uso de apply, pero para pasar argumentos se debe hacer uso de un arreglo
let miArreglo = ["Ing.", "555888879"];
console.log(persona1.nombreCompleto.apply(persona3, miArreglo));
console.log(persona1.nombreCompleto.apply(persona3, ["Ing.", "555888879"]));
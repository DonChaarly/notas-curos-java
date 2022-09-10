/*
    Diferencias entre Java y JavaScript:
    En JavaScrpt no se tienen modificadores de acceso 
    La sintaxys para definir constructores cambia un poco pero su funcion sigue igual
    Se tiene que definir la clase al principio del codigo para poder utilizarla
    En JavaScripttambien se tiene la palabra static para los metodos y atributos

*/
//No se puede crear un objeto antes de definir la clase
//let person3 = new Persona("Pedro", "Juarez");

class Persona {

    //Se pueden crear atributos estaticos
    static contadorObjetodsPersona = 0;

    //Los atributos no estaticos no llevan la palabra static o let
    email = "Valor por default de email";

    constructor (nombre, apellido){
        //Es buena practica comenzar el nombre del atributo con un guion bajo
        this._nombre = nombre;
        this._apellido = apellido;
        //Los atributos static se llaman con el nombre de la clase
        Persona.contadorObjetodsPersona++;
    }

    //Metodos get y set de los atributos
    get nombre(){
        return this._nombre;
    } 
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }

    //Funcion definida en clase padre, no se necesita colocar la sentencia function
    nombreCompleto (){
        return this._nombre + " " + this._apellido;
    }

    //Metodo toString
    toString (){
        //Aplicamospolimorfismo(multiples formas en tiempo de ejecucion)
        //El metodo que se ejecuta depende si es una referencia de tipo Padre o hijo
        return this.nombreCompleto();
    }

    //Metodo estatico
    static saludar(){
        console.log("Saludos desde metodo static")
    }
    static saludar2(persona){
        console.log(persona.nombre + " " + persona.apellido);
    }
}

//Clase hija de Persona
class Empleado extends Persona{

    constructor(nombre, apellido, departamento){
        super(nombre, apellido);//Se llama al constructor de la clase padre para inicializar los atributos de nombre y apellido
        this._departamento = departamento;
    }

    //Metodos get y set de los atributos de clase hija
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }

    //Sobreescritura del metodo nombreCompleto
    nombreCompleto(){
        return super.nombreCompleto() + ", " + this._departamento;
    }

}

//Objetos de clase padre
let persona1 = new Persona("Carlos", "Sanchez");
console.log( persona1 );
console.log(persona1.nombreCompleto());

let persona2 = new Persona("Karla", "Hernandez");
console.log( persona2 );
persona2.nombre = "Paula"; // set nombre ("Paula")
console.log(persona2.nombre);//get nombre
console.log(persona2.toString());//Metodo toString

//Objetos de clase hija
let empleado1 = new Empleado("Maria", "Lara", "Sistemas");
console.log( empleado1 );
console.log( empleado1.nombre);//Acceso a metodo de clase Padre
console.log( empleado1.nombreCompleto());//Acceso a funcion sobreescrita de la clase padre
console.log( empleado1.toString());//Metodo toString

//Los metodos estaticos se asocian a las clases no a los objetos, se les tiene que llamar usando las clase
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();//Las clases hijas tambien heredan los metodos static
Empleado.saludar2(empleado1);

//Atributos static
console.log(persona1.contadorObjetodsPersona);//Al ser un atributo estatico no puede ser llamado por medio de los objetos
console.log(Persona.contadorObjetodsPersona);//El atributo puede ser llamado con la clase padre
console.log(Empleado.contadorObjetodsPersona);//O la clase hija

//Atributos no static
console.log(persona1.email);
console.log(empleado1.email);
console.log(Persona.email);

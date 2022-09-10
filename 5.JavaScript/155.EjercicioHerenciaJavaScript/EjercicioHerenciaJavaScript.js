class Persona {

    static contadorPersonas = 0;

    constructor(nombre, apellido, edad){
        this._nombre = nombre;
        this._apellido = apellido;
        this._edad = edad;
        this._idPersonas = ++Persona.contadorPersonas;
    }

    get idPersonas(){
        return this._idPersonas;
    }
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
    get edad(){
        return this._edad;
    }
    set edad(edad){
        this._edad = edad;
    }

    toString (){
        return this.idPersonas + ". " + this.nombre + " " + this.apellido + ", " + this.edad + " años, ";  
    }

}

class Empleado extends Persona{
    
    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido, edad);
        this._sueldo = sueldo;
        this._idEmpleado = ++Empleado.contadorEmpleados;
    }

    get idEmpleado(){
        return this._idEmpleado;
    }
    get sueldo(){
        return this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }

    toString (){
        return super.toString() + " Empleado: "+ this.idEmpleado + ", " + this.sueldo;
    }

}

class Cliente extends Persona{

    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fechaRegistro){
        super(nombre, apellido, edad);
        this._fechaRegistro = new Date(fechaRegistro);
        this._idCliente = ++Cliente.contadorClientes;
    }

    get idCliente(){
        return this._idCliente;
    }
    get fechaRegistro(){
        return this._fechaRegistro;
    }
    set fechaRegistro(date){
        this._fechaRegistro = this.fechaRegistro;
    }

    toString (){
        return super.toString() + " Cliente: " + this.idCliente + ", " + this.fechaRegistro;
    }
}

let persona1 = new Persona("Jesus", "Perez", 51);
console.log(persona1.toString());

let persona2 = new Persona("Robert", "Ramirez", 15);
console.log(persona2.toString());

let empleado1 = new Empleado("Julio", "Cuevas", 15, 5000)
console.log(empleado1.toString());

let empleado2 = new Empleado("Pablo", "Robles", 21, 8000);
console.log(empleado2.toString());

let cliente1 = new Cliente("Rulo", "Marquez", 29, new Date());
console.log(cliente1.toString());

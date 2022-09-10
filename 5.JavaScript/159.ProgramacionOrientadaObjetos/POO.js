class Empleado{
    constructor(nombre, sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    obtenerDetalles(){
        return `Empleado: nombre: ${this.nombre}, sueldo: ${this.sueldo}`;
    }
}

class Gerente extends Empleado{
    constructor(nombre, sueldo, departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    //Sobreescritura, se soobrescribe un metodo de la clase padre
    obtenerDetalles(){
        return `Gerente: ${super.obtenerDetalles()} depto: ${this.departamento}`;
    }
}


function determinarTipo(tipo){
    //Polimorfismo, dependiendo del tipo de variable, se tendra un comportamiento distinto del metodo
    console.log( tipo.obtenerDetalles() );
    //InstanceOf, se pregunta si la variable es una instancia de una clase
    if(tipo instanceof Gerente){
        console.log('Es un objeto de tipo Gerente');
        console.log(tipo.departamento);
    }
    else if(tipo instanceof Empleado){
        console.log('Es un tipo Empleado');
        console.log(tipo.departamento);
    }
    else if(tipo instanceof Object){
        console.log('Es un tipo Object');
    }
}

let empleado1 = new Empleado('Juan', 3000);
let gerente1 = new Gerente('Carlos', 5000, 'Sistemas');

determinarTipo( empleado1 );
determinarTipo( gerente1 );


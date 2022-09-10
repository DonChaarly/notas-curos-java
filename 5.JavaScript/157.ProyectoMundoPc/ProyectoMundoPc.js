class DispositivoEntrada {

    constructor(tipoEntrada, marca){
        this._tipoEntrada = tipoEntrada;
        this._marca = marca;
    }

    get tipoEntrada(){
        return this._tipoEntrada;
    } 
    set tipoEntrada(tipoEntrada){
        this._tipoEntrada = tipoEntrada;
    }
    get marca(){
        return this._marca;
    }
    set marca(marca){
        this._marca = marca;
    }
}

class Raton extends DispositivoEntrada{

    static contadorRatones = 0;

    constructor(tipoEntrada, marca){
        super(tipoEntrada, marca);
        this._idRaton = ++Raton.contadorRatones;
    }
    get idRaton(){
        return this._idRaton;
    }

    toString(){
        return `Raton ${this._idRaton} con entrada tipo ${this._tipoEntrada} de la marca ${this._marca}`
    }
}

class Teclado extends DispositivoEntrada{

    static contadorTeclados = 0;

    constructor(tipoEntrada, marca){
        super(tipoEntrada, marca);
        this._idTeclado = ++Teclado.contadorTeclados;
    }

    get idTeclado(){
        return this._idTeclado;
    }

    toString(){
        return `Teclado ${this._idTeclado} con entrada tipo ${this._tipoEntrada} de la marca ${this._marca}`
    }
}

class Monitor{
    
    static contadorMonitores = 0;

    constructor (marca, tamano){
        this._idMonitor = ++Monitor.contadorMonitores;
        this._marca = marca;
        this._tamano = tamano;
    }

    get tamano(){
        return this._tamano;
    } 
    set tamano(tamano){
        this._tamano = tamano;
    }
    get marca(){
        return this._marca;
    }
    set marca(marca){
        this._marca = marca;
    }

    toString(){
        return `Monitor ${this._idMonitor} de ${this._tamano}" dela marca ${this._marca}`
    }
}

class Computadora{
    static contadorComputadoras = 0;

    constructor(nombre, monitor, teclado, raton){
        this._idComputadora = ++Computadora.contadorComputadoras;
        this._nombre = nombre;
        this._monitor = monitor;
        this._teclado = teclado;
        this._raton = raton;
    }

    get nombre(){
        return this._nombre;
    } 
    set nombre(nombre){
        this._nombre = nombre;
    }
    get monitor(){
        return this._monitor;
    }
    set monitor(monitor){
        this._monitor = monitor;
    }
    get teclado(){
        return this._teclado;
    }
    set teclado(teclado){
        this._teclado = teclado;
    }
    get raton(){
        return this._raton;
    }
    set raton(raton){
        this._raton = raton;
    }

    toString(){
        return `idComputadora ${this._idComputadora}. Computadora de ${this.nombre}:
Monitor: ${this._monitor}
Teclado: ${this._teclado}
Raton: ${this._raton}
`
    }
}

class Orden{
    
    static conntadorOrdenes = 0;

    constructor(){
        this._idOrden = ++Orden.conntadorOrdenes;
        this._computadoras = [];
        this._contadorComputadoras = 0;
    }

    agregarComputadora(computadora){
        ++this._contadorComputadoras;
        this._computadoras.push(computadora);
    }

    toString(){
        let computadorasCadena = "";
        for (let computadora of this._computadoras){
            computadorasCadena += "\n" + computadora.toString()
        }
        return `Orden ${this._idOrden}:
Cantidad total de computadoras: ${this._contadorComputadoras}
${computadorasCadena}`
    }

    mostrarOrden(){
        console.log(this.toString());
    }

}

let raton1 = new Raton("USB", "HP");
let raton2 = new Raton("Cmini", "Apple");
let raton3 = new Raton("USB", "Toshiba");

let teclado1 = new Teclado("USB", "Razer");
let teclado2 = new Teclado("Cmini", "Apple");
let teclado3 = new Teclado("USB", "Pavilon");

let monitor1 = new Monitor("Sony", 32);
let monitor2 = new Monitor("Samsung", 42);
let monitor3 = new Monitor("Sony", 16);

let computadora1 = new Computadora("Gamer", monitor1, teclado1, raton1);
let computadora2 = new Computadora("Diseñador Grafico", monitor2, teclado2, raton2);
let computadora3 = new Computadora("Oficina", monitor3, teclado3, raton3);

let orden1 = new Orden();
orden1.agregarComputadora(computadora1);
orden1.agregarComputadora(computadora2);

orden1.mostrarOrden();
console.log(orden1.toString());

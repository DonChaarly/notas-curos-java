const ingresos = [
    new Ingreso("Salario", 2100.00),
    new Ingreso("Venta coche", 1500)
];

const egresos = [
    new Egreso("Renta departamento", 900),
    new Egreso("Ropa", 400),
];

let cargarApp = () => {
    cargarCabecero();
    cargarIngresos();
    cargarEgresos();
};

let calcularIngesos = () => {
    let totalIngreso = 0;
    for(let ingreso of ingresos){
        totalIngreso += ingreso.valor;
    }
    return totalIngreso;
};
let calcularEgresos = () => {
    let totalEgreso = 0;
    for(let egreso of egresos){
        totalEgreso += egreso.valor;
    }
    return totalEgreso;
};

let cargarCabecero = () => {
    let presupuesto = calcularIngesos() - calcularEgresos();
    let porcentaje = calcularEgresos()/calcularIngesos();

    document.getElementById("presupuesto").innerHTML = formatoMoneda(presupuesto);
    document.getElementById("porcentaje").innerHTML = fromatoPorcentaje(porcentaje);
    document.getElementById("ingresos").innerHTML = formatoMoneda(calcularIngesos());
    document.getElementById("egresos").innerHTML = formatoMoneda(calcularEgresos());
};

//  Para dale formato al dinero se utilizara el concepto de Internationalization, el cual es usado tambien para fechas
const formatoMoneda = (valor) => {
    //toLocaleString es una funcion que nos regresara el formato adecuado segun el idoma y moneda que especifiquemos
    //dentro de las llaves se indica el atributo y los valores que queremos utilizar
    return valor.toLocaleString("en-MX", {style:"currency", currency: "MNX", minimumFractionDigits:2});
};

const fromatoPorcentaje = (valor) => {
    return valor.toLocaleString("en-US", {style:"percent", minimumFractionDigits:2});
};

const cargarIngresos =() => {
    let ingresoHTML = "";
    for(let ingreso of ingresos){
        ingresoHTML += crearIngreso(ingreso);
    }
    document.getElementById("lista-ingresos").innerHTML = ingresoHTML;
};

const crearIngreso = (ingreso) => {
    return `
<div class="elemento limpiarEstilos">
    <div class="elemento_descripcion">${ingreso.descripcion}</div>
    <div class="derecha limpiarEstilos">
        <div class="elemento_valor">+${formatoMoneda(ingreso.valor)}</div>
        <div class="elemento_eliminar">
            <button class="elemento_eliminar--btn">
                <ion-icon name="close-circle-outline"
                    onclick="eliminarIngreso(${ingreso.idIngreso})"></ion-icon>
            </button>
        </div>
    </div>
</div>
    `
};

const eliminarIngreso = (idIngreso) => {
    //el metodo findIndex regresa el indice del elemento que indiquemo por medio de la comparacion de id
    let indiceEliminar = ingresos.findIndex(ingreso => ingreso.idIngreso === idIngreso);
    //el metodo splice eliminar un elemento del arreglo y debemos proporcionarle el indice al que corresponde el elemento, el 1 corresponde al numero de elementos que eliminara
    ingresos.splice(indiceEliminar, 1);
    cargarIngresos();
    cargarCabecero();
};

const cargarEgresos = () => {
    let egresosHTML = "";
    for(let egreso of egresos){
        egresosHTML += crearEgreso(egreso);
    }
    document.getElementById("lista-egresos").innerHTML = egresosHTML;
};

const crearEgreso = (egreso) => {
    return `
<div class="elemento limpiarEstilos">
    <div class="elemento_descripcion">${egreso.descripcion}</div>
    <div class="derecha limpiarEstilos">
        <div class="elemento_valor">-${formatoMoneda(egreso.valor)}</div>
        <div class="elemento_porcentaje">${fromatoPorcentaje(egreso.valor/calcularEgresos())}</div>
        <div class="elemento_eliminar">
            <button class="elemento_eliminar--btn">
                <ion-icon name="close-circle-outline"
                    onclick="eliminarEgreso(${egreso.idEgreso})"></ion-icon>
            </button>
        </div>
    </div>
</div>
    `
};

const eliminarEgreso = (idEgreso) => {
    let indiceEliminar = egresos.findIndex(egreso => egreso.idEgreso === idEgreso);
    egresos.splice(indiceEliminar, 1);
    cargarEgresos();
    cargarCabecero();
};

let agregarDato = () => {
    let forma = document.forms["forma"];
    let tipo = forma["tipo"];
    let descripcion = forma["descripcion"];
    let valor = forma["valor"];
    if(descripcion.value !== "" && valor.value !== ""){
        if(tipo.value === "ingreso"){
            //El + convierte a numero la posible cadena que estamos recuperando
            ingresos.push( new Ingreso(descripcion.value, +valor.value));
            cargarIngresos();
        }
        else if(tipo.value === "egreso"){
            egresos.push( new Egreso(descripcion.value, +valor.value));
            cargarEgresos();
        }
    }
    cargarCabecero();
};
class Producto{

    static contadorProductos = 0;

    constructor(nombre, precio){
        this._nombre = nombre;
        this._precio = precio;
        this._idProducto = ++Producto.contadorProductos;
    }

    get nombre(){
        return this._nombre;
    }
    set nombre (nombre){
        this._nombre = nombre;
    }
    get precio(){
        return this._precio;
    }
    set precio(precio){
        this._precio = precio;
    }
    get idProducto(){
        return this._idProducto;
    }

    toString(){
        return `idProducto: ${this._idProducto}. nombre: ${this._nombre} Precio: $${this._precio}`;
    }

}

class Orden{
    static contadorOrdenes = 0;
    static get _MAX_PRODUCTOS (){
        return 5;
    }

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden._MAX_PRODUCTOS){
            this._productos.push(producto);
            //this._productos[this._contadorProductosAgregados++] = producto; //Este es otro metodo para agregar un articulo al arreglo
        }else{
            console.log("Se ha superado el maximo de productos");
        }
    }

    calcularTotal(){
        let total = 0;
        for(let producto of this._productos){
            total += producto.precio;
        }
        return total;
    }

    toString(){
        let productosCdena = "";
        for (let producto of this._productos){
            productosCdena += "\n        " + producto.toString()  
        }
        let total = this.calcularTotal();
        return `
        Orden ${this._idOrden}: 
        Cantidad de Productos: ${this._productos.length}
        Productos:
        ${productosCdena}
        Total: $${total}`;
    }
}

let producto1 = new Producto("Cereal", 25);
let producto2 = new Producto("Carne de chivo", 85);
let producto3 = new Producto("Pastillas", 10);
let producto4 = new Producto("Camisa", 120);

let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto3);
orden1.agregarProducto(producto4);
console.log(orden1.toString());

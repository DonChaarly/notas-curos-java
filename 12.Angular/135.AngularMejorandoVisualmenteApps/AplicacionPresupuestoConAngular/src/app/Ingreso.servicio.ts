import { Injectable } from "@angular/core";
import { Ingreso } from "./ingreso.model";

//Se agrega export para poder utilizar esta clase desde otros componentes y se define la clase y se coloca el decorador Injectable par poder ser iyectable en otras clases
@Injectable()
export class IngresoServicio{

  //Se define un arreglo de ingresos
  ingresos: Ingreso[] = [
    new Ingreso("Salario", 4000),
    new Ingreso("Venta Coche",500)];



  //Se define un mtodo con el cual vamos a agregar un ingreso
  agregarIngreso(ingreso: Ingreso) {
    this.ingresos.push(ingreso);
  }

  eliminarIngreso(ingreso: Ingreso){
    const index: number = this.ingresos.indexOf(ingreso);
    this.ingresos.splice(index,1);
  }



}




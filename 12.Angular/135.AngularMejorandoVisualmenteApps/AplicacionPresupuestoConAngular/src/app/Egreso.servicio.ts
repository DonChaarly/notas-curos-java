import { Injectable } from "@angular/core";
import { Egreso } from "./Egreso.model";

//Se agrega export para poder utilizar esta clase desde otros componentes y se define la clase y se coloca el decorador Injectable par poder ser iyectable en otras clases
@Injectable()
export class EgresoServicio{

    //Se define un arreglo de ingresos
    egresos: Egreso[] = [
      new Egreso("Renta Depto", -900),
      new Egreso("Ropa",-200)];


    //Se define un mtodo con el cual vamos a agregar un ingreso
    agregarEgreso(ingreso: Egreso) {
      this.egresos.push(ingreso);
    }

    eliminarEgreso(egreso: Egreso){
      const index: number = this.egresos.indexOf(egreso);
      this.egresos.splice(index,1);
    }

}





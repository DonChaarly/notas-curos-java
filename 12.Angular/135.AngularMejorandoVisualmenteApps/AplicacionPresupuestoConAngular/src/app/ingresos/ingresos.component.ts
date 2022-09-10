import { IngresoServicio } from './../Ingreso.servicio';
import { Ingreso } from '../ingreso.model';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-ingresos',
  templateUrl: './ingresos.component.html',
  styleUrls: ['./ingresos.component.css']
})
export class IngresosComponent implements OnInit {

  ingresos: Ingreso[] = [];
  index:number;


  constructor(private ingresoServicio: IngresoServicio) { }

  ngOnInit(): void {
    this.ingresos = this.ingresoServicio.ingresos;
  }

  eliminarElemento(ingreso: Ingreso){
    this.ingresoServicio.eliminarIngreso(ingreso);
  }

}

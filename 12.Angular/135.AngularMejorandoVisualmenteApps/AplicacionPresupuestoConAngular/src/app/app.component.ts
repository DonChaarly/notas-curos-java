import { EgresoServicio } from './Egreso.servicio';

import { Component, OnInit } from '@angular/core';
import { Egreso } from './Egreso.model';
import { Ingreso } from './ingreso.model';
import { IngresoServicio } from './Ingreso.servicio';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  //Se definen los atributos los cuales podran ser llamados desde la vista
  ingresos: Ingreso[] = [];
  egresos: Egreso[] = [];
  ingreso: Ingreso;

  constructor(private ingresoServicio: IngresoServicio, private egresoServicio: EgresoServicio){
    this.ingresos =this.ingresoServicio.ingresos;
    this.egresos = this.egresoServicio.egresos;
  }

  ngOnInit(): void {

  }

  getIngresoTotal(){
    let ingresoTotal: number = 0;
    this.ingresos.forEach(ingreso =>{
      ingresoTotal += ingreso.valor
    });
    return ingresoTotal;
  }

  getEgresoTotal(){
    let egresoTotal: number = 0;
    this.egresos.forEach(egreso =>{
      egresoTotal += egreso.valor
    });
    return egresoTotal;
  }

  getPorcentajeTotal(){
    return this.getEgresoTotal()/this.getIngresoTotal();
  }

  getPresupuestoTotal(){
    return this.getIngresoTotal() + this.getEgresoTotal();
  }




}


import { Component, Input, OnInit } from '@angular/core';
import { Egreso } from '../Egreso.model';
import { EgresoServicio } from '../Egreso.servicio';


@Component({
  selector: 'app-egresos',
  templateUrl: './egresos.component.html',
  styleUrls: ['./egresos.component.css']
})
export class EgresosComponent implements OnInit {

  egresos: Egreso[] = [];
  @Input() ingresoTotal: number;


  constructor(private egresoServicio: EgresoServicio) { }

  ngOnInit(): void {
    this.egresos = this.egresoServicio.egresos;
  }

  eliminarElemento(egreso: Egreso){
    this.egresoServicio.eliminarEgreso(egreso);
  }

  calcularPorcentaje(egreso: Egreso){
    return egreso.valor/this.ingresoTotal;
  }

}

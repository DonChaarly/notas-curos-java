import { Ingreso } from '../ingreso.model';
import { EgresoServicio } from './../Egreso.servicio';
import { IngresoServicio } from './../Ingreso.servicio';
import { Component, Inject, Injectable, OnInit } from '@angular/core';
import { Egreso } from '../Egreso.model';


@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  //Se definen los atributos del componente
  tipo: string = "ingreso";
  descripcion: string;
  valor: number;


  //Se agregan nuestros servicios al constructor par poder usar sus metodos
  constructor(private ingresoServicio: IngresoServicio, private egresoServicio: EgresoServicio) { }

  ngOnInit(): void {
  }

  tipoOperacion(evento: any){
    this.tipo = evento.target.value;
  }

  agregarRecurso(){
    if(this.tipo === "ingreso"){
      if(this.valor < 0){
        this.valor = -(this.valor);
      }
      let ingreso1 = new Ingreso(this.descripcion, this.valor);
      this.ingresoServicio.agregarIngreso(ingreso1);
    }else{
      if(this.valor > 0){
        this.valor = -(this.valor);
      }
      let Egreso1 = new Egreso(this.descripcion, this.valor);
      this.egresoServicio.agregarEgreso(Egreso1);
    }

  }

}

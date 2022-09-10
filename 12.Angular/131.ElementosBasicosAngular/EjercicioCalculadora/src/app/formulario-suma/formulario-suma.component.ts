import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-formulario-suma',
  templateUrl: './formulario-suma.component.html',
  styleUrls: ['./formulario-suma.component.css']
})
export class FormularioSumaComponent {

  titulo = "Aplicacion Calculadora";
  sumandoA = 0;
  sumandoB = 0;
  resultado = 0;

  sumar():void{
    this.resultado = this.sumandoA + this.sumandoB;
  }




}

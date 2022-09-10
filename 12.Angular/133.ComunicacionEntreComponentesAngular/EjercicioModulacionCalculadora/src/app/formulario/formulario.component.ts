import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent {

  //133 Se define una variable llamada resuladoObtenido el cual sera de tipo EventEmitter de tipo number la cual usaremos para emitir el resultado al complemento padre
  @Output() resultadoObtenido = new EventEmitter<number>();

  operandoA: number;
  operandoB: number;
  resultado: number;

  //133 Definimos el metodo en donde se va a mandar el resultado al padree
  sumar(){
    this.resultado = this.operandoA + this.operandoB;
    this.resultadoObtenido.emit(this.resultado);
  }

}

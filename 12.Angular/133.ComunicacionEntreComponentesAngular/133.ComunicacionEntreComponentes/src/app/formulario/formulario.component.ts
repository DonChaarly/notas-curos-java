import { Component, ElementRef, EventEmitter, OnInit, Output, ViewChild } from '@angular/core';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent {

//133 Se declara una variable la cual va a pasar la informacion del objeto persona al componente padre para que la incluya en el arreglo
@Output() personaCreada = new EventEmitter<Persona>();

//133 Se recupera el elemento apellidoInput con el decorador @ViewChild el cual sera de tipo ElementRef
@ViewChild('apellidoInput') apellidoInput: ElementRef;

//132 Definimos el metodo agrearPersona para agregar la persona al arreglo
//133 Se recibe el parametro de nombreInput de tipo HTMLInputElement con el cual obtendremos el valor para realizr el emit
agregarPersona(nombreInput: HTMLInputElement):void{
  //133 Extraemos el valor del nombreInput con value
  //133 Extraemos el valor del apellidoInput con nativeElement y value
  let persona1 = new Persona(nombreInput.value, this.apellidoInput.nativeElement.value);
  //this.personas.push(persona1);
  //133 El metodo emit nos permite propagar informacion del componente hijo al padre
  this.personaCreada.emit(persona1);
}

}

import { Persona } from './persona.model';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  titulo = "Listado de personas";

  //132 Declaramos un arreglo de tipo persona pera almacenar nuestros objetos de tipo persona
  personas: Persona[ ] = [
    new Persona("Carlos", "Lopez"),
    new Persona("Karla", "Lara"),
    new Persona("Chuck", "Norris")];

  //132 Se crean las variable que van a estar conectadas a la vista por twoWayBinding
  nombreInput: string = '';
  apellidoInput: string = '';

  //132 Definimos el metodo agrearPersona para agregar la persona al arreglo
  agregarPersona():void{
    let persona1 = new Persona(this.nombreInput, this.apellidoInput);
    this.personas.push(persona1);
  }

}

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

  //133 Definimos el metodo agregarPersona que recibe el objeto de tipo persona que nos manda el component formulario
  personaAgregada(persona: Persona){
    //132 Y agregamos el objeto de tipo persona al arreglo
    this.personas.push(persona);
  }
}

import { PersonasService } from './personas.service';
import { LoggingService } from './LoggingService.service';
import { Persona } from './persona.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  titulo = "Listado de personas";

  //134 Dejamos la definicion del arreglo de personas en este compnente para que desde la plantilla podamos seguir accediendo a los objetos persona
  personas: Persona[] = [];

  //134 agregamos una instancia de nuestros servicios LoggingService y PersonaService dentro del constructor
  constructor(private loggingService: LoggingService, private personaService: PersonasService){}

  //134 El metodo OnInit Se va a llamar despues del constructor por ello es utili para pasar la informacion del arreglo de personas del servicio al de nuestro componente
  ngOnInit():void {
    this.personas = this.personaService.personas;
  }

}

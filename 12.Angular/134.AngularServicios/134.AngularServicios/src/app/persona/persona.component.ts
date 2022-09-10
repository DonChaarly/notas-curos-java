import { PersonasService } from './../personas.service';
import { Component, Input, OnInit } from '@angular/core';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-persona',
  templateUrl: './persona.component.html',
  styleUrls: ['./persona.component.css']
})
export class PersonaComponent implements OnInit {

  //133 Se recupera la informacion del componente padre con la directiva @Input
  @Input() persona: Persona;
  @Input() indice: number;

  //134 Inyectamos el servicio de personas.service
  constructor(private personaService: PersonasService) { }

  ngOnInit(): void {
  }

  //134 Definimos el metodo emitirSaludo
  emitirSaludo(){
    //134 Mandamos llamar el atributo saludar de nuestro servicio para emitir el saludo
    this.personaService.saludar.emit(this.indice);
  }

}


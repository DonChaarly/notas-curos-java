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

  constructor() { }

  ngOnInit(): void {
  }

}

 
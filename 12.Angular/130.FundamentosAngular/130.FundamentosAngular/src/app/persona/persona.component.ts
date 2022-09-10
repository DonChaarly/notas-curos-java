import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-persona',
  //130 Se tiene tambien el concept de inline que quiere decir que en vez de agregar url se coloca directamente la informacion en esta seccion
  //130 Para poder hacer saltos de linea se en vez de '' se coloca ` `
  template: ` <p>
                persona
              </p> `,
  //130 el elemento de style es opcional pero el de template no, ese es ahuevo
  styles: [`
    h1{
      color: blue;
    }
  `]
})
export class PersonaComponent{

  constructor() { }


}

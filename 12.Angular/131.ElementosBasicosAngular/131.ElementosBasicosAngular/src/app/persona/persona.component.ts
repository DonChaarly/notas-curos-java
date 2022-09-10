import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-persona',
  //130 Se tiene tambien el concept de inline que quiere decir que en vez de agregar url se coloca directamente la informacion en esta seccion
  //130 Para poder hacer saltos de linea se en vez de '' se coloca ` `
  templateUrl: './persona.component.html',
  //130 el elemento de style es opcional pero el de template no, ese es ahuevo
  styles: [`
    h1{
      color: blue;
    }
  `]
})
export class PersonaComponent{

  //131 Interpolacion - Se agregan atributos los cuales pueden utilizarse en la plantilla html
  nombre: string ='Juan';
  apellido: string = 'Perez';
  //131 Si alguno atributo es privado no se puede acceder a el desde la plantilla, se tiene que crear un metodo get
  private edad: number = 28;

  getEdad(): number{
    return this.edad;
  }

}

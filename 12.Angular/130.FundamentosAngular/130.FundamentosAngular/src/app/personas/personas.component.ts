import { Component } from "@angular/core";

//Dentro de la anotacion de componnet se define el selector asi como el template y los estilos que se van a llamar con el selecotr que es el nombre con el que se llamara desde otras vistas a este componente
@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html',
  styleUrls: ['./personas.component.css']
})
//130 Esta es la definicion de la clase
export class PersonasComponent{

}

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //133 Definimos una variable resultado en la que almacenaremos el valor resultado que nos manda el componente hijo formulario
  resultado: number;

  //133 Definimos el metodo que recibe el resultado del componente hijo formulario en el html
  enviarResultado(resultado: number){
    this.resultado = resultado;
  }
}

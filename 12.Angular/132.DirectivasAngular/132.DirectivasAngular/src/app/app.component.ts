import { Component } from '@angular/core';

//130 Aqui se indica el selector osea el nombre con el que se va a llamar desde otras vistas, tambien el template que se va a llamar y los estilos
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //130 Este atibuto se puede desplegar desde el archivo component.html
  title = '131.ElementosBasicosAngular';
}

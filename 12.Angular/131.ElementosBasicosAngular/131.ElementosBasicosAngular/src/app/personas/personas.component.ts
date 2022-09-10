import { Component } from "@angular/core";

//Dentro de la anotacion de componnet se define el selector asi como el template y los estilos que se van a llamar con el selecotr que es el nombre con el que se llamara desde otras vistas a este componente
@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html',
  styleUrls: ['./personas.component.css']
})
//130 Esta es la definicion de la clase
export class PersonasComponent{

  //131 Property Binding - Definimos un atributo deshabilitar para habilitar o deshabilitar el boton del componente perosnas.component.html
  deshabilitar = false;

  mensaje = "No se ha agregado ninguna persona";
  titulo = '';

  //131 Two Way Binding - Se define un atributo el cual se podra modificar desde la vista component.html gracias al concepto de Two Way Binding, tambien si se modifica de este lado se vera reflejado en la vista
  tipo = 'puto';

  //131 Event Binding - Definimos el metodo agregarPersona el cual se va mandar llamar con el evento click en el component.html
  agregarPersona(){
    this.mensaje = 'Persona agregada';
  }

  //131 Event Binding - Definimos el metodo modificar titulo el cual recibe un argumento de tipo Event
  modificarTitulo(event: Event){
    console.log('Entrando a metodo titulo')
    //131 Se modifica la variable titulo con el objeto even y con target hacemos referencia al elemento html que se esta ejecutando en este momento y se hace un cast
    this.titulo = (<HTMLInputElement>event.target).value;

  }

}


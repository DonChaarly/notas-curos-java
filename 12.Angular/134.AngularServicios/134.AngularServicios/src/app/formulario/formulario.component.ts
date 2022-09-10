import { PersonasService } from './../personas.service';
import { LoggingService } from './../LoggingService.service';
import { Component, ElementRef, ViewChild } from '@angular/core';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css'],
  //134 Se agrega el concepto de providers para agregar el provedor del servicio LoggingService que definimos
  //providers: [LoggingService] Se agrego el provedor directamente en el app.module
})
export class FormularioComponent {

//133 Se declara una variable la cual va a pasar la informacion del objeto persona al componente padre para que la incluya en el arreglo
//@Output() personaCreada = new EventEmitter<Persona>(); esto Se hace con el servicio Persona ahora

//133 Se recupera el elemento apellidoInput con el decorador @ViewChild el cual sera de tipo ElementRef
@ViewChild('apellidoInput') apellidoInput: ElementRef;


//134 Para crear una instancia de l;os servicios LoggingService y PersonaService, se define en el constructor los atributos
constructor(private loggingService: LoggingService, private personaService: PersonasService){
  //134 Nos suscribimos a la notificacion que se emite desde el persona.component.ts de saludar para procesar la inforamcion en este caso se va a enviar una alreta
  this.personaService.saludar.subscribe(
    (indice:number) => alert("El indice es: " + indice)
  );
}

//132 Definimos el metodo agrearPersona para agregar la persona al arreglo
//133 Se recibe el parametro de nombreInput de tipo HTMLInputElement con el cual obtendremos el valor para realizr el emit
agregarPersona(nombreInput: HTMLInputElement):void{
  //133 Extraemos el valor del nombreInput con value
  //133 Extraemos el valor del apellidoInput con nativeElement y value
  let persona1 = new Persona(nombreInput.value, this.apellidoInput.nativeElement.value);

  //134 Podemos utilizar los metodos de nuestro servicio
  //this.loggingService.enviarMensajeAConsola("Enviamos Persona: " + persona1.nombre + " " + persona1.apellido);
  //133 El metodo emit nos permite propagar informacion del componente hijo al padre
  //this.personaCreada.emit(persona1); No Es necesario mandar el metodo emit ahora mandamos la informacion directamente al servicio PersonaService
  this.personaService.agregarPersona(persona1);
}

}

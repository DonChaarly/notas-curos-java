import { LoggingService } from './LoggingService.service';
import { EventEmitter, Injectable } from "@angular/core";
import { Persona } from "./persona.model";

//134 Para inyectar un servicio dentro de otro servicio se tiene que colocar el decorador de Injectable()
@Injectable()
export class PersonasService{

  //134 Se va a manejar la informacion del arreglo se personas desde este servicio
  personas: Persona[ ] = [
    new Persona("Carlos", "Lopez"),
    new Persona("Karla", "Lara"),
    new Persona("Chuck", "Norris")
  ];

  //134 Definimos una variable eventEmiter la cual nos ayudara a cominucarnos entre componentes
  saludar = new EventEmitter<number>();

  //134 Se agrega una instacncia del servicio LoggingService dentro del constructor
  constructor(private loggingService: LoggingService){}

  //134 Definimos el metodo agregarPersona que recibe el objeto de tipo persona que nos manda el component formulario
  agregarPersona(persona: Persona){
    //134 Utilizamos un metodo del servicio loggingService
    this.loggingService.enviarMensajeAConsola("agregamos Persona: " + persona.nombre)

    //134 Se manda la persona al arreglo de presonas
    this.personas.push(persona);
  }

}



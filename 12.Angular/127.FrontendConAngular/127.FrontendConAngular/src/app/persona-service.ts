import { DataService } from './data-service';
import { Injectable } from '@angular/core';
import { Persona } from './persona.model';

//127 Debido a que esta clase va a ser un servicio y la utilizaremos en otras partes del proyecto se coloca la anotacion Injectable
@Injectable()
export class PersonaService {

  //127 Definimos un arreglo de personas
  personas: Persona[] = [];

  //127 Definimos el constructor con el atributo DataService para utilizar sus metodos
  constructor(private dataService: DataService){

  }

  //127 definimos un metodo setPersonas para modificar el valor del arreglo debido a la llamada asincrona
  setPersonas(personas: Persona[]){
    this.personas = personas;
  }

  //127 Definimos el metodo obtenerPersonas
  obtenerPersonas(){
    return this.dataService.cargarPersonas();
  }

  //127 Definimos el metodo agregarPersona para agregar una persona al arreglo haciendo uso de la clase dataService
  agregarPersona(persona: Persona){
    console.log("Persona a agregar: " + persona.nombre);
    //127 Nos suscribimos para procesar la respuesta
    this.dataService.agregarPersona(persona)
      .subscribe(
        //127 Se arrojo un eror en vez de any se tenia Persona pero no aceptaba este valor se cambio a any para evitar el error
        (persona: any) => {
          //127 recuperamos el objeto persona con el idPersona recien agregado
          console.log("Se agrega al arreglo la persona recien agregada: " + persona.idPersona);
          //127 agregamos la persona al arreglo con el metodo push
          this.personas.push(persona);
        }

      );
  }

  //127 Se define el metodo encontrarPersona
  encontrarPersona(id: number){
    //127 Recuperamos la peresona del arreglo de personas y la guardamos en una constante
    //127 No arrojo un error que decia que un tipo indefinido no podia asignarse a un tipo Persona se arreglo colocando el signo non-null (!)
    const persona: Persona = this.personas.find( persona => persona.idPersona == id)!;
    console.log("Persona encontrada: " + persona.idPersona + " " + persona.nombre);
    return persona;
  }

  //127 Se define el metodo modificarPersona
  modificarPersona(id: number, persona: Persona){
    console.log("Persona a modificar: " + persona.idPersona);
    //127 Definimos una variable para guardar la informacion de la personaModificada y actualizar el objeto persona del arreglo local
    const peresonaModificadaLocal = this.personas.find(persona => persona.idPersona == id);
    peresonaModificadaLocal!.idPersona = persona.idPersona;
    peresonaModificadaLocal!.nombre = persona.nombre;
    //127 Se manda llamar el metodo modficiarPersona para modificar el objeto persona de la base de datos
    this.dataService.modificarPersona(id, persona);
  }

  //127 Se define el metodo eliminarPersona
  eliminarPersona(id: number){
    console.log('Eliminar persona con id: ' + id);
    //127 Se recupera el indice del arreglo para eliminarlo del arreglo local y del lado del servidor
    const index = this.personas.findIndex(persona => persona.idPersona == id);
    //127 Eliminamos el objeto del arreglo local
    this.personas.splice(index,1);
    //127 Eliminamos el objeto del servicio
    this.dataService.eliminarPersona(id);
  }



}

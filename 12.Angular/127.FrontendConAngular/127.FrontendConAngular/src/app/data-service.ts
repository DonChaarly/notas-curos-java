import { Injectable } from "@angular/core";
import {HttpClient, HttpResponse } from '@angular/common/http';
import { Persona } from "./persona.model";

//127 Debido a que esta clase va a ser un servicio y la utilizaremos en otras partes del proyecto se coloca la anotacion Injectable
@Injectable()
export class DataService {

  //127 Se coloca un constructor para inicializar los atributos HttpClient
  constructor(private httpClient: HttpClient) {

  }

  //127 Defimos una variable que contendra la url que utilizaremos para hacer las llamadas a nuestro servicio web es el url de java
  urlBase ='http://localhost:9090/125.BackendJavaEEWebServicesRESTful/webservice/personas';

  //127 Definimos los metodos que vamos a utilizar para interactuar con la base de datos

  cargarPersonas(){
    //127 Retornamos el url base para mandar llamar a todas las personas, mandando llamar el metodo get ya que este es el metodo con el que vamos a realizar la transaccion
    return this.httpClient.get(this.urlBase);
  }

  agregarPersona(persona: Persona){
    //127 Mandamos llamar el metodo post para insertar la persona que recibimos, pasamos el url base y el objeto persona
    return this.httpClient.post(this.urlBase, persona);
  }

  modificarPersona(idPersona: number, persona: Persona){
    //127 Definimos una nueva url con el idPersona
    let url: string;
    url = this.urlBase + '/' + idPersona;
    //127 Mandamos llamar el metodo put y nos suscribimos para procesar la respuesta
    //127 Procesamos los objetos response y error mandando informacion a la consola
    this.httpClient.put(url, persona)
      .subscribe(
        (response) => {
          console.log('Resultado modificarPersona: ' + response);
        },
        (error) => console.log('Error en modificarPersona: ' + error)
      );
  }

  eliminarPersona(idPersona: number){
    //127 Creamos una nueva url
    let url: string;
    url = this.urlBase + '/' + idPersona;
    //127 Mandamos llamar el metodo delete y nos suscribimos para procesar la respuesta
    //127 Procesamos los objetos response y error mandando informacion a la consola
    this.httpClient.delete(url)
      .subscribe(
        (response) => {
          console.log('Resultado eliminarPersona: ' + response);
        },
        (error) => console.log('Error en eliminarPersona: ' + error)
      );
  }







}

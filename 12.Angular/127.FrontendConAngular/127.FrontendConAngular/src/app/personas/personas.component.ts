import { PersonaService } from './../persona-service';
import { Component, OnInit } from '@angular/core';
import { Persona } from '../persona.model';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html',
  styles: [
  ]
})
export class PersonasComponent implements OnInit {

  //127 Se tiene que definir el arreglo de personas para poder utilizarlo en el archivo html
  personas: Persona[] = [];

  //127 Se agrega una referencia del objeto personaService que es el que se va a encargar de administrar el arreglo
  //127 La variable de router y route se utiliza para cambiar hacia otra pagina
  constructor(private personaService: PersonaService, private router: Router, private route: ActivatedRoute) {

  }

  //127 Inicializamos nuestro arreglo cn el metodo ndOnInit el cual es uno de los metodos de clico de vida de angular
  //127 Nos subscribimos a la llamada del metodo
  ngOnInit(): void {
    this.personaService.obtenerPersonas()
    .subscribe(
      (personasObtenidas: any) => {
        //127 Cargamos los datos de personas obtenidas en el arreglo local
        this.personas = personasObtenidas;
        this.personaService.setPersonas(this.personas);
        console.log('Personas Obtenidas del subscriber:' + this.personas);
      }
    )
  }

  //127 Se agrega el metodo de irAgregar
  irAgregar(){
    console.log("Nos vamos a agregar");
    //127 Con el objeto router hacemos el cambio de pagina, al metodo navigate le pasamos el path que queremos
    this.router.navigate(["./personas/agregar"])
  }

}

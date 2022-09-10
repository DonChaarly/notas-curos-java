import { Router, ActivatedRoute } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { PersonaService } from '../persona-service';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styles: [
  ]
})
export class FormularioComponent implements OnInit {

  //127 Esta clase va a contener el formulario para procesar una nueva persona definimos las variables que recibiran la informacion
  idPersona: number | undefined;
  nombreInput: string | undefined;

  //127 Se agrega una referencia del objeto personaService que es el que se va a encargar de administrar el arreglo
  //127 La variable de router y route se utiliza para cambiar hacia otra pagina
  constructor(private personaService: PersonaService, private router: Router, private route: ActivatedRoute) {

   }

  ngOnInit(): void {
    //127 Recuperamos el idPersona con el metodo snapshot del objeto route preguntando por el parametro de idPersona;
    this.idPersona = this.route.snapshot.params['idPersona'];
    console.log("Recuperamos el parametro de idPersona: " + this.idPersona);
    //127 Preguntamos si el idPersona es diferente de nulo
    if (this.idPersona != null){
      const persona = this.personaService.encontrarPersona(this.idPersona);
      //127 Preguntamos si la persona encontrada es diferente de null
      if(persona != null){
        this.nombreInput = persona.nombre;
      }
    }

  }

  //127 Se define el metodo onGuardarPeresona
  onGuardarPersona(){
    //127 definimos una variable donde guardar la persona
    const personaAGuardar = new Persona ( this.idPersona!, this.nombreInput!);

    //127 Preguntamos si el idPersona es diferente de null
    if (this.idPersona != null){
      //127 Mandamos a llamar el metodo modificarPersona
      this.personaService.modificarPersona(this.idPersona, personaAGuardar)
    }else{
      //127 Mandamos a llamar el metodo agregarpersona
      this.personaService.agregarPersona(personaAGuardar);
    }

    //127 Navegamos hacia el path de personas
    this.router.navigate(["personas"]);
  }

  onEliminarPersona(){
    //127 Preguntamos si el idPersona es diferente de null
    if (this.idPersona != null){
      console.log("Persona a eliminar: " + this.idPersona);
      //127 Mandamos llamar el metodo eliminarPersona
      this.personaService.eliminarPersona(this.idPersona);
    }
    //127 Navegamos hacia el path de personas
    this.router.navigate(['personas']);
  }

}

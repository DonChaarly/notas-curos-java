import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormularioComponent } from './formulario/formulario.component';
import { PersonasComponent } from './personas/personas.component';

const routes: Routes = [
  //127 Se agregan nuevas rutas, la utl sin nada sera la url por default
  //127 Se especifica el path y el componente que se va a llamar
  {path: "", component: PersonasComponent},
  //127 Si se llama el path de personas se llama el componente de PersonasComponent
  //127 Pero si tambien se incluye el id quiere decir que queremos agregar o modificar la persona, por lo tanto tendremos rutas hijas del path
  {path: "personas", component: PersonasComponent, children:[
    {path: "agregar", component: FormularioComponent},
    {path: ":idPersona", component: FormularioComponent}
  ]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

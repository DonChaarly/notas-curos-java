import { PersonasComponent } from './personas/personas.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonaComponent } from './persona/persona.component';

//130 La siguiente seccion es un decorador, se agregan configuraciones como las declariaciones de componentes importraciones y proveedores como bootstrap
@NgModule({
  declarations: [
    AppComponent, PersonasComponent, PersonaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  //130 Bootstrap indica como es que se levanta la aplicacion, se esta utiliando el componente de appComponent
  bootstrap: [AppComponent]
})
export class AppModule { }

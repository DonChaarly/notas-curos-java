import { DataService } from './data-service';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { PersonaService } from './persona-service';
import { PersonasComponent } from './personas/personas.component';
import { FormularioComponent } from './formulario/formulario.component';


@NgModule({
  declarations: [
    AppComponent,
    PersonasComponent,
    FormularioComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //127 Se importa tambien el httpclientModule y el de FormsModule
    HttpClientModule,
    FormsModule
  ],
  //127 Se registran los servicios de PersonaService y DataService para poder utilizarlos en otras clases
  providers: [PersonaService, DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }

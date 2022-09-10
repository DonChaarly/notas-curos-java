import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';

if (environment.production) {
  enableProdMode();
}


//130 Aqui se configura el levantamiento de los modulos
platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));

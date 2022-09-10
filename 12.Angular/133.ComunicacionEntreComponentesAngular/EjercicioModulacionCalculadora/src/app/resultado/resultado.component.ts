import { Component, OnInit, Input} from '@angular/core';

@Component({
  selector: 'app-resultado',
  templateUrl: './resultado.component.html',
  styleUrls: ['./resultado.component.css']
})
export class ResultadoComponent  {

  //133 Recibimos el resultado que nos envia el componente padre desde su component.html
  @Input() resultado: number;

}

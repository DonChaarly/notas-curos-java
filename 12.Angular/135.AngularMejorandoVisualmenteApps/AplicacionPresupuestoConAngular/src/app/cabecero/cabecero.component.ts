import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-cabecero',
  templateUrl: './cabecero.component.html',
  styleUrls: ['./cabecero.component.css']
})
export class CabeceroComponent implements OnInit {

  @Input() presupuestoCabecero: number;
  @Input() ingresoTotalCabecero: number;
  @Input() egresoTotalCabecero: number;
  @Input() porcentajeTotal:number;

  constructor() { }

  ngOnInit(): void {
  }

}

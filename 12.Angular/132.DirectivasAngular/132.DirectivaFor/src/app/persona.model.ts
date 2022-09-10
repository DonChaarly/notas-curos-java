//132 Vamos a utilizar la clase fuera del archivo por ello el export
export class Persona{
  //132 Se pueden declarar los atributos de la clase por separado o directamente en el constructor
  /*
  nombre: string = '';
  apellido: string = '';

  constructor(nombre: string, apellido: string){
    this.nombre = nombre;
    this.apellido = apellido
  }
  */
   //132 Para declarar los atributos dentro del constructor se coloca public en cada atributo
  constructor(public nombre: string, public apellido: string){
    
  }
}


public class operadoresJava {

    public static void main(String args[]) {
        ////////////////////////////////////////////////////
        //OPERADORES ARITMETICOS
        ///////////////////////////////////////////////////
        int a = 3, b = 2;
        //operador de suma +
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);
        //operador de resta -
        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);
        //operador de multiplicacion
        resultado = a * b;
        System.out.println("resultado de la multiplicacion = " + resultado);
        //operador de division
        var resultado2 = 3D / b;
        System.out.println("resultado de la division = " + resultado2);
        //operador de modulo (residuo de la division)
        resultado = a % b;
        System.out.println("resultado de la operacion de modulo = " + resultado);

        //ejemplo
        if (b % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        ////////////////////////////////////////////////////
        //OPERADORES DE ASIGNACION
        ///////////////////////////////////////////////////
        //el oerador de asignacion de igualdad =
        int ce = a + 5 - b; // la expresion se evalua de izquierda a derecha y despues el resultado es depositado en c
        System.out.println("ce = " + ce);
        // operador de asignacion de composicion (+=, -=, /=, *=)
        a += 1; //a=a+1
        System.out.println("a = " + a);
        a += 3;
        System.out.println("a = " + a);
        a -= 2;
        System.out.println("a = " + a);
        a *= 2;
        System.out.println("a = " + a);
        a /= 2;
        System.out.println("a = " + a);
        a %= 2;
        System.out.println("a = " + a);

        ////////////////////////////////////////////////////
        //OPERADORES UNITARIOS
        ///////////////////////////////////////////////////
        //operador de cambio de signo
        a = 3;
        b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //operador de negacion
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //operador de incremento (++)
        //1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;//primero se incrementa la variable y despues se usa su valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2.postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; //prmero se utiliza el valor de la variable y despues se utiliza
        System.out.println("g = " + g); //tenemos pendiente un incremento
        System.out.println("h = " + h);

        //operador de decremento (--)
        //1.predecremento (simbolo antes de la variable)
        var i = 2;
        var j = --i;//primero se decrementa la variable y despues se usa su valor
        System.out.println("i = " + i);//ya esta decrementada
        System.out.println("j = " + j);
        //2.postdecremento (simbolo despues de la variable)
        var k = 4;
        var l = k--; //prmero se utiliza el valor de la variable y despues se utiliza
        System.out.println("k = " + k); //tenemos pendiente un decremento
        System.out.println("l = " + l);

        ////////////////////////////////////////////////////
        //OPERADORES DE ASIGNACION Y RELACIONALES
        ///////////////////////////////////////////////////
        a = 3;
        b = 2;

        //operador de igualdad (==) pregunta la igualdad y devuelve un bolean
        c = (a == b);
        System.out.println("c = " + c);

        // operador diferente de (!=)
        var D = a != b;
        System.out.println("D = " + D);

        //operador igualdad con cadenas .equals()
        var cadena = "Hola";
        var cadena2 = "Hola";
        var E = cadena == cadena2; //Compara la referencia de la memora del objeto
        System.out.println("E = " + E);

        var F = cadena.equals(cadena2);//Comparamos contenido de cadenas
        System.out.println("F = " + F);

        ////////////////////////////////////////////////////
        //OPERADORES RELACIONALES
        ///////////////////////////////////////////////////
        var G = a >= b; //Mayor que > o el mayor o igual >=
        System.out.println("G = " + G);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        
        var edad = 10;
        var adulto = 18;
        if (edad>=adulto){
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
        
        
        ////////////////////////////////////////////////////
        //OPERADORES Condicionales
        ///////////////////////////////////////////////////
        
        a = 8;
        var valorMinimo = 0;
        var valorMaximo =10;
                
        //Operador condicional and (&&)
        var resultadoAnd = a >= 0 && a <= 10;
        if (resultadoAnd == true){
            System.out.println("Dentro de rango");
        } else {
            System.out.println("Fuera de rango");
        }
        
        //Operador condicional or (||)
       var vacaciones = true;
       var diaDescanso = false;
       
       if (vacaciones || diaDescanso){
           System.out.println("Padre puede asisitir al juego del hijo");
       } else {
           System.out.println("El padre esta ocupado");
       }
       
       ////////////////////////////////////////////////////
        //OPERADOR TERNARIO
        ///////////////////////////////////////////////////
        
        //Operador ternario variable = ()? : ;
        
        var resultadoTernario = (1 > 2) ? "Verdadero" : "Falso";//Es un if pero simlificado
        System.out.println("resultadoTernario = " + resultadoTernario);
        
        var numeroTernario = 9;
        resultadoTernario = (numeroTernario % 2 == 0) ? "El numero es par" : "El numero es impar";
        System.out.println("resultadoTernario = " + resultadoTernario);
        
        ////////////////////////////////////////////////////
        //PRECEDENCIA DE OPERADORES
        ///////////////////////////////////////////////////
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;// z = (++x) + (y--)
        System.out.println("x = " + x);//tendra valor de 6
        System.out.println("y = " + y);// tendra valor de 9
        System.out.println("z = " + z);// tedra valor de 16
        
        resultado = 4 + 5 * 6 / 3;//resultado = 4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);
    }
}

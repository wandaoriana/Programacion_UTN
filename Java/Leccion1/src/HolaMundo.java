//Import java.util.Scanner;

import java.sql.SQLOutput;

// Tu código aquí
public class HolaMundo {

    public static void main(String[] args) {
        /* System.out.println("Hola mundo desde java");

     int miVariable = 10;
     System.out.println(miVariable);

     miVariable = 5;

     System.out.println(miVariable);



     //type string

     String miVariableCadena = "Bienvenidos";

     System.out.println(miVariableCadena);
     miVariableCadena = "Sigamos creciendo en programcion";

     System.out.println(miVariableCadena); */

 /* var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        var usuario = "Osvaldo";
        var titular = "Ingeniero";
        var union = titular + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));

        //Ejercicio: Caracteres especiales con java
        var nombre = "Nati";
        System.out.println("\n Nueva Linea: \n" + nombre); //diagonal invera y letra n
        System.out.println("tabulador \t" + nombre); //tabulador un espacio para centrar
        System.out.println(" \t:\t .:MENU:.");
        System.out.println("retroceso : \b\b " + nombre);
        System.out.println("comillas simples :\'" + nombre + "\'");
        System.out.println("comillas dobles :\"" + nombre + "\""); */
        //clase scanner
        // Scanner entrada = new Scanner(System.in);
        //System.out.println("Digite su nombre ");
       /* var usuario2 = entrada.nextLine(); //lee una linea completa y detiene el programa para q el usuario escriba algo
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("resultado:"+titulo2+ " " +usuario2); */


       /* byte numEnterobyte =(byte)129;
        System.out.println("numEnterobyte = " + numEnterobyte );
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);

        short numEnteroShort = (short)32768;
        System.out.println("numEnteroshort = " + numEnteroShort);
        System.out.println("Valor minimo del short: " +Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);


        int numEnteroInt = (int)2245356432L;
        System.out.println("numEnteroshort = " + numEnteroInt);
        System.out.println("Valor minimo del short: " +Short.MIN_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);

        int numEnteroInt1  = 10;
        System.out.println("numEnteroByte = " + numEnteroInt1);
        System.out.println("Valor minimo del int : " + Integer.MIN_VALUE);
        System.out.println("Valor minimo del int : " + Integer.MAX_VALUE);

        int numEnteroInt2  =(int) 10495495940L; // PARA NUMEROS GRANDES USAR "L" al final del numero y pasa ser long.
        System.out.println("numEnteroByte = " + numEnteroInt2);
        System.out.println("Valor minimo del int : " + Integer.MIN_VALUE);
        System.out.println("Valor minimo del int : " + Integer.MAX_VALUE);

        int numEnteroLong  = 10;
        System.out.println("numEnteroByte = " + numEnteroLong);
        System.out.println("Valor minimo del long : " + Long.MIN_VALUE);
        System.out.println("Valor minimo del long : " + Long.MAX_VALUE);


        */
       /* float numfloat = 10.0f;
        System.out.println("numFloat = + numFloat");
        System.out.println("El valor minimo de float : " + Float.MIN_VALUE);
        System.out.println("El valor maximo de float : " + Float.MAX_VALUE);

        double numFloat = 10;

        System.out.println("numFloat = + numFloat");
        System.out.println("El valor minimo de float : "+ Double.MIN_VALUE);
        System.out.println("El valor maximo de float : " +Double.MAX_VALUE);

        */


/*var numEntero = 20;
        System.out.println("numEntero =" + numEntero);
        var numFloat = 10.0f;
        System.out.println("numfloat = " + numFloat);
        var numDouble = 10,0;
        System.out.println("numDouble = " + numDouble);


 */

       /* char miVariableChar = 'a';
        System.out.println("miVariableChar :" + miVariableChar) ;

        char varCaracter = '\u0024';
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterSimbolo ='$';
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);



        System.out.println("La bandera es verde");
    } else {
        System.out.println("La bandera es roja");
    }


    //Ejercicio ¿Es mayor de edad?

      /*  var edad = 30;

       var adulto = edad >= 18;
       if(adulto) {
           System.out.println("Eres mayor de edad");
       }
       else{
           System.out.println("Eres menor de edad");

       */
    //Conversion de tipos primitivos
       /* var edad =Integer.parseInt("20");
        System.out.println("edad =" + (edad + 1 ));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPI); */

    //Pedir un valor
       /* var entrada = new Scanner(System.in) ;
       /* System.out.println("Digite su edad");
        edad = Integer.parseInt( entrada.nextLine());
        System.out.println("Entrada= " + edad);


        */
    //conversion de tipos primitivos en java parte 2
        /*var edadTexto =String.valueOf(10);
        System.out.println("edadTexto= " + edadTexto);

        var fraseChar ="programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);
        System.out.println("Digite un caracter: ");
        System.out.println("Digite un caracter ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar =" +fraseChar);

       }
    }
         */
//Operadores de asignacion

    /* int num1 = 5, num2 = 4;

     var solucion = num1 + num2;
     System.out.println("Solucion de la suma = " + solucion);

     solucion = num1 - num2;
     System.out.println("Solucion de la resta =" + solucion);


     solucion = num1 * num2;
     System.out.println("Solucion de la multiplicacion =" + solucion);

     solucion = num1 / num2;
     System.out.println("Solucion de la division  =" + solucion);
     var solucion2 = 3.4 / num2;
     System.out.println("solucion2 resultado de la division = " + solucion2);

     solucion = num1 % num2; // Guarda el residuo entero de la division
     System.out.println("solucion =" + solucion);
     if (num1 % 2 == 0)
         System.out.println("Es un numero Par");
     else
         System.out.println("Es un numero Impar");


     */
    int varNum1 = 1 , varNum2 = 4;
    int varNum3 = varNum1 + 6- varNum2;
        System.out.println("varNum3 =" + varNum3);

    varNum1 += 1;
        System.out.println("varnum1= +" + varNum1);

    //ejercicio
    varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
    varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
    varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
    varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);

//Clase 8

    }

}

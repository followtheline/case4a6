/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
c
 */
package ejer9adi;

import java.util.Scanner;
public class Ejer9adi {

  
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int resto, cociente=0;
      System.out.println("Ingrese el dividendo");
      int dividendo= input.nextInt();
      System.out.println("Ingrese el divisor");
      Scanner input2=new Scanner(System.in);
     int divisor=input2.nextInt();
     while (dividendo>= divisor){
         dividendo -= divisor;
         cociente++;
     }
      
     resto=dividendo;  
   System.out.println("Cociente: "+cociente);
   System.out.println("Resto: "+resto);
    }
    
}

/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa deberá 
devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.
c
 */
package ejer11adi;

import java.util.Scanner;
public class Ejer11adi {

   
    public static void main(String[] args) {
      System.out.println("Ingrese un número entero: ");
      Scanner input= new Scanner(System.in);
      int cont=0;
      int num= input.nextInt();
      while (num != 0){
          num=num/10;
          cont++;
      }            
       System.out.println("La cantidad de dígitos del número ingresado es: "+cont);
    }
    
}

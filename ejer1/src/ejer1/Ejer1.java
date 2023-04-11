/*
 Crear un programa que dado un número determine si es par o impar.
c
 */
package ejer1;

import java.util.Scanner;
public class Ejer1 {

   
    public static void main(String[] args) {
  Scanner leer= new Scanner(System.in);
  System.out.println("Ingrese un número");
  int num= leer.nextInt();
  if (num % 2==0){
      System.out.println("El número ingresado es par");
      
  }else {
      System.out.println("El número ingresado es impar");
  }
   }
    }
    


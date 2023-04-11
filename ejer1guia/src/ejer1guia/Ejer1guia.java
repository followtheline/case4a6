/*
 Implementar un programa que le pida dos números enteros al usuario y determine 
si ambos o alguno de ellos es mayor a 25.

 */
package ejer1guia;

import java.util.Scanner;
       
public class Ejer1guia {

   
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese 2 números enteros: " );
   int num1, num2;
   
    num1 = leer.nextInt();
    num2 =leer.nextInt();
    if (num1 >= 25 && num2>=25) {;
    System.out.println(" Los números ingresados son: " + num1+ " y " +num2+ " son mayores o iguales a 25");
    }else{ 
        if (num1 >= 25) {
            System.out.println("El primer valor ingresado: "+num1+" es mayor o igual a 25");
        }else{
            System.out.println("El segundo valor ingresado: "+num2+" es mayor o igual a 25");
        }
    }
    }
    
}

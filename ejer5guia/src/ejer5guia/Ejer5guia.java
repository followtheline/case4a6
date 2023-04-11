/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado 
seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*
 */
package ejer5guia;

import java.util.Scanner;
public class Ejer5guia {

   
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[4];
        
        // Pedir al usuario que ingrese los 4 números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            numeros[i] = input.nextInt();
        }
        
        // Imprimir cada número seguido de asteriscos según su valor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            
            for (int j = 1; j <= numeros[i]; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
    }
    


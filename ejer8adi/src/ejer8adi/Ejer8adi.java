/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio anterior 
los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.

 */
package ejer8adi;

import java.util.Scanner;
public class Ejer8adi {

   
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

        int num, cont = 0, par = 0, impares = 0, Sum = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            num = input.nextInt();

            if (num % 5 == 0) {
                break;
            }

            if (num < 0) {
                continue;
            }

            cont++;

            if (num % 2 == 0) {
                par++;
                System.out.println(num + " es par.");
            } else {
                impares++;
                System.out.println(num + " es impar.");
            }

            if (num > 0) {
               Sum += num;
            }
        }

        System.out.println("Cantidad de números leídos: " + cont);
        System.out.println("Cantidad de números pares: " + par);
        System.out.println("Cantidad de números impares: " + impares);
        System.out.println("Suma de números positivos: " + Sum);
   } 
    
    }
    


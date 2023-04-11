/*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
c
 */
package ejer5;

import java.util.Scanner;
public class Ejer5 {

  
    public static void main(String[] args) {
        System.out.println("Ingrese un valor límite");
        Scanner input = new Scanner(System.in);
        int limite = input.nextInt();
        int suma = 0;
        int contador = 0;
        while (suma <= limite && suma >= 0) {
            System.out.println("Ingrese un número positivo");
            int num = input.nextInt();
            suma = suma + num;
            contador = contador + 1;
        }
        System.out.println("La suma de los números ingresados es: " + suma);
        System.out.println("Se ingresaron: " + contador + " números para llegar al valor límite");
    
        
    }}      
      
            

        
    
    


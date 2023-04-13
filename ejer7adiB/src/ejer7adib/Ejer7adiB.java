/*
  Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa 
y los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.c
 */
package ejer7adib;

import java.util.Scanner;
public class Ejer7adiB {

  
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
   System.out.println("Ingrese la cantidad de números que ingresará para comparar");
   int n= input.nextInt();
   int i=0, nComparados=0, suma=0;
   int min=Integer.MAX_VALUE;
   int max=Integer.MIN_VALUE;
   double promedio;
  
   do {
        System.out.println("Ingrese los números para comparar");
        Scanner input2= new Scanner(System.in);
        nComparados = input2.nextInt();
        i++;
        
        if (nComparados< min){
            min=nComparados;
        }
        if (nComparados>max){
            max=nComparados;
            }
        
        suma= suma+nComparados;
    }while (i <=n-1);
   promedio=suma/n;
   System.out.println("El valor mínimo es: "+min);
   System.out.println("El valor máximo es: "+max);   
   System.out.println("El promedio de los números ingresados es: "+promedio);
   
    }
    
}

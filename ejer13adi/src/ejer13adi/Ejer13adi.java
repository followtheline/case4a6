/*
 Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno 
y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
c
 */
package ejer13adi;

import java.util.Scanner;
public class Ejer13adi {

  
    public static void main(String[] args) {
      System.out.println("Ingrese la altura de la escalera: ");
      Scanner input = new Scanner(System.in);
      int altura=input.nextInt();
      for (int i=1; i<=altura; i++){
          for (int j=1; j<=i; j++){
              System.out.print(j);
          }
        System.out.println();
    }
    }
    
}

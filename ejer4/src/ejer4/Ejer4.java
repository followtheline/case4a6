/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa 
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: cinvestigar la función Substring y equals() de Java.

 */
package ejer4;
import java.util.Scanner;
public class Ejer4 {

  
    public static void main(String[] args) {
   System.out.println("Ingrese una frase o palabra");
   Scanner input= new Scanner(System.in);
   String frase = input.nextLine();
   if (frase.substring(0,1).equalsIgnoreCase("A")){
       System.out.println("CORRECTO");
   }else {
       System.out.println("INCORRECTO");
   }
    }
    
}

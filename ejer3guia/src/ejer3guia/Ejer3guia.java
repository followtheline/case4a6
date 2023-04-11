/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
la nota se pedirá de nuevo hasta que la nota sea correcta.

 */
package ejer3guia;

import java.util.Scanner;
public class Ejer3guia {

  
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    int nota;
    System.out.println(" Ingrese una nota entre 0 y 10: ");
    nota= leer.nextInt();
    while (nota < 0 || nota>10){
        
        System.out.println(" Ingrese la nota entre 0 y 10");
        nota= leer.nextInt();
    }
    System.out.println(" La nota ingresada es: "+nota);
    }
    
}

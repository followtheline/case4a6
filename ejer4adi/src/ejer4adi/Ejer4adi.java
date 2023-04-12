/*
 Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
d
 */
package ejer4adi;

import java.util.Scanner;
public class Ejer4adi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número entre 1 y 10: ");
        int numero = input.nextInt();
        if (numero >= 1 && numero <= 10) {
            String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            System.out.println("El número " + numero + " en romano es " + unidades[numero]);
        } else {
            System.out.println("Error: Debe ingresar un número entre 1 y 10.");
        }
    }
    
}

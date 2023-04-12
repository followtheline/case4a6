/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the templdate in the editor.
 */
package ejer3adi;

import java.util.Scanner;
public class Ejer3adi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Ingresa una letra: ");
        String letra = input.nextLine();
        if (letra.length() == 1) {
            letra = letra.toLowerCase();
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
                System.out.println("La letra ingresada es una vocal.");
            } else {
                System.out.println("La letra ingresada no es una vocal.");
            }
        } else {
            System.out.println("Error: Debe ingresar una sola letra.");
        }
    }
    
}

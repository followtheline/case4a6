/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open fthe template in the editor.
 */
package ejer2adi;

/**
 *
 * @author juanm
 */
public class Ejer2adi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4;
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Valores iniciales:");
        System.out.println("A = " + 1);
        System.out.println("B = " + 2);
        System.out.println("C = " + 3);
        System.out.println("D = " + 4);
        System.out.println("Valores finales:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
    
}

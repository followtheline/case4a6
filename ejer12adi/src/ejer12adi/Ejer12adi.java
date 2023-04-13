/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.

 */
package ejer12adi;


public class Ejer12adi {

   
    public static void main(String[] args) {
        int cont=0;
      for (int i = 0; i <= 9 && cont<9; i++) {
            for (int j = 0; j <= 9 && cont<9; j++) {
                for (int k = 0; k <= 9 && cont<9; k++) {
                    if (k == 3 || i ==3 || j==3) {
                        System.out.print("E-");
                    } else {
                        System.out.print(i + "-" + j + "-" + k + " ");
                    }
                    cont++;
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

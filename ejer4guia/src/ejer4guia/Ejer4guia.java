/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si 
el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
c
 */
package ejer4guia;

import java.util.Scanner;

public class Ejer4guia {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, sum;
        sum = 0;
        System.out.println(" Ingrese un número entero: ");
        num = leer.nextInt();
        do {
            if (num > 0) {
                sum = sum + num;
                System.out.println(" Ingrese otro número entero positivo para sumar y en caso de que quiera salir ingrese 0:");
                num = leer.nextInt();

            } else {
                System.out.println(" Debe ingresar valores positivos, por favor, ingrese un número positivo");
                num = leer.nextInt();
            }

        } while (num != 0);
        System.out.println("La suma de los números ingresados es : " + sum);
    }
}

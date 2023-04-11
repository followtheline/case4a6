/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá 
mostrar el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse 
hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, 
en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
c
 */
package ejer6;

import java.util.Scanner;
public class Ejer6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer número ");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = input.nextInt();

        boolean salir = false;
        while (!salir) {

            System.out.println("Ahora ingrese alguna opción del menú: ");
            System.out.println("MENU");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Salir");
            int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los números ingresados es: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La resta de los números ingresados es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación de los números ingresados es: " + (num1 * num2));
                    break;
                case 4:
                    if (num1 != 0 && num2 != 0 && num2 < num1) {
                        System.out.println("La división del primer número por el segundo es: " + (num1 / num2));
                        break;
                    }
                    if (num1 != 0 && num2 != 0 && num1 < num2) {
                        System.out.println("La división del segundo número por el primero es: " + (num2 / num1));
                        break;
                    }
                    if (num1 <= 0 || num2 <= 0) {
                        System.out.println("No se puede dividir por 0");
                        break;
                    }
                case 5:
                    System.out.println("Esta seguro que desea salir S/N");
                    Scanner input2= new Scanner(System.in);
                    String confirmacion = input2.nextLine();
                    if (confirmacion.equalsIgnoreCase("S")) {
                        salir = true;
                    }
                    break;
                default:
                    System.out.println("El valor ingresado no corresponde, intente nuevamente");
                    break;

            }
        }

    }

}

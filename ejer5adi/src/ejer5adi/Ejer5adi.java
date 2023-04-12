/*
 Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo del tratamiento (previo al descuento) y
determine el importe en efectivo a pagar por dicho socio.

 */
package ejer5adi;

import java.util.Scanner;
public class Ejer5adi {

    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tipo de socio (A, B o C): ");
        String tipo = input.next().toUpperCase();
        System.out.print("Ingrese el costo del tratamiento: ");
        double costo = input.nextDouble();
        double descuento ;
        switch (tipo) {
            case "A":
                descuento = 0.5;
                break;
            case "B":
                descuento = 0.35;
                break;
            case "C":
                descuento = 0;
                break;
            default:
                System.out.println("Error: Tipo de socio inválido.");
                return;
        }
        double importe = costo * (1 - descuento);
        System.out.println("El importe a pagar por el socio de tipo: "+ tipo+ " es $ "+ importe);
    }
    
}

/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. 
y el promedio de estaturas en general.
c
 */
package ejer6adi;

import java.util.Scanner;
public class Ejer6adi {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double altura, promedioGeneral, promedioMenores, sumaTotal, sumaMenores, alturaMenor;
         sumaTotal=0;
          sumaMenores=0;
          promedioMenores=0;
          alturaMenor=0;
        System.out.print("Ingrese la cantidad de personas: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese la altura de la persona " + i + " en metros: ");
            altura = input.nextDouble();
           
            sumaTotal=sumaTotal+altura;
            if (altura < 1.60) {
               alturaMenor=alturaMenor+1;
                sumaMenores=altura+sumaMenores;
            }
        }
        promedioGeneral = sumaTotal / n;
        if (sumaMenores != 0) {
            promedioMenores = sumaMenores / alturaMenor;
        }
        System.out.printf("El promedio de estaturas en general es: %.2f metros\n", promedioGeneral);
        if (sumaMenores != 0) {
            System.out.printf("El promedio de estaturas por debajo de 1.60 metros es: %.2f metros\n", promedioMenores);
        } else {
            System.out.println("No hay personas por debajo de 1.60 metros");
        }
    }
    
}

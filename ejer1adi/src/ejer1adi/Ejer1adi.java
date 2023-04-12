/*
 Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
d
 */
package ejer1adi;
import java.util.Scanner;
public class Ejer1adi {

  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Introduce el tiempo en minutos: ");
        int minutos = input.nextInt();
        int horas = minutos / 60;
        int dias = horas / 24;
        horas %= 24;
        System.out.println(minutos + " minutos equivalen a " + dias + " días y " + horas + " horas.");
      }
    }
    


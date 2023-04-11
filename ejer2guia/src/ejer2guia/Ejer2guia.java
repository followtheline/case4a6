/*
 Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos 
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor 
y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o	Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
o	Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de gasolina”.
o	Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de hormigón”.
o	Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta alimenticia”.
o	Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor válido para tipo de bomba”
as

 */
package ejer2guia;

import java.util.Scanner;
public class Ejer2guia {

   
    public static void main(String[] args) {
      System.out.println("Ingrese un número del 1 al 4 para el tipo de motor: ");
      System.out.println("1 para agua, 2 para gasolina, 3 para hormigón y 4 para pasta alimenticia");
      Scanner leer= new Scanner(System.in);
      int opcion;
      opcion = leer.nextInt();
      switch (opcion){
          case 1:
              System.out.println("Ha seleccionado la opción "+opcion+" por lo tanto, la bomba es una bomba de agua");
              break;
          case 2:
              System.out.println("Ha seleccionado la opción "+opcion+" por lo tanto, la bomba es una bomba de gasolina");
              break;
          case 3:
              System.out.println("Ha seleccionado la opción "+opcion+" por lo tanto, la bomba es una bomba de hormigón");
              break;
          case 4:
              System.out.println("Ha seleccionado la opción "+opcion+" por lo tanto, la bomba es una bomba de pasta alimenticia");
              break;
          default:
              System.out.println(" La opción ingresada: "+opcion+" es incorrecta y no coincide con lo indicado anteriormente");
      }
      
      }
      
    }
    

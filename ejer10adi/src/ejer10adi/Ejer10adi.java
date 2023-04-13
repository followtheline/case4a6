/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación 
entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al 
usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se 
debe permitir al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio 
investigue como utilizar la función Math.random() de Java.
c
 */
package ejer10adi;

import java.util.Scanner;
public class Ejer10adi {

  
    public static void main(String[] args) {
     int num1= (int) (Math.random()*11); 
     int num2= (int) (Math.random()*11);
     int resultado= num1*num2;
     int respuesta;
     do{
         System.out.println("Num1 y num2 son dos números generados aleatoriamente, ingrese su respuesta: ");
         Scanner input= new Scanner(System.in);
         respuesta=input.nextInt();
         if (respuesta == resultado){
             System.out.println("El resultado es correcto");
         }else{
             System.out.println("El resultado es incorrecto, siga intentando");             
         }
             
         }while (respuesta != resultado);
     }
    }
    


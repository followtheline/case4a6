/*
 Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos para 
averiguar la media de edad de los hijos de todas las familias.
cc
 */
package ejer14adi;

import java.util.Scanner;
public class Ejer14adi {

    
    public static void main(String[] args) {
       System.out.println("Ingrese la cantidad de familias que hay: ");
       Scanner input= new Scanner(System.in);
       int n=input.nextInt();
       double m=0, canthijos=0, hijos=0, media=0, edad=0, sumaedad=0, mediatodos;
       for (int i=1; i<=n;i++){
           System.out.println("Ingrese la cantidad de hijos de la familia :"+i);
           Scanner input2=new Scanner(System.in);
           canthijos=input2.nextInt();
          
           for (int j=1; j<=canthijos;j++){
               System.out.println("Ingrese la edad del hijo: "+j);
               Scanner input3= new Scanner(System.in);
               edad= input3.nextInt();
               sumaedad=edad+sumaedad; 
               hijos++;
           }
          
         //  media=sumaedad/hijos;
           // System.out.println("La edad media 2 de la familia "+i+" es: "+media);
           
       
           
       }
       mediatodos=sumaedad/hijos;
       System.out.println("La edad media de los hijos de toda las familias es: "+mediatodos);
    }
    
}

/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo 
de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
“&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
ncorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
f
 */
package ejer7;

import java.util.Scanner;

public class Ejer7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
String frase ;
        int contpos = 0;
        int contneg = -1;
        while (true) {
            System.out.println("Ingrese la palabra de no más de cinco carácteres y debe comenzar con x y finalizar con o");
            frase = input.nextLine();
                    
        if (frase.length()==5 && frase.substring(0,1).equals("X") && frase.substring(4,5).equals("O")) {
            contpos=contpos+1;
        } else {
            contneg=contneg+1;
            if (frase.equals("&&&&&")) {
                break;
            }
        }
        }
System.out.println("Lecturas correctas: "+contpos);
System.out.println("Lecturas incorrectos: "+contneg);
    }

}

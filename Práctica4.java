package org.example;

import java.util.Scanner;

public class Práctica4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el multiplicador (3 cifras)");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el multiplicador (3 cifras)");
        int num2 = teclado.nextInt();

        System.out.println("El resultado de la multiplicación es: " + num1*num2);
        System.out.println("El proceso es:");

        String num1_string = Integer.toString(num1);
        String num1_izquierda = num1_string.substring(0,1);
        String num_centro = num1_string.substring(1,2);
        String num_derecha = num1_string.substring(2,3);
        int num_izquierda_int = Integer.parseInt(num1_izquierda);
        int num_centro_int = Integer.parseInt(num_centro);
        int num_derecha_int = Integer.parseInt(num_derecha);

        System.out.println("  " + num1);
        System.out.println("x " + num2);


    }
}

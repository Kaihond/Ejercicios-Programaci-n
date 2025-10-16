package org.example;

import java.util.Scanner;

public class Práctica4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        boolean repetir = false;

        do{
            try{
                System.out.println("Introduce el multiplicador (3 cifras)");
                num1 = teclado.nextInt();

                System.out.println("Introduce el multiplicador (3 cifras)");
                num2 = teclado.nextInt();
            }catch(Exception err){
                System.out.println("Intrduce un formato correcto");
                repetir = true;
            }

            teclado.nextLine();

        }while(repetir==true);

        System.out.println("El resultado de la multiplicación es: " + num1*num2);
        System.out.println("El proceso es:");

        String num1_string = Integer.toString(num1);
        String num1_izquierda = num1_string.substring(0,1);
        String num1_centro = num1_string.substring(1,2);
        String num1_derecha = num1_string.substring(2,3);
        int num_izquierda_int = Integer.parseInt(num1_izquierda);
        int num_centro_int = Integer.parseInt(num1_centro);
        int num_derecha_int = Integer.parseInt(num1_derecha);

        String num2_string = Integer.toString(num2);
        String num2_izquierda = num2_string.substring(0,1);
        String num2_centro = num2_string.substring(1,2);
        String num2_derecha = num2_string.substring(2,3);
        int num2_izquierda_int = Integer.parseInt(num2_izquierda);
        int num2_centro_int = Integer.parseInt(num2_centro);
        int num2_derecha_int = Integer.parseInt(num2_derecha);

        System.out.println("  " + num1);
        System.out.println("x " + num2);
        System.out.println("--------");
        System.out.println("  " + num2_derecha_int*num1);
        System.out.println("  " + num2_centro_int*num1 + "x");
        System.out.println(" " + num2_izquierda_int*num1 + "xx");
        System.out.println("--------");
        System.out.println(" " + num1*num2);

    }
}

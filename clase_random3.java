package org.example;

import java.util.Random;
import java.util.Scanner;

public class clase_random3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        System.out.println("Dime el rango mínimo");
        int rango_min = teclado.nextInt();

        System.out.println("Dime el rango máximo");
        int rango_max = teclado.nextInt();

        int num = 0;

        System.out.println("¿Cuántos números quieres?");
        int nums = teclado.nextInt();

        if (rango_max<rango_min){

            System.out.println("Valores incorrectos");
            return;

        }

        for (int i = 0; i < nums; i++){

            num = aleatorio.nextInt(rango_max - rango_min + 1) + rango_min;
            System.out.println(num);

        }
    }
}

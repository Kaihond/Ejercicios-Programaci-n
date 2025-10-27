package org.example;

import java.util.Random;

public class clase_random1 {

    static void main() {

        Random aleatorio = new Random();

        int numero = aleatorio.nextInt(6)+1;
        int numero2 = aleatorio.nextInt(6)+1;
        int resultado = numero+numero2;

        System.out.println("Dado 1: " + numero);
        System.out.println("Dado 2: " + numero2);
        System.out.println("Resultado: " + resultado);

    }
}

package org.example;

import java.util.Scanner;

public class practica3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        System.out.println("Introduce tu altura (cm)");
        int altura = teclado.nextInt();

        int minimo = 140;
        int diferencia = (minimo-altura);
        int peso_minimo = (altura*2/8);
        int peso_maximo = 120

        if (altura<140 && altura>0){
            System.out.println("Lo siento, no puedes montar en la atracción. Te faltan " + diferencia + "cm de altura.");
        }
        if (altura>230 || altura<0){
            System.out.println("Error de lectura. Baja de la báscula y vuelve a subir.");
        }

        System.out.println("Introduce tu peso (kg)");
        int peso = teclado.nextInt();
    }
}

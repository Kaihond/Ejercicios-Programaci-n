package org.example;

import java.util.Scanner;

public class Practica3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        // Le ofrezco al usuario las 3 opciones que dispone el programa.

        System.out.println("Elige una función");
        System.out.println("--------------------");
        System.out.println("[1] Validar ISBN");
        System.out.println("[2] Reparar ISBN");
        System.out.println("[3] Salir");
        System.out.println("--------------------");
        int funcion = teclado.nextInt();

        switch (funcion){

            case 1:

                System.out.println("Introduce el ISBN (10 dígitos):");
                String isbn = teclado.next();

                // Delimito el tamaño del ISBN para que dé error si no es correcto.

                if (isbn.length() != 10) {

                    System.out.println("El tamaño no es el correcto");
                    return;
                }

                // Extraigo cada dígito con substring().

                String num_1 = isbn.substring(0, 1);
                String num_2 = isbn.substring(1, 2);
                String num_3 = isbn.substring(2, 3);
                String num_4 = isbn.substring(3, 4);
                String num_5 = isbn.substring(4, 5);
                String num_6 = isbn.substring(5, 6);
                String num_7 = isbn.substring(6, 7);
                String num_8 = isbn.substring(7, 8);
                String num_9 = isbn.substring(8, 9);
                String num_10 = isbn.substring(9, 10);

                // Si el último carácter es 'X' hago que valga 10.

                int num_10_int;

                if (num_10.equalsIgnoreCase("X")) {

                    num_10_int = 10;

                } else {

                    num_10_int = Integer.parseInt(num_10);

                }

                // Convierto los número a enteros.

                int num_1_int = Integer.parseInt(num_1);
                int num_2_int = Integer.parseInt(num_2);
                int num_3_int = Integer.parseInt(num_3);
                int num_4_int = Integer.parseInt(num_4);
                int num_5_int = Integer.parseInt(num_5);
                int num_6_int = Integer.parseInt(num_6);
                int num_7_int = Integer.parseInt(num_7);
                int num_8_int = Integer.parseInt(num_8);
                int num_9_int = Integer.parseInt(num_9);

                // Calculo el ISBN.

                int num_final = (num_1_int * 10 + num_2_int * 9 + num_3_int * 8 + num_4_int * 7 + num_5_int * 6 + num_6_int * 5 + num_7_int * 4 + num_8_int * 3 + num_9_int * 2 + num_10_int * 1);

                if (num_final % 11 == 0) {

                    System.out.println("El ISBN es válido.");

                } else {

                    System.out.println("El ISBN no es válido.");

                }

                break;


            case 2:

                System.out.println("Introduce el ISBN con un signo '?' en lugar del dígito desconocido:");
                String isbn_incompleto = teclado.next();

                // Otra vez compruebo el tamaño del ISBN para que dé error si no es correcto.

                if (isbn_incompleto.length() != 10) {

                    System.out.println("El tamaño no es el correcto");
                    return;
                }

                // Defino el interrogante y busco su posición en el ISBN.

                int interrogante = isbn_incompleto.indexOf('?');

                if (interrogante == -1) {

                    System.out.println("No se ha encontrado el símbolo '?'.");
                    return;
                }

                // Compruebo, remplazo y divido entre 11 el interrogante para comprobar
                // cuál es el número correcto.

                for (int i = 0; i <= 9; i++) {

                    String isbnPropuesto = isbn_incompleto.substring(0, interrogante)
                            + i
                            + isbn_incompleto.substring(interrogante + 1);

                    int suma2 = 0;

                    for (int j = 0; j < 10; j++) {

                        char c = isbnPropuesto.charAt(j);
                        int valor;

                        if (c == 'X' && j == 9) {
                            valor = 10;
                        } else {
                            valor = c - '0';
                        }

                        suma2 += valor * (10 - j);
                    }

                    // Una vez comprovado este se imprime.

                    if (suma2 % 11 == 0) {

                        System.out.println("El dígito que falta es: " + i);
                        System.out.println("ISBN corregido: " + isbnPropuesto);
                        return;
                    }
                }

                System.out.println("No se ha podido reparar el ISBN. Revisa el formato.");
                break;

            case 3:

                // Si se escoge "Salir" el programa finaliza.

                System.out.println("Programa finalizado");
                return;

            default:

                System.out.println("Opción no válida.");
        }


    }
}

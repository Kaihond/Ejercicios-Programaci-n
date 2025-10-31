package org.example;

import java.util.Random;
import java.util.Scanner;

public class Fakejack {

    static void main() {


        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        System.out.println("*** BIENVENIDO AL FAKEJACK ***");

        int banca_num = aleatorio.nextInt(5) + 17;
        int jugador_num = aleatorio.nextInt(9) + 2;

        System.out.println("Tu carta es: " + jugador_num);
        System.out.println("Puntuación actual: " + jugador_num);

        int jugador_num_2 = aleatorio.nextInt(9) + 2;


        for (int i = jugador_num; i <=21 ; i + ){

            System.out.println("¿Quieres lanzar otra carta? (S/N)");
            String opcion = teclado.next();

            String num = jugador_num_2.substring(0, 2);
            int num_int = Integer.parseInt(num);

            int total = jugador_num + jugador_num_2;

            switch (opcion.toLowerCase()) {

                case ("s"):

                    System.out.println("Tu carta es: " + jugador_num_2);
                    System.out.println("Puntuación actual: " + total);

                    break;

                case ("n"):

                    if (banca_num<total){

                        System.out.println("¡HAS GANADO!");
                        System.out.println("Puntos Banca: ");
                        System.out.println("Puntos Jugador: ");

                    }else if (banca_num>total){

                        System.out.println("TE HAS PASADO. ¡LA BANCA GANA!");
                        System.out.println("Puntos Banca: ");
                        System.out.println("Puntos Jugador: ");

                        break;
                }


            }

            if (i>21){

                System.out.println("TE HAS PASADO. ¡LA BANCA GANA!");
                System.out.println("Puntos Banca: ");
                System.out.println("Puntos Jugador: ");

                return;

            }


        }


    }
}





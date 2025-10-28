package org.example;

import java.util.Random;

public class clase_random4 {

    static void main() {

        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";

        Random aleatorio = new Random();

        String mayus_1 = "";
        String minus_1 = "";
        int num_1 = 0;
        int longitud = aleatorio.nextInt(5) + 8;

        for (int i = 0; i < longitud; i++){

            minus_1 += (minus.charAt(aleatorio.nextInt(minus.length())));
            mayus_1 += (mayus.charAt(aleatorio.nextInt(mayus.length())));
            num_1 += (num.charAt(aleatorio.nextInt(num.length())));
        }

        String contrasenya = mayus_1+minus_1+num_1;

        System.out.println(contrasenya);
    }
}
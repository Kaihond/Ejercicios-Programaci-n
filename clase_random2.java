package org.example;

import java.util.Random;

public class clase_random2 {

    static void main() {

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        Random aleatorio = new Random();

        String contrasenya = "";

        for (int i = 0; i<12; i++){

            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()));
        }

        System.out.println(contrasenya);

    }
}

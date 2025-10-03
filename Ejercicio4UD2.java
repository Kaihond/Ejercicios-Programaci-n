package org.example;

public class Ejercicio4UD2 {

    static void main() {

        int num = 433;

        String num_string = Integer.toString(num);
        String num_izquierda = num_string.substring(0,1);
        int num_izquierda_int = Integer.parseInt(num_izquierda);

        System.out.println(num_izquierda_int*100);
    }
}

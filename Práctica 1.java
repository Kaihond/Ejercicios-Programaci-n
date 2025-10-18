package org.example;

import java.util.Scanner;

public class Práctica1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");
        String fecha = teclado.next();

        //Delimito los caractéres de la fecha para que, si tiene más o menos de los necesarios,
        // dé error.

        if (fecha.length() < 10 || fecha.length() > 10){

            System.out.println("Formato incorrecto. Debe ser dd/mm/aaaa");
            return;
        }

        //Convierto la fecha a substring y segmento las posiciones de la fecha en día, mes y año

        String fecha_dia = fecha.substring(0, 2);
        String fecha_mes = fecha.substring(3, 5);
        String fecha_anyo = fecha.substring(6, 10);

        //Lo vuelvo a convertir a número

        int fecha_dia_int = Integer.parseInt(fecha_dia);
        int fecha_mes_int = Integer.parseInt(fecha_mes);
        int fecha_anyo_int = Integer.parseInt(fecha_anyo);

        //Delimito los parámetros de los días, meses y años para que si se sobrepasan
        // o no llegan a un mínimo dé error.

        if (fecha_dia_int > 31) {

            System.out.println("La fecha es incorrecta");
            return;

        } else if (fecha_dia_int < 1) {

            System.out.println("La fecha es incorrecta");
            return;
        }

        if (fecha_mes_int < 1){

            System.out.println("La fecha es incorrecta");
            return;

        }else if (fecha_mes_int > 12){

            System.out.println("La fecha es incorrecta");
            return;
        }

        if (fecha_anyo_int > 2025){

            System.out.println("La fecha es incorrecta");
            return;

        }else if (fecha_anyo_int < 1900){

            System.out.println("La fecha es incorrecta");
            return;
        }

        //Defino la fecha total y la convierto a "String"

        int fecha_total = fecha_dia_int + fecha_mes_int + fecha_anyo_int;
        String fecha_total_str = String.valueOf(fecha_total);

        System.out.println(fecha_dia_int + "+" + fecha_mes_int + "+" + fecha_anyo_int + " = " + fecha_total);

        //Segmento la fecha_total en número individuales y los vuelvo a convertir a número.

        String fecha_total_1 = fecha_total_str.substring(0, 1);
        String fecha_total_2 = fecha_total_str.substring(1, 2);
        String fecha_total_3 = fecha_total_str.substring(2, 3);
        String fecha_total_4 = fecha_total_str.substring(3, 4);

        int fecha_total_1_int = Integer.parseInt(fecha_total_1);
        int fecha_total_2_int = Integer.parseInt(fecha_total_2);
        int fecha_total_3_int = Integer.parseInt(fecha_total_3);
        int fecha_total_4_int = Integer.parseInt(fecha_total_4);

        //Defino el número de la suerte y lo muestro.

        int num_suerte = (fecha_total_1_int+fecha_total_2_int+fecha_total_3_int+fecha_total_4_int);

        System.out.println(fecha_total_1 + "+" + fecha_total_2_int + "+" + fecha_total_3_int + "+" + fecha_total_4_int + " = " + num_suerte);
        System.out.println("Tu número de la suerte es: " + num_suerte);
    }
}

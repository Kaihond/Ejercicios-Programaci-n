package org.example;

import java.util.Scanner;

public class Main{

    static void main() {

        Scanner teclado = new Scanner(System.in);

        //Doy la bienvenida al usuario
        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        // Creo variables para almacenar la altura y un booleano para la repetición
        int altura = 0;
        boolean repetir = false;

        // Hago un bucle para que el usuario introduzca su altura y añado un "trycatch" para que no explote
        // y hago que se repita con un "while" si la información introducida es incorrecta
        do {
            try{
                System.out.println("Introduce tu altura (cm)");
                altura = teclado.nextInt();
                repetir=false;
            }catch(Exception err){
                System.out.println("El formato introducido no es correcto");
                repetir=true;
            }
            teclado.nextLine();
        }while (repetir==true);

        //Defino las variables de altura
        int altura_minimo = 140;
        int altura_maximo = 230;
        int diferencia_altura = (altura_minimo-altura);

        //Hago que si la altura supera ciertos límites salga un mensaje y termine el programa
        if (altura<altura_minimo && altura>0){
            System.out.println("Lo siento, no puedes montar en la atracción. Te faltan " + diferencia_altura + "cm de altura.");
            System.exit(0);
        }else if (altura>altura_maximo || altura<0){
            System.out.println("Error de lectura. Baja de la báscula y vuelve a subir.");
            System.exit(0);
        }
        //Variable para almacenar el peso del usuario
        double peso = 0;

        // Ahora hago un bucle para que el usuario introduzca su peso, añado un "trycatch" para que tampoco explote
        // y hago que se repita con un "while" si la información introducida es incorrecta
        do{
            try{
                System.out.println("Introduce tu peso (kg)");
                peso = teclado.nextInt();
                repetir=false;
            }catch (Exception err){
                System.out.println("El formato introducido no es correcto");
                repetir=true;
            }
            teclado.nextLine();
        }while (repetir==true);

        //Defino las variables de peso
        int peso_minimo = ((altura*2)/8);
        int peso_maximo = 120;
        double diferencia_peso_up = (peso-peso_maximo);
        double diferencia_peso_down = (peso_minimo-peso);

        //Y, por último, valido el peso para, en caso de estar entre los valores adecuados, permitir el acceso a la atracción
        if (peso>peso_maximo){
            System.out.println("Lo siento. Sobrepasas en " + diferencia_peso_up + " kg el límite de la atracción");
        }else if (peso_minimo>peso){
            System.out.println("No alcanzas el límite de peso por " + diferencia_peso_down + " kg.");
        }else{
            System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + peso_minimo + " kg.");
            System.out.println("Puedes subir a la atracción.");
        }
    }
}

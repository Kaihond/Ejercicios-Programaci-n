package org.example;

import java.util.Scanner;

public class practica3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");

        int altura = 0;
        boolean repetir = false;

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

        int altura_minimo = 140;
        int altura_maximo = 230;
        int diferencia_altura = (altura_minimo-altura);

        if (altura<altura_minimo && altura>0){
            System.out.println("Lo siento, no puedes montar en la atracción. Te faltan " + diferencia_altura + "cm de altura.");
        }else if (altura>altura_maximo || altura<0){
            System.out.println("Error de lectura. Baja de la báscula y vuelve a subir.");
        }

        double peso = 0;

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

        int peso_minimo = ((altura*2)/8);
        int peso_maximo = 120;
        double diferencia_peso_up = (peso-peso_maximo);
        double diferencia_peso_down = (peso_minimo-peso);

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

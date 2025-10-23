package org.example;

import java.util.Scanner;

public class calculadora_simple {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        //Doy la bienvenida al usuario y le pido que introduzca el primer operando.

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        double num1 = 0;

        try {
            System.out.println("Introduce un operando");
            num1 = teclado.nextDouble();
        } catch (Exception err) {
            System.out.println("Intrduce un formato correcto");
            return;
        }

        //Después le muestro las operaciones disponibles y le doy a elegir una.

        System.out.println("--------------------");
        System.out.println("[+] -> sumar");
        System.out.println("[-] -> restar");
        System.out.println("[x] -> multiplicar");
        System.out.println("[/] -> dividir");
        System.out.println("[R] -> raíz cuadrada");
        System.out.println("--------------------");

        System.out.println("Elige una operación");
        String operando = teclado.next().toUpperCase();

        //Si lo que ha introducido por texto no se corresponde con una de las operaciones
        // disponibles; el programa mostrará el siguiente mensaje y terminará.

        if (!(operando.equals("+") || operando.equals("-") || operando.equals("X") || operando.equals("/") || operando.equals("R"))) {

            System.out.println("Operación no válida. Introduce una operación correcta.");
            return;

        }

            double num2 = 0;
            double resultado = 0;

            //Por lo contrario, si introduce una operación correctamente, se iniciará un
            // "try-catch" donde, en el "try", se resolverán las operaciones pidiendo
            // (menos en "R") el segundo operando y mostrando el resultado consecuente. y,
            // en el "catch", se controlará que se introducen operadores numéricos.

            try {

                switch (operando) {

                    case "+":

                        System.out.print("Introduce el segundo operando: ");
                        num2 = teclado.nextDouble();
                        resultado = num1 + num2;
                        System.out.println("El resultado de " + num1 + " + " + num2 + " es " + resultado);
                        break;

                    case "-":

                        System.out.print("Introduce el segundo operando: ");
                        num2 = teclado.nextDouble();
                        resultado = num1 - num2;
                        System.out.println("El resultado de " + num1 + " - " + num2 + " es " + resultado);
                        break;

                    case "X":

                        System.out.print("Introduce el segundo operando: ");
                        num2 = teclado.nextDouble();
                        resultado = num1 * num2;
                        System.out.println("El resultado de " + num1 + " x " + num2 + " es " + resultado);
                        break;

                    case "/":

                        System.out.print("Introduce el segundo operando: ");
                        num2 = teclado.nextDouble();
                        if (num2 != 0) {
                            resultado = num1 / num2;
                            System.out.println("El resultado de " + num1 + " / " + num2 + " es " + resultado);
                        } else {
                            System.out.println("Error: no se puede dividir entre 0.");
                        }
                        break;

                    case "R":

                        if (num1 >= 0) {
                            resultado = Math.sqrt(num1);
                            System.out.println("La raíz cuadrada de " + num1 + " es " + resultado);
                        } else {
                            System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
                        }
                        break;

                        // También se controlará en el "default", si no se ha introducido el
                        // operador pertinente, que salga el siguiente mensaje.

                    default:
                        System.out.println("Operación no reconocida.");
                        break;
                }

            } catch (Exception err) {
                System.out.println("Introduce valores numéricos válidos.");
            }
        }
    }

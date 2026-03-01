package com.example;

public class Operadores {
    public static void demostrarAritmeticos() {

        int a = 10;
        int b = 3;

        System.out.println("Aritméticos:");
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));
    }

    public static void demostrarIncrementoDecremento() {
        int x = 5;

        System.out.println("\nIncremento y decremento:");
        System.out.println("Post-incremento: " + (x++));
        System.out.println("Después del post-incremento: " + x);
        System.out.println("Pre-incremento: " + (++x));
        System.out.println("Pre-decremento: " + (--x));
    }

    public static void demostrarRelacionales() {
        int a = 10;
        int b = 20;

        System.out.println("\nRelacionales:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
    }

    public static void demonstrarLogicos() {
        boolean tieneLicencia = true;
        boolean esMayorEdad = false;

        System.out.println("\nLógicos:");
        System.out.println("AND (&&): " + (tieneLicencia && esMayorEdad));
        System.out.println("OR (||): " + (tieneLicencia || esMayorEdad));
        System.out.println("NOT (!): " + (!tieneLicencia));
    }
     public static void demostrarAsignacionCompuesta() {
        int numero = 10;

        System.out.println("\nAsignación compuesta:");
        numero += 5;
        System.out.println("+= 5 → " + numero);
        numero -= 3;
        System.out.println("-= 3 → " + numero);
        numero *= 2;
        System.out.println("*= 2 → " + numero);
        numero /= 4;
        System.out.println("/= 4 → " + numero);
    }

    public static void demostrarOperadorTernario() {
        int edad = 18;

        String resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";

        System.out.println("\nOperador ternario:");
        System.out.println("Resultado: " + resultado);
    }
}

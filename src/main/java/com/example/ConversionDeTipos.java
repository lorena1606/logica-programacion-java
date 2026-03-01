package com.example;

public class ConversionDeTipos {
    
    public static void demostrarCastingImplicito() {

        int numeroInt = 100;
        double numeroDouble = numeroInt; // int → double (automático)

        System.out.println("Casting implícito:");
        System.out.println("int: " + numeroInt);
        System.out.println("double: " + numeroDouble);
    }

    public static void demostrarCastingExplicito() {
        double numeroDouble = 9.99;
        int numeroInt = (int) numeroDouble; // double → int (manual)

        System.out.println("\nCasting explícito:");
        System.out.println("double: " + numeroDouble);
        System.out.println("int (convertido): " + numeroInt);
    }

    public static void demostrarProblemaDePrecision() {
        double valorDouble = 7.89;
        int valorInt = (int) valorDouble;

        System.out.println("\nPérdida de precisión:");
        System.out.println("Valor original (double): " + valorDouble);
        System.out.println("Valor convertido (int): " + valorInt);
        System.out.println("Se pierden los decimales al convertir.");
    }
}


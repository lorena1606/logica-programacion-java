package com.example;

public class TiposDeDatosPrimitivos {
    
    public static void demostrarEnteros() {
        byte numeroByte = 10;
        short numeroShort = 200;
        int numeroInt = 5000;
        long numeroLong = 100000L;

        System.out.println("byte: " + numeroByte);
        System.out.println("short: " + numeroShort);
        System.out.println("int: " + numeroInt);
        System.out.println("long: " + numeroLong);
    }

    public static void demostrarFlotantes() {
        float numeroFloat = 3.14f;
        double numeroDouble = 2.71828;

        System.out.println("float: " + numeroFloat);
        System.out.println("double: " + numeroDouble);
    }
    public static void demostrarCaracter() {
        char letra = 'A';

        System.out.println("char: " + letra);
    }

    public static void demostrarBooleanos() {
        boolean esMayorDeEdad = true;
        boolean tieneLicencia = false;

        System.out.println("¿Es mayor de edad?: " + esMayorDeEdad);
        System.out.println("¿Tiene licencia?: " + tieneLicencia);
    }

    public static void demostrarValoresPorDefecto() {
        // Los valores por defecto SOLO aplican a variables de instancia o de clase,
        // NO a variables locales. Por eso aquí solo lo explicamos.

        /*
         * byte -> 0
         * short -> 0
         * int -> 0
         * long -> 0L
         * float -> 0.0f
         * double -> 0.0
         * char -> '\u0000'
         * boolean -> false
         */
        System.out.println("Los valores por defecto se explican en comentarios.");
    }
}

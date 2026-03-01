package com.example;

public class VariablesYConstantes {
    
    public static void demostrarDeclaracionAsignacion () {

        int edad = 18;
        double salario = 23000;
        String nombre = "lorena";
        char letras = 'L';
        boolean example = true;

        System.out.println("La Edad: " + edad);
        System.out.println("El Salario: " + salario);
        System.out.println("Su Nombre: " + nombre);
        System.out.println("la letra es : " + letras);
        System.out.println("el ejemplo es : " + example);
    }
     public static void demostrarConvencionesNombres() {
        int numeroEstudiantes = 30;
        double promedioNotas = 4.5;
        boolean estudianteActivo = true;

        System.out.println("Número de estudiantes: " + numeroEstudiantes);
        System.out.println("Promedio de notas: " + promedioNotas);
        System.out.println("¿Estudiante activo?: " + estudianteActivo);
    }

    public static void demostrarConstantes() {
        final double PI = 3.1416;
        final int DIAS_SEMANA = 7;

        System.out.println("Valor de PI: " + PI);
        System.out.println("Días de la semana: " + DIAS_SEMANA);
    }
}    
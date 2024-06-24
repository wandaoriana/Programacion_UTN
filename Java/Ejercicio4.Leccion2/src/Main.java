//clase 11 ejercicio
// Ejercicio : Determinar si un alumno aprueba o reprueba un curso,
// sabiendo que aprobará si su promedio de tres calificaciones es mayor o igual a 70.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;

        System.out.print("Digite la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Digite la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Digite la tercera nota: ");
        nota3 = scanner.nextDouble();

        // Calcular el promedio
        promedio = (nota1 + nota2 + nota3) / 3;

        // Determinar si el alumno está aprobado o reprobado
        if (promedio >= 70) {
            System.out.println("El alumno está aprobado con un promedio de: " + promedio);
        } else {
            System.out.println("El alumno está reprobado con un promedio de: " + promedio);
        }
    }
}

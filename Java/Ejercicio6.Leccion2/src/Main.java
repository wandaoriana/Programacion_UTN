//Clase 11 ejercicios

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.print("Digite el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Digite el segundo número: ");
        num2 = scanner.nextDouble();

        // Comprobar si los números son iguales
        if (num1 == num2) {
            resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
        } else {
            resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
        }
    }
}

//Clase 11 ejercicios

// Ejercicio: Calcular el precio final con descuento del 20%

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double compra, descuento, precioFinal;

        System.out.print("Digite la cantidad a pagar: ");
        compra = scanner.nextDouble();

        // Calcular el descuento (20%)
        descuento = compra * 0.2;

        // Calcular el precio final
        precioFinal = compra - descuento;

        System.out.println("El precio a pagar es: " + precioFinal);
    }
}

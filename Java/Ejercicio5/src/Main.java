import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, introduce la primera calificación:");
        double calificacion1 = scanner.nextDouble();

        System.out.println("Por favor, introduce la segunda calificación:");
        double calificacion2 = scanner.nextDouble();

        System.out.println("Por favor, introduce la tercera calificación:");
        double calificacion3 = scanner.nextDouble();

        double suma = calificacion1 + calificacion2 + calificacion3;

        System.out.println("La suma de las tres calificaciones es: " + suma);
    }
}


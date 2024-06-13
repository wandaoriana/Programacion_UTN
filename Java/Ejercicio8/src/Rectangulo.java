import java.util.Scanner;
public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite el alto del rectangulo:");
        int alto = scanner.nextInt();

        System.out.println("Digite el ancho del rectangulo:");
        int ancho = scanner.nextInt();

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);


    }
}


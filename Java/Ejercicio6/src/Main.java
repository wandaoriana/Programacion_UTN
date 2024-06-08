import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, introduce la cantidad de dinero que tiene Guillermo:");
            double dineroGuillermo = scanner.nextDouble();

            double dineroLuis = dineroGuillermo / 2;
            double dineroJuan = (dineroGuillermo + dineroLuis) / 2;

            double dineroTotal = dineroGuillermo + dineroLuis + dineroJuan;

            System.out.println("Guillermo tiene: " + dineroGuillermo + " dólares");
            System.out.println("Luis tiene: " + dineroLuis + " dólares");
            System.out.println("Juan tiene: " + dineroJuan + " dólares");
            System.out.println("Entre los tres tienen: " + dineroTotal + " dólares");


    }
}
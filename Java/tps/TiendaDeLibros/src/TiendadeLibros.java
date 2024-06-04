import java.util.Scanner;  // Importa la clase Scanner del paquete java.util

public class TiendadeLibros {  // Define una clase pública llamada en este caso "Tienda de libros"
    public static void main(String[] args) {  // Define el método principal que se ejecuta al iniciar el programa
        Scanner scanner = new Scanner(System.in);  // Crea un objeto Scanner para leer la entrada del usuario

        System.out.println("Ingrese los siguientes datos del libro.");  // Imprime un mensaje en la consola

        System.out.println("Digite el nombre del libro.");  // Pide al usuario que ingrese el nombre del libro
        String nombre = scanner.nextLine();  // Lee la entrada del usuario y la guarda en la variable 'nombre'

        System.out.println("Digite el ID del libro.");  // Pide al usuario que ingrese el ID del libro
        String id = scanner.nextLine();  // Lee la entrada del usuario y la guarda en la variable 'id'

        System.out.println("Digite el precio del libro.");  // Pide al usuario que ingrese el precio del libro
        double precio = scanner.nextDouble();  // Lee la entrada del usuario y la guarda en la variable 'precio'
        scanner.nextLine();  // Consume el salto de línea restante

        System.out.println("Indicar si el envío es gratuito (True/False).");  // Pide al usuario que indique si el envío es gratuito
        boolean envioGratuito = scanner.nextBoolean();  // Lee la entrada del usuario y la guarda en la variable 'envioGratuito'
        scanner.nextLine();  //salto de línea

        System.out.println("Nombre: " + nombre);  // Imprime el nombre del libro
        System.out.println("ID: " + id);  // Imprime el ID del libro
        System.out.println("Precio: " + precio);  // Imprime el precio del libro
        System.out.println("¿El envío es gratuito? " + (envioGratuito ? "Sí" : "No"));  // Imprime si el envío es gratuito o no
    }
}
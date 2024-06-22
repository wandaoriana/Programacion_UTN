
//Clase 10



public class Leccion2 {
    public static void main(String[] args) {

        var condicion = false;

        if (condicion) {
            System.out.println("Condición Verdadera"); //condicional simple
        } else {
            System.out.println("Condición Falsa"); //condicional doble
        }

        var numero = 2;
        var numeroTexto = "Número desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2) {
            numeroTexto = "Número dos";
        } else if (numero == 3) {
            numeroTexto = "Número tres";
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }

        System.out.println("numeroTexto - " + numeroTexto);

        /*
        int numeroSwitch = Integer.parseInt(entrada.nextLine());
        String numeroTextoSwitch = "Valor desconocido";

        switch (numeroSwitch) {
            case 1:
                numeroTextoSwitch = "Numero Uno";
                break;
            case 2:
                numeroTextoSwitch = "Numero dos";
                break;
            case 3:
                numeroTextoSwitch = "Numero tres";
                break; // Este break faltaba
            case 4:
                numeroTextoSwitch = "Numero 4";
                break; // Es buena práctica poner un break incluso en el último caso
        }

        System.out.println(numeroTextoSwitch);
        */
    }
}






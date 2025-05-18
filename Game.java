import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args){
        int Intentos = 15;
        int NumeroMaximo = 50;
        int IntentosRestantes = Intentos;
        Random random = new Random();
        int Numero = random.nextInt(NumeroMaximo) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("JUEGO DE ADIVINANZA");
        System.out.println("El numero maximo de intentos para adivinar el numero es " + Intentos);
        System.out.println("Debes adivinar un numero que esta entre 1 y " + NumeroMaximo);

        while (IntentosRestantes > 0) {
            System.out.println("Tienes " + IntentosRestantes + " intentos restantes");
            System.out.print("Introduce un numero entre 1 y " + NumeroMaximo + ": ");
            int Adivina = scanner.nextInt();

            if (Adivina == Numero) {
                System.out.println("¡Has adivinado el número!");
                break; // Termina el juego si adivina
            }
            else if (Adivina < Numero) {
                System.out.println("El numero es mayor.");
            } else {
                System.out.println("El numero es menor.");
            }

            IntentosRestantes--;

            if (IntentosRestantes == 0) {
                System.out.println("Has perdido. El numero era " + Numero);
            }
        }

        System.out.println("Gracias por jugar.");
        scanner.close();
    }
}


        
    
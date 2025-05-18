import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args){
        int Intentos = 15;
        int NumeroMaximo= 50;
        int IntentosRestantes = Intentos;
        Random random = new Random();
        int Numero = random.nextInt(50) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("JUEGO DE ADIVINANZA");
        System.out.println("El número máximo de intentos para adivinar el número es " + Intentos);
        System.out.println("Debes adivinar un número que está entre 1 y 50 " + NumeroMaximo);
    
    
        while (IntentosRestantes < Intentos) {
        System.out.println("Tienes " + IntentosRestantes + "intentos restantes");}
        System.out.println("Introduce un número entre 1 y 50");
        int Adivina = scanner.nextInt();
        
        if (Adivina == Numero) {
            System.out.println("Has adivinado el número.");
        }
        else if (Adivina < Numero) {
            System.out.println("El número es mayor.");
        } else {
            System.out.println("El número es menor.");
        }

        System.out.println("Te quedan " + (Intentos - IntentosRestantes) + " intentos.");
        IntentosRestantes--;
        if (IntentosRestantes == 0) {
            System.out.println("Has perdido. El número era " + Numero);
        }
        
        scanner.close();
    }
}


        
    
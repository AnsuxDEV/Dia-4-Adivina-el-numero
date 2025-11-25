import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        boolean again = true;

        System.out.println("¡Bienvenido a 'Adivina el número'!");

        while(again){
            int numeroSecreto = random.nextInt(100) + 1; //Esto hace que se genere un numero aleatorio entre 1 y 100
            int tries = 0; // Este es un contador de las veces que has fallado
            boolean acertar = false; // Cuando se acierte el numero, esta variable pasará a True

            System.out.println("Ya tengo mi numero entre 1 y 100... ¿Podrás adivinarlo?");
            while(!acertar){
                System.out.println("Intento " + tries + ": ");

                if (teclado.hasNextInt()) {
                    int numero = teclado.nextInt();
                    teclado.nextLine();
                    tries++;

                    if (numero == numeroSecreto) {
                        System.out.println("¡Enhorabuena! Me has pillado...");
                        System.out.println("El numero era " + numeroSecreto);
                        System.out.println("Has tardado " + tries + " intentos");
                        if (tries == 1) {
                            System.out.println("¡Vaya máquina! Seguro que has usado hacks");
                        } else if (tries > 2 && tries <= 10) {
                            System.out.println("¡Guau! ¡Increible!");
                        } else if (tries > 10 && tries <= 30) {
                            System.out.println("Oye, ni tan mal ¿eh?");
                        } else if (tries > 30 && tries <= 100) {
                            System.out.println("Bueno, al menos tienes salud... Espero");
                        } else if (tries > 100) {
                            System.out.println("¿Por qué has repetido numeros? No sabes contar supongo ¿no?");
                        }
                        acertar = true;
                    } else if (numero < numeroSecreto){
                        System.out.println("El número es más alto \uD83D\uDCC8");
                    } else {
                        System.out.println("El numero es más bajo \uD83D\uDCC9");
                    }
                } else {
                    System.out.println("Eso no es un número. Introduce un número entre 1 y 100");
                    teclado.nextLine();
                }
            }
            System.out.println("¿Quieres jugar otra partida? 's' para SI o cualquier otra tecla para NO");
            String respuestaAgain = teclado.nextLine().trim().toLowerCase();
            if (!respuestaAgain.equals("s")) {
                again = false;
                System.out.println("Muchas gracias por jugar. ¡Hasta la próxima!");
            }
        }
        teclado.close();
    }
}
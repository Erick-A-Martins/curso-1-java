import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);

        System.out.println("BOAS VINDAS AO JOGO DE ADIVINHACAO");
        System.out.println("Digite seu chute: ");
        int numeroChutado = input.nextInt();

        while (numeroChutado != numeroAleatorio) {
                if (numeroChutado > numeroAleatorio) {
                    System.out.println("O numero chutado e maior que o numero secreto!");
                    System.out.println("Insira outro: ");
                    numeroChutado = input.nextInt();
                } else {
                    System.out.println("O numero chutado e menor que o numero secreto!");
                    System.out.println("Insira outro: ");
                    numeroChutado = input.nextInt();
                }
        }
        if (numeroChutado == numeroAleatorio) {
            System.out.println("Parabens voce adivinhou o numero secreto! (" + numeroAleatorio +")");
        }

    }
}

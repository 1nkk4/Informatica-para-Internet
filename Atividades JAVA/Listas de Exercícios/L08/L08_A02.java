package projetomaneiro;

import java.util.Scanner;
import java.util.Random;

public class L08_A02 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int num = r.nextInt(100) + 1;
        int p;

        do {
            System.out.println("Digite um palpite (1 a 100): ");
            p = sc.nextInt();

            if (p < num) {
                System.out.println("O valor é maior");
            } else if (p > num) {
                System.out.println("O valor é menor");
            }

        } while (p != num);

        System.out.println("Você acertou!");
        System.out.printf("Valor digitado: %d Valor aleatorio: %d", p, num);

    }
}

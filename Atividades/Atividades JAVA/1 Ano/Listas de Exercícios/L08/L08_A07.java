package projetomaneiro;

import java.util.Scanner;

public class L08_A07 {
    public static void main(String[] args) {
        double total = 0;

        Scanner sc = new Scanner(System.in);
        for (int f = 1; f <= 10; f++) {
            int tempo = 0, sexo = 0;
            double sal = 0, bonus;

            while (sal <= 0) {
                System.out.println("Digite seu salário: ");
                sal = sc.nextDouble();
                if (sal <= 0) {
                    System.out.println("Valor inválido.");
                }
            }
            while (sexo <= 0 || sexo >= 3) {
                System.out.println("Digite o valor correspondente ao seu sexo\n(1) Masculino (2) Feminino");
                sexo = sc.nextInt();
                if (sexo <= 0 || sexo >= 3) {
                    System.out.println("Valor inválido.");
                }
            }
            while (tempo <= 0) {
                System.out.println("Digite seu tempo de serviço(anos): ");
                tempo = sc.nextInt();
                if (tempo <= 0) {
                    System.out.println("Valor inválido.");
                }
            }

            if (sexo == 1 && tempo >= 15) {
                bonus = sal*0.2;
                total += bonus;

                System.out.println("Seu bônus de natal será 20% do seu salário!");
                System.out.printf("%.2f%n",bonus);
            } else if (sexo == 2 && tempo >= 10) {
                bonus = sal*0.25;
                total += bonus;

                System.out.println("Seu bônus de natal será 25% do seu salário!");
                System.out.printf("%.2f%n",bonus);
            } else {
                total+=300;
                bonus = 300;
                System.out.printf("Seu bônus de natal será R$%.2f%n!",bonus);
            }
        }
        System.out.printf("Total de bônus concedidos: %.2f%n",total);
        sc.close();
    }
}

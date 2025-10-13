package projetomaneiro;

import java.util.Scanner;

public class L08_A07 {
    public static void main(String[] args) {
        int tempo = 0, sexo = 0;
        double sal = 0;
        Scanner sc = new Scanner(System.in);
        for (int f = 10; f <= 10; f++) {
            while (sal <= 0) {
                System.out.println("Digite seu salário: ");
                sal = sc.nextDouble();
                if (sal <= 0) {
                    System.out.println("Valor inválido.");
                }
            }
            while (sexo <= 0 || sexo >= 3) {
                System.out.println("Digite sua sexo%n(1) Masculino (2) Femenino%n ");
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
                System.out.println("Seu bônus de natal será 20% do seu salário!");
                System.out.printf("%.2f + %.2f = %.2f", sal, sal * 0.2, (sal + sal * 0.2));
            } else if (sexo == 2 && tempo >= 10) {
                System.out.println("Seu bônus de natal será 25% do seu salário!");
                System.out.printf("%.2f + %.2f = %.2f", sal, sal * 0.25, (sal + sal * 0.25));
            } else {
                System.out.println("Seu bônus de natal será R$300!");
            }
        }
        sc.close();
    }
}

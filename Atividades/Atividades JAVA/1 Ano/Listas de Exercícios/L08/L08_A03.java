package projetomaneiro;

import java.util.Scanner;

public class L08_A03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que deseja inserir: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("O número não é nem primo nem composto!");
        } else {
            int qntdDivisores = 0;
            for (int divisor = 1; divisor <= numero; divisor++) {
                if (numero % divisor == 0) {
                    qntdDivisores++;
                }
            }
            if (qntdDivisores == 2) {
                System.out.println("O número é primo!");
            } else {
                System.out.println("O número é composto!");
            }
        }
        sc.close();
    }
}

package Projetos_Java;
import java.util.Scanner;

public class L04_E04 {
    public static void main(String[] args) {
        int A,B,C;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor A:");
        A = entrada.nextInt();
        System.out.println("Digite o valor B:");
        B = entrada.nextInt();
        System.out.println("Digite o valor C:");
        C = entrada.nextInt();
        entrada.close();

        if (A + B >= C && A + C >= B && B + C >= A) {
            if (A == B && B == C) {
            System.out.println("Equilátero.");
            }
            else if (A == B || B == C || C == A) {
            System.out.println("Isósceles.");
            }
            else if (A != B && B != C && C != A) {
            System.out.println("Escaleno.");
            }
        }

        else {
            System.out.println("Os valores fornecidos não formam um triângulo.");

        }


    }
}

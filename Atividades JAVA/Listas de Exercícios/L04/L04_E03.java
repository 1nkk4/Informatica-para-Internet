package Projetos_Java;
import java.util.Scanner;

public class L04_E03 {
    public static void main(String[] args) {
        double A,B,C,Delta;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        A = entrada.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = entrada.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = entrada.nextDouble();
        entrada.close();

        Delta = B*B - 4*A*C;

        if (A != 0 && B != 0 && C != 0) {
            if (Delta < 0)  {
                System.out.println("A equação não possui raízes!");
            }
            else if (Delta > 0) {
                System.out.println("A equação possui duas raízes!");
            }
            else {
                System.out.println("A equação possui apenas uma raíz!");
            }
        }
        
        else {
            System.out.println("as variáveis A, B e C possuem valor zero!");
        }

    }
}

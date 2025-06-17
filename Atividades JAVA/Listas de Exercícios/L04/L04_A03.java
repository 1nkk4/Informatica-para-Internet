import java.util.Scanner;

public class L02_A03 {
    public static void main(String[] args) {
        double A,B,C,Delta;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        A = entrada.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = entrada.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = entrada.nextDouble();

        Delta = B*B - 4*A*C;
        
        if (Delta < 0)  {
            System.out.print("A equação não possui raízes!");
        }
        else if (Delta > 0) {
            System.out.print("A equação possui duas raízes!");
        }
        else {
            System.out.print("A equação possui apenas uma raíz!");
        }


    }
}

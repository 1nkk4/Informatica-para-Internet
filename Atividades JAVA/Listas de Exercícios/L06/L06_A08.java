import java.util.Scanner;

public class L06_A08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double h,c;
        int n;

        System.out.print("Digite o valor de N: ");
        n = entrada.nextInt();

        c = 1; h = 0;

        while (c <= n) {
            h = 1 / c + h;
            c = ++c;
        }
        System.out.printf("O resultado do valor de H é: %.2f", h);
        entrada.close();
    }
}

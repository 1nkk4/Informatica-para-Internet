import java.util.Scanner;
public class L06_A02 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int c = 1;
    System.out.println("Digite um numero para fazer a tabuada: ");
    int n = entrada.nextInt();

    while (c <= 10) {
        int r = c * n;
        System.out.printf("%d x %d = %d%n", c, n, r);
        c = ++c;
        }
        entrada.close();
    }
}

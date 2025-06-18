import java.util.Scanner;

public class L04_E08 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int v1;
    
    System.out.print("Digite um valor: ");
    v1 = entrada.nextInt();
    entrada.close();

    if (!(v1 > 3)) {
        System.out.print("O valor é " + v1);
    }

    }
}

import java.util.Scanner;

public class L06_A01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int c; double p;

        System.out.print("Digite o preço do produto: ");
        p = entrada.nextDouble();
        System.out.print("Digite o código de origem: ");
        c = entrada.nextInt();

        System.out.println("Preço        Região de Procedência");

        if (c == 1) {
            System.out.printf("R$%.2f          Norte%n", p);
        } else if (c == 2 || c == 5 || c == 9) {
            System.out.printf("R$%.2f          Sul%n", p);
        } else if (c == 3 || c >= 10 && c <= 15) {
            System.out.printf("R$%.2f          Leste%n", p);
        } else if (c == 7 || c == 20) {
            System.out.printf("R$%.2f          Oeste%n", p);
        } else {
            System.out.printf("R$%.2f          Importado%n", p);
        }
        entrada.close();
    }
}

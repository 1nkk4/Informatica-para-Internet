import java.util.Scanner;

public class L06_A01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int p, c;

        System.out.println("Digite o preço do produto: ");
        p = entrada.nextInt();
        System.out.println("Digite o código de origem: ");
        c = entrada.nextInt();

        System.out.println("Preço        Região de Procedência");

        if (c == 1) {
            System.out.println(p + "          Norte");
        } else if (c == 2 || c == 5 || c == 9) {
            System.out.println(p + "          Sul");
        } else if (c == 3 || c >= 10 && c <= 15) {
            System.out.println(p + "          Leste");
        } else if (c == 7 || c == 20) {
            System.out.println(p + "          Oeste");
        } else {
            System.out.println(p + "          Importado");
        }
    }
}
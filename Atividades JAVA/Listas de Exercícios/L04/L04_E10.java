import java.util.Scanner;

public class L04_E10 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int ano;

    System.out.print("Insira um ano: ");
    ano = entrada.nextInt();
    entrada.close();

    if ((ano > 1584 && ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
        System.out.print("O ano é bissexto!");
    }
    else {
        System.out.print("O ano não é bissexto!");
    }

    }
}

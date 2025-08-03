import java.util.Scanner;

public class L06_A04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        int n = entrada.nextInt();

        if (n >= 90 && n <= 100) {
            System.out.print("Parabéns, você tirou uma nota A!");
        }
        else if (n >= 80 && n <= 89) {
            System.out.print("Parabéns, você tirou uma nota B!");
        }
        else if (n >= 70 && n <= 79) {
            System.out.print("Parabéns, você tirou uma nota C!");
        }
        else if (n >= 60 && n <= 69) {
            System.out.print("Você tirou uma nota D!");
        }
        else if (n >= 0 && n <= 59) {
            System.out.print("Você tirou uma nota F!");
        }
        else {
            System.out.print("Você digitou uma nota inválida!");
        }
        entrada.close();
    }
}

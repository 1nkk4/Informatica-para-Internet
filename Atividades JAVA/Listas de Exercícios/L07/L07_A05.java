import java.util.Scanner;

public class L07_A05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quad, nume;
        nume = 0;

        do {
            System.out.println("Digite um número inteiro (negativo para sair): ");
            nume = sc.nextInt();
            if(nume>=0) {
                quad = nume*nume;
                System.out.printf("%d²=%d%n",nume,quad);
            }
        } while(nume>=0);

        System.out.println("Um valor negativo foi inserido, programa finalizado.");
        sc.close();
    }
}

import java.util.Scanner;

public class L07_A06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        // Exiba os valores de x2-5x+6 para valores de x digitados pelo teclado, até que o usuário digite zero para x.

        do {
            System.out.println("Digite um valor (zero para sair): ");
            num = sc.nextInt();
            if(num!=0) {
                System.out.printf("%d²-5*%d+6 = %d%n",num,num,num*num-5*num+6);
            }
        } while(num!=0);


        sc.close();
        System.out.print("Valor 0 inserido, programa finalizado.");


    }
}

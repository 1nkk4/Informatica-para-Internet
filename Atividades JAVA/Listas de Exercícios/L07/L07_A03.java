import java.util.Scanner;

public class L07_A03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v,t = 0;

        for(int c = 1; c <= 10; c++ ) {
            System.out.println("Digite o "+c+"° valor: ");
            v = sc.nextInt();
            t += v;
        }

        System.out.println("Resultado do somátorio: "+t);

    }
}

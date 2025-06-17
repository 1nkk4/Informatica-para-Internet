import java.util.Scanner;

public class L04_A04 {
    public static void main(String[] args) {
        Double A,B,C;

        Scanner entrada = new Scanner(System.in);

        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();

        if (A == B && B == C) {
            System.out.print("equilátero");
        }
        else if (A == B || B == C || C == A) {
            System.out.print("isósceles");
        }
        else if (A != B && B != C && C != A) {
            System.out.print("escaleno");
        }


    }
}

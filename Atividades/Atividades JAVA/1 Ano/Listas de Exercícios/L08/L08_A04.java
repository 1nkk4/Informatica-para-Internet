package projetomaneiro;

import java.util.Scanner;

public class L08_A04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o numerador: ");
        int n = sc.nextInt();
        System.out.print("Digite o denominador: ");
        int d = sc.nextInt();

        int ds = 1;

        for (int i = 2; i <= Math.min(n, d); i++) {
            if (n % i == 0 && d % i == 0) {
                ds = i;
            }
        }
        int nss = n / ds;
        int dss = d / ds;

        System.out.printf("%d / %d = %.2f%n%d / %d = %.2f", n, d, (double) n / d, nss, dss, (double) nss / dss);
        sc.close();
    }
}

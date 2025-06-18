package Projetos_Java;
import java.util.Scanner;

public class L04_E07 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int A,B,C,D,E;
        
    System.out.println("Insira cinco números inteiros:");

    A = entrada.nextInt();
    B = entrada.nextInt();
    C = entrada.nextInt();
    D = entrada.nextInt();
    E = entrada.nextInt();
    entrada.close();

    System.out.println("O maior valor inserido é:");

    if (A > B && A > C && A > D && A > E) {
        System.out.println(A);
    }
    if (B > A && B > C && B > D && B > E) {
        System.out.println(B);
    }
    if (C > A && C > B && C > D && C > E) {
        System.out.println(C);
    }
    if (D > A && D > B && D > C && D > E) {
        System.out.println(D);
    }
    if (E > A && E > B && E > C && E > D) {
        System.out.println(E);
    }

    System.out.println("O menor valor inserido é:");
    
    if (A < B && A < C && A < D && A < E) {
        System.out.println(A);
    }
    if (B < A && B < C && B < D && B < E) {
        System.out.println(B);
    }
    if (C < A && C < B && C < D && C < E) {
        System.out.println(C);
    }
    if (D < A && D < B && D < C && D < E) {
        System.out.println(D);
    }
    if (E < A && E < B && E < C && E < D) {
        System.out.println(E);
    }





    }
}

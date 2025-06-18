package Projetos_Java;
import java.util.Scanner;

public class L04_E07 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int A,B,C,D,E,Maior,Menor;
        
    System.out.println("Insira cinco números inteiros:");

    A = entrada.nextInt();
    B = entrada.nextInt();
    C = entrada.nextInt();
    D = entrada.nextInt();
    E = entrada.nextInt();
    entrada.close();

    Maior = A;
    Menor = A;

    // Calculo Valor da variavel Maior
    if (B > Maior) {
        Maior = B;
    }
    if (C > Maior) {
        Maior = C;
    }
    if (D > Maior) {
        Maior = D;
    }
    if (E > Maior) {
        Maior = E;
    }
    
    // Calculo valor da variavel Menor
    if (B < Menor) {
        Menor = B;
    }
    if (C < Menor) {
        Menor = C;
    }
    if (D < Menor) {
        Menor = D;
    }
    if (E < Menor) {
        Menor = E;
    }

    System.out.println("O menor valor inserido é: " + Menor);
    System.out.println("O maior valor inserido é: " + Maior);

    }
}

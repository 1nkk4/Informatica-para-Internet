package Projetos_Java;
import java.util.Scanner;

public class L05_A04 {
	public static void main(String[] args) {
    // Exiba os valores de x2-5x+6 para valores de x digitados pelo teclado, até que o usuário digite zero para x.
    Scanner entrada = new Scanner (System.in);
    int val, equ;
    val = 1;

    while (val != 0) {
        System.out.println("Digite o valor do X: ");
        val = entrada.nextInt();
        if (val != 0) {
            equ = (val*val-5*val+6);
            System.out.printf("O valor de x²-5x+6 para o valor de x digitado é: %d%n", equ);
        }
    }
    entrada.close();
    System.out.print("Valor 0 inserido, programa finalizado.");

    

    }
}
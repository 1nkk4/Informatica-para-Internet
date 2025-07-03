package Projetos_Java;
import java.util.Scanner;

public class L05_A02 {
	public static void main(String[]args) {
		
//		Calcule o somatório, a soma dos quadrados e a média entre os n primeiros números inteiros positivos.
		
		Scanner entrada = new Scanner(System.in);
		
		int nume, cont, quad, soma;
		double media;
		
		System.out.print("Digite quantos números você quer calcular: ");
		nume = entrada.nextInt();
		entrada.close();

		cont = 1;
		quad = 0;
		soma = 0;

		while (cont <= nume) {
			
			quad = quad + cont*cont;
			soma = soma + cont;
			cont = 1 + cont;
		}
		media = soma / nume;
		System.out.printf("Resultado do quadrado: %d%n Resultado da soma: %d%n Resultado da média: %d%n",quad,soma,media);
		
	}
}

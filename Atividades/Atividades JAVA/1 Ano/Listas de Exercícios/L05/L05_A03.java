package Projetos_Java;
import java.util.Scanner;

public class L05_A03 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
//	Exiba os quadrados de números digitados pelo usuário, até que ele digite um número negativo.
	
	int quad, nume;
	nume = 0;
	
	while (nume >= 0) {
		System.out.print("Digite um número inteiro (negativo para sair): ");
		nume = entrada.nextInt();
		if (nume >= 0) {
			quad = nume*nume;
			System.out.printf("Quadrado de %d: %d%n",nume,quad);
			}
	}
	entrada.close();
	System.out.println("Um valor negativo foi inserido, programa finalizado.");
	
	}

}

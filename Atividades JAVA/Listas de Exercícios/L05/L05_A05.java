package Projetos_Java;

public class L05_A05 {
	public static void main(String[] args) {

//		Apresente os quadrados dos números inteiros de 15 a 200.
		int num, quad;

		num = 15;

		while (num <= 200) {

			quad = num * num;
			System.out.printf("O quadrado do número %d é %d!%n", num, quad);
			num = num + 1;

		}
	}
}
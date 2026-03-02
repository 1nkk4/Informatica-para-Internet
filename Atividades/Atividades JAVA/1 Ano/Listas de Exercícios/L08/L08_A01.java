package projetomaneiro;

import java.util.Scanner;

public class L08_A01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double imc, peso, altura;

		do {

			System.out.println("Digite o seu peso em KG: ");
			peso = sc.nextDouble();
			System.out.println("Digite sua altura em metros: ");
			altura = sc.nextDouble();

			if (peso <= 0 || altura <= 0) {
				System.out.println("Digite um valor válido!");
			}

		} while (peso <= 0 || altura <= 0);

		imc = peso / (altura * altura);

		System.out.println(imc);

		if (imc <= 18.5) {
			System.out.println("Magreza");

		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Saudável");

		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Sobrepeso");

		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");

		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade Grau II (severa)");

		} else {
			System.out.println("Obesidade Grau III (mórbida)");

		}
        sc.close();

	}
}

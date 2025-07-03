package Projetos_Java;
import java.util.Scanner;

public class L05_A01{

	public static void main(String[] args) {
		
		//Calcule a soma de dez números quaisquer fornecidos pelo usuário
	
		Scanner entrada = new  Scanner (System.in);
		
		int soma, cont, nume;
		
		cont = 1;
		soma = 0;
		
		while (cont <= 10) {
			System.out.printf("Digite o %d° número: ",cont);
			nume = entrada.nextInt();
			soma = soma + nume;
			cont = cont + 1;
		}

		System.out.printf("Resultado final da soma: %d%n",soma);
		entrada.close();

	}

}



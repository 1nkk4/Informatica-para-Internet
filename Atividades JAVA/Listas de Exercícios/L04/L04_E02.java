package Projetos_Java;
import java.util.Scanner;

public class L04_E02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor: ");
		int v1 = entrada.nextInt();
		entrada.close();
		
		if (v1 >= 1 && v1 <= 9) {
			System.out.println("O valor está na faixa permitida");
		}
		else {
			System.out.println("O valor está fora da faixa permitida");
		}
		
		
	}
}	

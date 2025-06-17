package Projetos_Java;
import java.util.Scanner;

public class L01_A02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor: ");
		int v1 = entrada.nextInt();
		
		if (v1 >= 1 && v1 <= 9) {
			System.out.print("O valor está na faixa permitida");
		}
		else {
			System.out.print("O valor está fora da faixa permitida");
		}
		
		
	}
}	

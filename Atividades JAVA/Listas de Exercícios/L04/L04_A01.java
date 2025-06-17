package Projetos_Java;
import java.util.Scanner;

public class L01_A01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int v1, v2;

		System.out.print("Digite o primeiro valor: ");
		v1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		v2 = entrada.nextInt();
		
		System.out.print(v1+v2);
		
	}
}	

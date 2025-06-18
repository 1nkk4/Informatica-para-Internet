package Projetos_Java;
import java.util.Scanner;

public class L04_E01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int v1, v2;

		System.out.print("Digite o primeiro valor: ");
		v1 = entrada.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		v2 = entrada.nextInt();
		entrada.close();

		if (v1 > v2)	{
		System.out.print(v1-v2);
		}
		else {
		System.out.print(v2-v1);
		}
	}
}	

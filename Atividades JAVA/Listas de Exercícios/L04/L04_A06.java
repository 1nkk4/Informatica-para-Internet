package Projetos_Java;
import java.util.Scanner;

public class L04_A06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A,B,C,D;
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		if (A % 2 == 0 || A % 3 == 0) {
			System.out.println(A);
		}
		if (B % 2 == 0 || B % 3 == 0) {
			System.out.println(B);
		}
		if (C % 2 == 0 || C % 3 == 0) {
			System.out.println(C);
		}
		if (D % 2 == 0 || D % 3 == 0) {
			System.out.println(D);
		}
		entrada.close();
	}
}

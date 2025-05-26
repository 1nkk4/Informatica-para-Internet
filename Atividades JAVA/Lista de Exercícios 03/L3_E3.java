public class L3_E3 {
	public static void main(String[] args) {
		System.out.print("Valor A: ");
		
		int A = Integer.parseInt(System.console().readLine());
		
		System.out.print("Valor B: ");
		
		int B = Integer.parseInt(System.console().readLine());
		
		System.out.print("Valor C: ");
		
		int C = Integer.parseInt(System.console().readLine());
		
		int D = (A*A)+(B*B)+(C*C);
				
		System.out.printf("A soma do quadrado dos valor A, B e C é igual a: " + D);
		
	}
}
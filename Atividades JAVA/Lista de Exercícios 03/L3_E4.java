public class L3_E4 {
	public static void main(String[] args) {
		System.out.print("Valor A: ");
		
		int A = Integer.parseInt(System.console().readLine());
		
		System.out.print("Valor B: ");
		
		int B = Integer.parseInt(System.console().readLine());
		
		System.out.print("Valor C: ");
		
		int C = Integer.parseInt(System.console().readLine());
		
		int F = (A+B+C)*(A+B+C);
				
		System.out.printf("O quadrado da soma de A, B e C é igual a: = " + F);
		
	}
}
public class L3_E1 {
	public static void main(String[] args) {
		System.out.print("Valor A: ");
		
		double A = Double.parseDouble(System.console().readLine());
		
		System.out.print("Valor B: ");
		
		double B = Double.parseDouble(System.console().readLine());
		
		double AB;
		
		AB = A;
		A = B;
		B = AB;

		
		System.out.printf("Valor de A: = %.1f\n", A);
		System.out.printf("Valor de B: = %.1f\n", B);
		
	}
}
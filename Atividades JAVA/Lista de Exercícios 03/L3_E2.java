public class L3_E2 {
	public static void main(String[] args) {
		System.out.print("Valor A: ");
		
		int A = Integer.parseInt(System.console().readLine());
		
		System.out.print("Valor B: ");
		
		int B = Integer.parseInt(System.console().readLine());
		
		int C = (A-B)*(A-B);
				
		System.out.printf("Quadrado da diferença de A por B: = " + C);
		
	}
}
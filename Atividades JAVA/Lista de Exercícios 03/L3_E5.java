public class L3_E5 {
	public static void main(String[] args) {
		System.out.print("Valor A: ");
		
		int A = Integer.parseInt(System.console().readLine());
		
		System.out.print("Valor B: ");
		
		int B = Integer.parseInt(System.console().readLine());
		
		System.out.print("Valor C: ");
		
		int C = Integer.parseInt(System.console().readLine());
		
		System.out.print("Valor D: ");
		
		int D = Integer.parseInt(System.console().readLine());
		
		int F = (A-C)*(B+D);
				
		System.out.printf("Quadrado da diferença de A por B: = " + F);
		
	}
}
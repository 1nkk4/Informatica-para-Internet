public class L2_E4 {
	public static void main(String[] args) {
		System.out.print("Graus em fahrenheit: ");
		
		double gf = Double.parseDouble(System.console().readLine());
		
		double gc = 5 * ( gf - 32 ) / 9;
		
		System.out.printf("Graus em celsius  = %.2f°C\n", gc);
	}
}
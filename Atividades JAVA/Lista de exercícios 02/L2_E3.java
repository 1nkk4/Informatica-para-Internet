public class L2_E3 {
	public static void main(String[] args) {
		System.out.print("Graus em celsius: ");
		
		double gc = Double.parseDouble(System.console().readLine());
		
		double gf = (9*gc+160)/5;
		
		System.out.printf("Graus em fahrenheit = %.1f°F\n", gf);
	}
}
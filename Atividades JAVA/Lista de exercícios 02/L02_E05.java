public class L2_E2 {
	public static void main(String[] args) {
		System.out.print("Raio: ");
		
		double raio = Double.parseDouble(System.console().readLine());

		System.out.print("Altura: ");
		
		double alt = Double.parseDouble(System.console().readLine());
		
		double vol = 3.14159*raio*raio*alt;
		
		System.out.printf("Graus em celsius  = %f\n", vol);
	}
}
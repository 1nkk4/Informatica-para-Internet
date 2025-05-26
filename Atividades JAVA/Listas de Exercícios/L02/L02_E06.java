public class L2_E6 {
	public static void main(String[] args) {
		System.out.print("Tempo: ");
		double temp = Double.parseDouble(System.console().readLine());
		System.out.print("Velocidade: ");
		double vel = Double.parseDouble(System.console().readLine());

		double dist = temp*vel;
		
		double litros = dist/12;
		
		System.out.printf("litros  = %f\n", litros);
	}
}
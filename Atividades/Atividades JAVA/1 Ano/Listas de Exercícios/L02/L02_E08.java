public class L2_E8 {
	public static void main(String[] args) {
		System.out.print("Comprimento: ");
		double comp = Double.parseDouble(System.console().readLine());
		System.out.print("Largura: ");
		double larg = Double.parseDouble(System.console().readLine());
		System.out.print("Altura: ");
		double alt = Double.parseDouble(System.console().readLine());

		double vol = comp*larg*alt;
				
		System.out.printf("Volume da área: %f\n", vol);
	}
}
public class L3_E8 {
	public static void main(String[] args) {
		System.out.print("Altura: ");
		
		double alt = Double.parseDouble(System.console().readLine());

		System.out.print("Raio: ");
		
		double rai = Double.parseDouble(System.console().readLine());

        double area = 2 * 3.14159 * rai * (alt + rai);

        double lit = area / 3;

        int latas = (int)(lit/5);

        double val = latas*50;


		System.out.printf("Número de latas de tinta necessária: %d\n", latas);
		System.out.printf("Valor: %.2fR$\n", val);
		
	}
}
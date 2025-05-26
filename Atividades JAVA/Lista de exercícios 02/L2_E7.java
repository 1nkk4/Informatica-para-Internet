public class L2_E7 {
	public static void main(String[] args) {
		System.out.print("val: ");
		double val = Double.parseDouble(System.console().readLine());
		System.out.print("tax: ");
		double tax = Double.parseDouble(System.console().readLine());
		System.out.print("temp: ");
		double temp = Double.parseDouble(System.console().readLine());
		double prest= val+(val*tax/100)*temp;
		
		
		System.out.printf("Valor da prestação:  = %f\n", prest);
	}
}
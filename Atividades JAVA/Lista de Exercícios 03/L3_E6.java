public class L3_E6 {
	public static void main(String[] args) {
		System.out.print("Salário recebido: ");
		
		double sal = Double.parseDouble(System.console().readLine());

        System.out.print("Percentual de reajuste: ");
		
		double per = Double.parseDouble(System.console().readLine());
		
		double aument = sal * (per / 100);
		double nsal = sal + aument;
				
		System.out.printf("Novo Sálario: = " + nsal);
		
	}
}
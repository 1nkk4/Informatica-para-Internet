public class R01_A01 {
public static void main(String[] args) {
        double N1, N2;

        System.out.print("Insira o primeiro valor: ");
        N1 = Double.parseDouble(System.console().readLine());

        System.out.print("Insira o segundo valor: ");
        N2 = Double.parseDouble(System.console().readLine());

        System.out.printf("Soma dos valores: %.2f%n", N1+N2);
        System.out.printf("Multiplicação dos valores: %.2f%n", N1*N2);
        
    }
}

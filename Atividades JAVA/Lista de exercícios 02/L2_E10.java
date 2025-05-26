public class L2_E10 {
    public static void main(String[] args) {
        System.out.print("Insira o valor do real: ");
        double rea = Double.parseDouble(System.console().readLine());
        System.out.print("Insira seu valor em dólar: ");
        double dol = Double.parseDouble(System.console().readLine());

        double res = dol * rea;

        System.out.printf("Valor em reais: %.2f $\n", res);

    }
}
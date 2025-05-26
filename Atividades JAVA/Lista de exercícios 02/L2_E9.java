public class Main {
    public static void main(String[] args) {
        System.out.print("Insira o valor do dólar: ");
        double dol = Double.parseDouble(System.console().readLine());
        System.out.print("Insira seu valor em reais: ");
        double rea = Double.parseDouble(System.console().readLine());

        double res = rea / dol;

        System.out.printf("Valor em dolar: %.2f $\n", res);

    }
}
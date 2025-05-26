public class R1_A10 {
    public static void main(String[] args) {

        double vint,vinf,vmei,tot;
        int qntinf,qntm,qntint;

        System.out.println("Valor da entrada inteira: ");
        vint = Double.parseDouble(System.console().readLine());

        System.out.println("Quantidade de ingressos infantis: ");
        qntinf = Integer.parseInt(System.console().readLine());

        System.out.println("Quantidade de meias-entradas: ");
        qntm = Integer.parseInt(System.console().readLine());

        System.out.println("Quantidade de entradas inteiras: ");
        qntint = Integer.parseInt(System.console().readLine());

        vinf = vint * 0.10;
        vmei = vint * 0.50;

        tot = (qntinf * vinf) + (qntm * vmei) + (qntint * vint);

        System.out.printf("Total: R$%.2f%n", tot);

    }
}
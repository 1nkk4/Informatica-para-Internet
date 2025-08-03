import java.util.Scanner;
public class L06_A03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pu, vf, tf;
        int qv,p,c;

        System.out.print("Digite o número de produtos: ");
        p = entrada.nextInt();
        c = 1;
        tf = 0;

        while(c <= p) {
            System.out.print("Digite o valor unitário: ");
            pu = entrada.nextDouble();
            System.out.print("Digite a quantidade vendia no mês: ");
            qv = entrada.nextInt();
            vf = pu * qv;
            tf = vf + tf;
            System.out.printf("Produto %d: valor unitário = %.2f, quantidade vendida = %d, faturamento = %.2f\n", c, pu, qv, vf);
            c = ++c;
        }
            System.out.printf("Faturamento total mensal do armazém: %.2f\n", tf);
            entrada.close();
    }
}

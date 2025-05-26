public class R1_A9 {
    public static void main(String[] args) {
        
        double v1,v2,v3,p1,p2,p3,m;

        System.out.println("Digite o valor v1: ");
        v1 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o peso p1: ");
        p1 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite o valor v2: ");
        v2 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o peso p2: ");
        p2 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite o valor v3: ");
        v3 = Double.parseDouble(System.console().readLine());
        System.out.println("Digite o peso p3: ");
        p3 = Double.parseDouble(System.console().readLine());

        m = (v1 * p1 + v2 * p2 + v3 * p3) / (p1 + p2 + p3);

        System.out.printf("A média ponderada é: %.2f%n", m);
    }
}
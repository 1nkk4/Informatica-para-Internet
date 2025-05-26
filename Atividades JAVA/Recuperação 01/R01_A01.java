public class R1_A1 {
public static void main(String[] args) {
        double area;
        int raio;

        System.out.println("Digite o valor do raio: ");
        raio = Integer.parseInt(System.console().readLine());
        area = 3.14159 * (raio*raio);

        System.out.printf("Valor da Area: %.2f", area);
        
    }
}
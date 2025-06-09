public class R1_A07 {
    public static void main(String[] args) {

    double M,C,j,t;

    System.out.println("Insira o valor da divida: ");
    C = Double.parseDouble(System.console().readLine());
    
    System.out.println("Insira o valor da taxa de juros: ");
    j = Double.parseDouble(System.console().readLine());

    System.out.println("Insira o valor do tempo: ");
    t = Double.parseDouble(System.console().readLine());

    M = C+(C*j*t);

    System.out.printf("Valor devido: R$%.2f", M);

    }
}

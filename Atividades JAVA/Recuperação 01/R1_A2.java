public class R1_A2 {
    public static void main(String[] args) {
    
    double N;
    double NM;
    double NRQ;
    
    System.out.print("Digite um valor: ");
    N = Double.parseDouble(System.console().readLine());

    NM = N*2;
    NRQ = N*N;
    
    System.out.printf("%nValor digitado: %.2f%nDobro do valor digitado: %.2f%nValor digitado ao quadrado: %.2f", N, NM, NRQ);

    }
}

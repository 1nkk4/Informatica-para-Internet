public class R1_A06 {
    public static void main(String[] args) {
    
    double pes,alt,imc;

    System.out.println("Digite o valor do peso: ");
    pes = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o valor da altura: ");
    alt = Double.parseDouble(System.console().readLine());

    imc = pes/(alt*alt);

    System.out.printf("Seu Índice de Massa Corpórea (IMC): %.2f",imc);

    }
}

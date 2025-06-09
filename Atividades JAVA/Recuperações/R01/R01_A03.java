public class R01_A03 {
    public static void main(String[] args) {
    
    double N1,N2,N3,N4,NF;

    System.out.println("Digite a primeira nota: ");
    N1 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite a segunda nota: ");
    N2 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite a terceira nota: ");
    N3 = Double.parseDouble(System.console().readLine());

    System.out.println("Digite a quarta nota: ");
    N4 = Double.parseDouble(System.console().readLine());

    NF = (N1+N2+N3+N4)/4;

    System.out.printf("Nota final: %.2f",NF);

    }   
}

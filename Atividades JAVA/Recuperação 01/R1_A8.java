public class R1_A8 {
    public static void main(String[] args) {
    
    double lad,per,are,dia;

    System.out.println("Insira o valor de um lado de um quadrado: ");
    lad = Double.parseDouble(System.console().readLine());

    per = 4*lad;
    are = lad*lad;
    dia = lad*1.4142;

    System.out.printf("Lado:%.2f%nPerímetro:%.2f%nÁrea:%.2f%nDiagonal:%.2f%n",lad,per,are,dia);

    }
}
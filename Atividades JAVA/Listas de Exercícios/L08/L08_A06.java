package projetomaneiro;
import java.util.Scanner;

public class L08_A06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int f = 1; f <= 10; f++){
            System.out.println("Digite o seu Salário: ");
            double s = sc.nextDouble();

            if(s >0 && s < 1000) {
                double sr = s + (s * 0.55);
                System.out.printf("Salário do funcionário %d com reajuste: %.2f%n",f,sr);

            }
            else if(s >= 1000 && s <= 2500) {
                double sr = s + (s * 0.3);
                System.out.printf("Salário do funcionário %d com reajuste: %.2f%n",f,sr);

            }
            else if(s >= 2500) {
                double sr = s + (s * 0.2);
                System.out.printf("Salário do funcionário %d com reajuste: %.2f%n",f,sr);

            }
            else {
                System.out.println("Valor inválido, digite novamente.");
                f--;
            }
        }
        System.out.println("Programa finalizado.");
        sc.close();
    }
}

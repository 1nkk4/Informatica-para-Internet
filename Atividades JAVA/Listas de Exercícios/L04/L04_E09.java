package Projetos_Java;
import java.util.Scanner;

public class L04_E09 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    double sal,salrea;

    System.out.println("Digite o valor do seu salário: ");
    sal = entrada.nextDouble();
    entrada.close();
    if (sal < 5000) {
        salrea = sal * 0.30 + sal;
        System.out.printf("O valor do seu salário reajustado é: %.2f%n", salrea);
    }
    else {
        System.out.println("O salário deve ser inferior a R$5000!");
    }

    }
}

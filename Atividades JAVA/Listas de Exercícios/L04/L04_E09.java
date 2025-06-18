package Projetos_Java;
import java.util.Scanner;

public class L04_E09 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    double sal,salrea;

    System.out.print("Digite o valor do seu salário: ");
    sal = entrada.nextDouble();
    entrada.close();
    salrea = sal * 0.30 + sal;

    if (sal < 5000) {
        System.out.print("O valor do seu salário reajustado é: " + salrea);
    }
    else {
        System.out.print("O salário deve ser inferior a R$5000!");
    }

    }
}

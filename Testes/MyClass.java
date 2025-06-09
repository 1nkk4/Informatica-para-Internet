import java.util.Scanner;

// Versão em java da Atividade da aula 34 //

public class MyClass {
  public static void main(String args[]) {
    Scanner entrada = new Scanner(System.in);
    double N1,N2;
    
    System.out.print("Digite o N1");
    N1 = entrada.nextDouble();
    
    System.out.print("Digite o N2");
    N2 = entrada.nextDouble();
    
    if (N1 > N2)
        System.out.print("O resultado é: " + (N1-N2));
    else
        System.out.print("O resultado é: " + (N2-N1));

  }
}
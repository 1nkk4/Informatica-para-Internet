import java.util.Scanner;

// Calculadora simples para operações básicas //

public class CalculadoraSimples {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double num1, num2, resultado;
        int operacao;
        
        System.out.println("=== Calculadora Simples ===");
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextDouble();
        
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Adição (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        System.out.print("Opção: ");
        operacao = entrada.nextInt();
        
        switch(operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("\nResultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("\nResultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("\nResultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("\nResultado: " + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("\nErro: Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("\nOpção inválida!");
        }
        
        entrada.close();
    }
}

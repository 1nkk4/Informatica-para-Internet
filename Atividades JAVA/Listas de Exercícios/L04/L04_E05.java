package Projetos_Java;
import java.util.Scanner;

public class L04_E05 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A,B,C,D;
        
        System.out.println("Insira quatro números inteiros:");

        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();
        entrada.close();

        System.out.println("Valores divisíveis por 2 e 3:");
        
        if (A % 2 == 0 && A % 3 == 0)	{
        	System.out.println(A);
        }
        if (B % 2 == 0 && B % 3 == 0) 	{
        	System.out.println(B);
        }
        if (C % 2 == 0 && C % 3 == 0)	{
        	System.out.println(C);
        }
        if (D % 2 == 0 && D % 3 == 0)	{
        	System.out.println(D);
        }

    }
}

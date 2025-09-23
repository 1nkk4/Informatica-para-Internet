import java.util.Scanner;

public class L07_A07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//		Apresente os quadrados dos números inteiros de 15 a 200.
        int quad;

        for(int num = 15; num <= 200; num++) {
            System.out.printf("%d²=%d%n",num,num*num);
        }
        sc.close();
    }
}

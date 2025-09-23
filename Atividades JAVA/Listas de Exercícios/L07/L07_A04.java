import java.util.Scanner;

public class L07_A04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,qad=0,sum=0;double med;

        System.out.print("Digite quantos números você quer calcular: ");
        num = sc.nextInt();

        for(int c=1; c <= num; c++) {
            qad = qad + c*c;
            sum = sum + c;
        }
        med=sum/num;
        System.out.printf("Somatório: %d%nSoma dos quadrados: %d%nMédia: %.1f",sum,qad,med);
    }
}

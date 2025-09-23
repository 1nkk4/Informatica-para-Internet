import java.util.Scanner;

public class L07_A02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int placa;

        System.out.println("Digite o número da placa");
        do {
            placa = sc.nextInt();

            if (placa > 9999 || placa < 1000) {
                System.out.println("Valor inválido!");
            }

        } while(placa > 9999 || placa < 1000);

        switch(placa % 10) {
            case 0: System.out.println("deve se realizar a vistoria em Janeiro / 2014"); break;
            case 1: System.out.println("deve se realizar a vistoria em Fevereiro / 2014"); break;
            case 2: System.out.println("deve se realizar a vistoria em Março / 2014"); break;
            case 3: System.out.println("deve se realizar a vistoria em Abril / 2014"); break;
            case 4: System.out.println("deve se realizar a vistoria em Maio / 2014"); break;
            case 5: System.out.println("deve se realizar a vistoria em Junho / 2014"); break;
            case 6: System.out.println("deve se realizar a vistoria em Setembro deste ano"); break;
            case 7: System.out.println("deve se realizar a vistoria em Outubro deste ano"); break;
            case 8: System.out.println("deve se realizar a vistoria em Novembro deste ano"); break;
            case 9: System.out.println("deve se realizar a vistoria em Dezembro deste ano"); break;
        }

    }
}

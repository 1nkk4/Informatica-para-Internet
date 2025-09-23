import java.util.Scanner;

public class L07_A01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Dia, Mes, Ano; String nMes = null;

        do {System.out.println("Digite o número do dia: "); Dia = sc.nextInt();
            if(Dia < 1 || Dia > 31) {System.out.println("Valor inválido!");}}
            while(Dia < 1 || Dia > 31);

        do {System.out.println("Digite o número do mês: "); Mes = sc.nextInt();
            if(Mes < 1 || Mes > 12) {System.out.println("Valor Inválido!");}}
            while(Mes < 1 || Mes > 12);

        switch(Mes) {
            case 1: nMes = "Janeiro"; break;
            case 2: nMes = "Fevereiro"; break;
            case 3: nMes = "Março"; break;
            case 4: nMes = "Abril"; break;
            case 5: nMes = "Maio"; break;
            case 6: nMes = "Junho"; break;
            case 7: nMes = "Julho"; break;
            case 8: nMes = "Agosto"; break;
            case 9: nMes = "Setembro"; break;
            case 10: nMes = "Outubro"; break;
            case 11: nMes = "Novembro"; break;
            case 12: nMes = "Dezembro"; break;
        }

        System.out.println("Digite o número do ano: ");
        Ano = sc.nextInt();

        System.out.printf("%d de %s de %d",Dia, nMes, Ano);
        sc.close();

    }
}

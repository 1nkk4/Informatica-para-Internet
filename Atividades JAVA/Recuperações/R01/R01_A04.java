public class R01_A04 {
    public static void main(String[] args) {

    Integer ano,dia,hor,min;

    System.out.println("Digite sua idade em anos: ");
    ano = Integer.parseInt(System.console().readLine());

    dia = ano*365;
    hor = dia*24;
    min = hor*60;

    System.out.printf("Ano:%d%nDias:%d%nHoras:%d%nMinutos:%d%n" ,ano,dia,hor,min);

    }
}

public class R1_A5 {
    public static void main(String[] args) {

    double bas,alt,are,per;

    System.out.println("Digite o valor da altura do retângulo: ");
    alt = Double.parseDouble(System.console().readLine());

    System.out.println("Digite o valor da base do retângulo: ");
    bas = Double.parseDouble(System.console().readLine());

    per = (2*bas)+(2*alt);
    are = bas*alt;

    System.out.printf("Altura:%.2f%nBase:%.2f%nPerímetro:%.2f%nÁrea:%.2f%n",alt,bas,per,are);

    }
}
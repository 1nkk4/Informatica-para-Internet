
public class sqrt {
    public static void main(String[] args) {
        int cont;
        double raiz;
        cont = 1; raiz = 0;

        while (cont <= 100) {
            raiz = (double) Math.sqrt(cont);
            System.out.printf("√%d = %.2f%n", cont, raiz);
            cont++;
        }
    }
}
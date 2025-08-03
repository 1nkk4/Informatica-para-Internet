public class L06_A05 {
    public static void main(String[] args) {
        int c,s;
        s = 0;
        c = 1;

        while (c <= 500) {
            if (c % 2 == 0) {
                s = c + s;
            }
            c = ++c;
        }
        System.out.printf("Resultado do somador: %d", s);
    }
}

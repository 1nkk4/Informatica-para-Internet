public class L06_A07 {
    public static void main(String[] args) {
        int c;
        c = 0;

        while (c <= 15) {
            System.out.printf("3^%d = %d%n",c,3*(3*c));
            c = ++c;
        }
    }
}

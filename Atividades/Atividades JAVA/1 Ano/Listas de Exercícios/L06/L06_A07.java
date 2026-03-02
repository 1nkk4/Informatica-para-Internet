public class L06_A07 {
    public static void main(String[] args) {
        int c, p;
        c = 0; p = 1;

        while (c <= 15) {
            System.out.printf("3^%d = %d%n",c,p);
            p = p * 3;
            c = ++c;
        }
    }
}

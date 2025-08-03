public class L06_A06 {
    public static void main(String[] args) {
        int c;
        c = 0;

        while(c <= 20) {
            if (c % 2 != 0) {
                System.out.println(c);
            }
            c = ++c;
        }
    }
}

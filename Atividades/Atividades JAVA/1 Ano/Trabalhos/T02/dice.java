import java.util.Scanner;

public class dice {
    public static void main(String[] arg) {
        
        int girar;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Girar dado?\n[1] Sim [2] Não");
        girar = entrada.nextInt();
        
        while (girar == 1) {
            System.out.println("Você girou o dado e conseguiu o valor: " + (int) (1 + Math.random() * 6));
            
            System.out.println("Girar novamente?\n[1] Sim [2] Não");
            girar = entrada.nextInt();
        }
        entrada.close();
    }
}
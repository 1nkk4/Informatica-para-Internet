package reanimal2;
import javax.swing.JOptionPane;
public class Atividade8 {

	public static void main(String[] args) {		

		int[] vetor= new int[50];
		int i;
		int j=0;

		for(i=0; i < vetor.length ; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("digite o " + (i+1) + " numero"));

			if (vetor[i] %2 == 0 ) {
				j=vetor[i] + j;

			}
		}
		JOptionPane.showMessageDialog(null,j);

	}




}



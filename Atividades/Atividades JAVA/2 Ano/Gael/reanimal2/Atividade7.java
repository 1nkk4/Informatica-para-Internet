package reanimal2;
import javax.swing.JOptionPane;
public class Atividade7 {

	public static void main(String[] args) {




		double[] vetor= new double[10];
		int i;
		int j=0;

		for(i=0; i < vetor.length ; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("digite o " + (i+1) + " numero"));

			if (vetor[i]<=-1 ) {
				j++;

			}
		}
		JOptionPane.showMessageDialog(null,j);

	}




}



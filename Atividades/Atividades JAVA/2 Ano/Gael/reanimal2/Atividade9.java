package reanimal2;
import javax.swing.JOptionPane;
public class Atividade9 {

	public static void main(String[] args) {

		int [] vetor = new int[20];
		int i;



		for(i=0;i< vetor.length; i++) {

			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("informe o "+ (i+1) +"º número" ));
		}

		for (i=0;i< vetor.length; i++) {
			if (vetor[i] %2 ==0) {

				JOptionPane.showMessageDialog(null,"O numero par está na posicão "+i);


			}


		}









	}

}

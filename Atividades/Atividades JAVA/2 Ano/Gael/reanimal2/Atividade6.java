package reanimal2;
import javax.swing.JOptionPane;
public class Atividade6 {

	public static void main(String[] args) {

		int [] vetor = new int[30];
		int i;
		int contador=0;


		for(i=0;i< vetor.length; i++) {

			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("informe o "+ (i+1) +"º número" ));


			if(vetor[i]%2 == 0) {

				contador++;
			}
		}
		JOptionPane.showMessageDialog(null,contador);





	}

}

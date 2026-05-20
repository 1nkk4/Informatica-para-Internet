package reanimal2;
import javax.swing.JOptionPane;
public class Atividade10 {

	public static void main(String[] args) {

		int [] vetor = new int[5];
		int i;
	


		for(i=0;i< vetor.length; i++) {

			vetor[i]=Integer.parseInt(JOptionPane.showInputDialog("informe o "+ (i+1) +"º número" ));
		}
		for (i=vetor.length-1; i >= 0 ; i--) {
			
			JOptionPane.showMessageDialog(null, vetor[i]);
			
			
		}
			
			
		
		





	}

}

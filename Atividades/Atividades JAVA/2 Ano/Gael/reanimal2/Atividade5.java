package reanimal2;
import javax.swing.JOptionPane;
public class Atividade5 {

	public static void main(String[] args) {
		
			
		   int tamanho = Integer.parseInt(JOptionPane.showInputDialog("informe o tamanho do vetor a ser criado"));   

		
		int[] vetor= new int[tamanho];
		int i;
		
		for(i=0; i < vetor.length ; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("digite o " + (i+1) + " numero"));
		}
		
		for(i=0; i <vetor.length;i++) {
			if (vetor[i]>-1 ) {
			
			JOptionPane.showMessageDialog(null, vetor[i]);	
			}
		}
		
		
		
		
	}

}

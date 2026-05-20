package reanimal2;
import javax.swing.JOptionPane;
public class Atividade2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
	
		do { 
	num1=Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro numero:"));
	num2=Integer.parseInt(JOptionPane.showInputDialog("informe o segundo numero:"));
	
		
	int num3=num1+num2;
	
	JOptionPane.showMessageDialog(null, "Resultado:"+ num3);
		
		}while(JOptionPane.showConfirmDialog(null, "Quer continuar?","Opções", 0,2)==0);
		
		JOptionPane.showMessageDialog(null,"Soma finalizada");

		
	}
		

	}

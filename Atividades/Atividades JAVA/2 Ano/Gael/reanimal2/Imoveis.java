package reanimal2;
import javax.swing.JOptionPane;




public class Imoveis {
	
	

	public static void main(String[] args) {
		String nome;
		double valorI;
		
		nome= JOptionPane.showInputDialog(null,"informe o nome do proprietário:");
		valorI=Double.parseDouble(JOptionPane.showInputDialog(null,"informe o preço do imóvel:"));
		
		
		if (valorI<=100000.00) {
			
		JOptionPane.showMessageDialog(null, "Nome do proprietário é: "+nome);
		JOptionPane.showMessageDialog(null, "O valor do imóvel é: "+valorI);
		JOptionPane.showMessageDialog(null, "Seu imposto é isento");
			
		}
		else if (valorI>100000.00&& valorI <=200000.00) {
			double imposto=	valorI * 0.01;
			JOptionPane.showMessageDialog(null, "Nome do proprietário é: "+nome);
			JOptionPane.showMessageDialog(null, "O valor do imóvel é: "+valorI);
			JOptionPane.showMessageDialog(null, "Seu imposto é: "+imposto);
			}
		else {
			double imposto=	valorI * 0.02;
			
			JOptionPane.showMessageDialog(null, "Nome do proprietário é: "+nome);
			JOptionPane.showMessageDialog(null, "O valor do imóvel é: "+valorI);
			JOptionPane.showMessageDialog(null, "Seu imposto é: "+imposto);
		}
		
		
	}

}



 
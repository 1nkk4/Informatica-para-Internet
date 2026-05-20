package reanimal2;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		Atividade18 test;
		test= new Atividade18();
		
		test.AreaQ();
		String a;
		int b;
		a= JOptionPane.showInputDialog("informe um número:");
		
		
		b=Integer.parseInt(a);
		JOptionPane.showMessageDialog(null, b);
	}

}

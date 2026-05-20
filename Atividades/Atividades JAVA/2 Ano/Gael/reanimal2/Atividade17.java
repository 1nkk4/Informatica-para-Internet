
package reanimal2;
import javax.swing.JOptionPane;
public class Atividade17 {
	private int numero1,numero2;
	public void LeDoisNumeros() {
	numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero inteiro"));
	numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite outro numero inteiro"));
	}
	
	
	
	public void somaDoisNumeros () {
		int soma;
		soma = numero1 + numero2;
		JOptionPane.showMessageDialog(null, "a soma é:"+ soma);
	}
	
	public void subtraiDoisNumeros () {
		int sub;
		sub = numero1-numero2;
		JOptionPane.showMessageDialog(null, "a soma é:"+ sub);
	}
	public void multiplicatraiDoisNumeros () {
		int mult;
		mult = numero1*numero2;
		JOptionPane.showMessageDialog(null, "a soma é:"+ mult);
	}
	public void dividetraiDoisNumeros () {
		int div;
		div = numero1*numero2;
		JOptionPane.showMessageDialog(null, "a soma é:"+ div);
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		

	}

}

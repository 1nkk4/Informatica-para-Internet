package reanimal2;
import javax.swing.JOptionPane;
public class Atividade1 {

	public static void main(String[] args) {
		String rua;
		int num;
		String bairro;
		String cidade;
		String estado;
		String complemento;
		int cep;

		rua = JOptionPane.showInputDialog("informe a rua:");

		num = Integer.parseInt(JOptionPane.showInputDialog("numero:"));

		bairro=JOptionPane.showInputDialog("bairro:");

		cidade =JOptionPane.showInputDialog("cidade:");

		estado =JOptionPane.showInputDialog("estado:");
		
		complemento=JOptionPane.showInputDialog("complemento(se necessário)");

		cep =	Integer.parseInt(JOptionPane.showInputDialog("cep"));

		if(cidade.equalsIgnoreCase("Alvorada")) {
			
			JOptionPane.showMessageDialog(null, rua +"\n" + num +"\n"+ bairro +"\n"+ cidade +"\n"+ complemento + "\n" + cep);
			
		}
		else {
			JOptionPane.showMessageDialog(null, rua+ "\n" + num + "\n" + bairro + "\n" + cidade + "\n" + estado +"\n" + complemento + "\n" + cep);

			
			
		}
		

	}

}

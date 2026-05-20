package reanimal2;
import javax.swing.JOptionPane;
public class Atividade3 {

	public static void main(String[] args) {
		int num1;
		int num2;
		String operacao;


		do { 
			num1=Integer.parseInt(JOptionPane.showInputDialog("informe o primeiro numero:"));
			num2=Integer.parseInt(JOptionPane.showInputDialog("informe o segundo numero:"));

			int num3=num1+num2;
			int num4=num1-num2;
			int num5=num1*num2;
			double num6=num1/num2;

			operacao=JOptionPane.showInputDialog("informe a operação");
			if(operacao.equalsIgnoreCase("Soma")) {
				JOptionPane.showMessageDialog(null, "Resultado:"+ num3);
			}
			else if(operacao.equalsIgnoreCase("Subtração")) {
				JOptionPane.showMessageDialog(null, "Resultado:"+ num4);
			}
			else if(operacao.equalsIgnoreCase("Multiplicação")) {
				JOptionPane.showMessageDialog(null, "Resultado:"+ num5);
			}
			else if (operacao.equalsIgnoreCase("Divisão")){
				JOptionPane.showMessageDialog(null, "Resultado:"+ num6);
			}
			else {
				JOptionPane.showMessageDialog(null, "vc é MUITO BURRO, não é city boy");
			}

		}while(JOptionPane.showConfirmDialog(null, "Quer continuar?","Opções", 0,2)==0);

		JOptionPane.showMessageDialog(null,"Conta finalizada");
	}

}

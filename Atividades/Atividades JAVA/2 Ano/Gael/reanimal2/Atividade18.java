package reanimal2;
import javax.swing.JOptionPane;
import static java.lang.Math.PI;






public class Atividade18 {
int k;
	public void AreaQ() {
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do lado do quadrado"));
		double area=lado*lado;
		JOptionPane.showMessageDialog(null, "A área do quadrado é igual a: "+area);
	}
	public void Perimetro() {
		double lado = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do lado do quadrado"));
		double perimetro=lado*4;
		JOptionPane.showMessageDialog(null, "O perímetro do quadrado é igual a: "+perimetro);
	}
	public void Circunferencia() {
		double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do raio do circulo"));
		double areaC=(raio*raio)*PI;
		JOptionPane.showMessageDialog(null, "A área do circulo: "+areaC);
	}
	public void Polegadas() {
		double centimetros = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade em centímetros"));
		double polegados=centimetros*0.39;
		JOptionPane.showMessageDialog(null, "quantidade em polegadas: "+polegados);
	}
	public void Pes() {
		double centimetros = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade em centimetros"));
		double pes=centimetros/2.54;
		JOptionPane.showMessageDialog(null, "quantidade em pés: "+pes);
	}
	public void Jardas() {
		double centimetros = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a quantidade em centimetros"));
		double jardas=centimetros/91.44;
		JOptionPane.showMessageDialog(null, "quantidade em pés: "+jardas);
	}
	public void Max() {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os 3 números"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os 3 números"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os 3 números"));
		if(num1>num2&& num1>num3) {
			JOptionPane.showMessageDialog(null, "Maior número: "+num1);
		}
		else if (num2>num1&&num2>num3) {
			JOptionPane.showMessageDialog(null, "Maior número: "+num2);
		}
		else {
			JOptionPane.showMessageDialog(null, "Maior número: "+num3);
		}
	}
	public void Min() {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os 3 números"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os 3 números"));
		double num3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe os 3 números"));
		if(num1<num2&& num1<num3) {
			JOptionPane.showMessageDialog(null, "Menor número: "+num1);
		}
		else if (num2<num1&&num2<num3) {
			JOptionPane.showMessageDialog(null, "Menor número: "+num2);
		}
		else {
			JOptionPane.showMessageDialog(null, "Menor número: "+num3);
		}
	}
	public void Potencia() {
		int potencia=0;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o x:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o y:"));
		
		for ( k=1;k<num2;k++) {
			potencia+=num1*num1;
		}
		JOptionPane.showMessageDialog(null, "Valor da potência: "+potencia);
	}
	public void Divisores() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero desejado:"));
		int divisores[] =null;
		
		for ( k=1;k<=num1;k++) {
			
			for (int l=0;num1%l==0;l++) {
				
				divisores= new int[l];
				
			}
			
		}
		for (int p = 0;p<divisores.length;p++) {
			JOptionPane.showMessageDialog(null, "Todos divisores: "+divisores[p]);
		}
	}
	public void QDivisores() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero desejado:"));
		int divisores[] =null;
		
		for ( k=1;k<=num1;k++) {
			
			for (int l=0;num1%l==0;l++) {
				
				divisores= new int[l];
				
			}
			
		}
		for (int p = 0;p<divisores.length;p++) {
			JOptionPane.showMessageDialog(null, "Todos divisores: "+divisores.length);
		}
	}
public void SomDivisores() {
	int somaD=0;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero desejado:"));
		int divisores[] =null;
		
		for ( k=1;k<=num1;k++) {
			
			for (int l=0;num1%l==0;l++) {
				
				divisores= new int[l];
				
			}
			 somaD += divisores[k];
		}
		
		
		
		
	}
	
	




	public static void main(String[] args) {
		Atividade18 contas;
		contas= new Atividade18();
		int i;



		do {
			i = Integer.parseInt(JOptionPane.showInputDialog(null,"1:calculo da área\n" +
					"2:calculo do perímetro\n"+
					"3:calculo do raio da circunferencia e exibir sua área\n"+
					"4:ler uma medida em centímetros e a exibir medida equivalente em polegadas\n"+
					"5:ler uma medida em centímetros a exibir a medida equivalente em pés\n"+
					"6:ler uma medida em centímetros a exibir a medida equivalente em jardas\n"+
					"7:ler três números inteiros e exibir o maior deles\n"+
					"8:ler três números inteiros e exibir o menor deles\n"+
					"9:ler dois numeros inteiros e exibir x elevado a y e o resultado\n"+
					"10:ler um número inteiro e exibir todos seus divisores\n"+
					"11:ler um número inteiro e exibir a quantidade de divisores desse número\n"+
					"12:ler um número inteiro e exibir a soma dos divisores deste número\n"+
					"13:ler um número inteiro e exibir uma mensagem se o mesmo é primo ou não\n"+
					"14:ler um caractere e dois números inteiros. o caractere será exibido na tela. o primeiro inteiro indica a quantidade de vezes que o caractere será exibido na linha. o segundo inteiro indica a quantidade de linhas a serem exibidas\n"+
					"15:ler dois números inteiros e exibir uma mensagem se o segundo é divisor do primeiro."));

switch(i) {

case 1: contas.AreaQ();


}


		}while(i!=16 && i< 16);

	}

}

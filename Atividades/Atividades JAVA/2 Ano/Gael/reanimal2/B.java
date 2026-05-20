package reanimal2;

import javax.swing.JOptionPane;

public class B {
	public void AnoL() { 
		int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"informe o ano"));
		int a=ano%19;
		int c = ano/100;
		int b = ano%100;
		int d = b/4;
		int e = b%4;
		int g= (8*b+13) /25;
		int h= (19*a+b-d-g+15)%30;
		int j= c/4;
		int k= c%4;
		int m= (a+11*h)/319;
		int r = (2*e+2*j-k-h+m+32)%7;
		int n = (h-m+r+90)/25;
		int p = (h-m+r+n+19)%32;
		JOptionPane.showMessageDialog(null,"Páscoa passa no dia:"+p+" do mês:"+ n +" no ano de:"+ ano);
	}
	

	public static void main(String[] args) {
		B contas;
		contas= new B();
		contas.AnoL();
	

	}

}


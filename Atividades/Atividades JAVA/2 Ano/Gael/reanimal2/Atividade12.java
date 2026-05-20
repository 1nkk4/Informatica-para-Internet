package reanimal2;
import javax.swing.JOptionPane;


public class Atividade12 {

	public static void main(String[] args) {

		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("informe o tamanho do vetor a ser criado"));   


		int[] vetor= new int[tamanho];
		int i=0;
		int soma=0;
		int a=0;
		int b=1;
		int max=0;
		int min=0;
		int cont=0;
		int c;
		int d;
		boolean e=true;
		
		
		for(i=0; i < vetor.length ; i++) {

			vetor [i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+ (i+1) + "º número"));

			cont++;

			soma=vetor[i]+soma;

			for (b=1; b < vetor.length ; b++) {
				max=Math.max(vetor[a],vetor[b]);
			}
			for (b=1; b < vetor.length ; b++) {
				min=Math.min(vetor[a],vetor[b]);
			}

		}
		double média= soma/tamanho;
		do {
			c = Integer.parseInt(JOptionPane.showInputDialog("escolha oq você quer ver:\n"
					+ "1: ler e armazenar os números no vetor\n"
					+ "2: todos os números\n" 
					+ "3: quantidade de números\n"
					+ "4: soma de todos os números\n"
					+ "5: média aritimética\n"
					+ "6: maior número\n"
					+ "7: menor número\n"
					+ "8: pesquisar se o número está no vetor\n"
					+ "9: mostrar todos os números pares\n"
					+ "10: mostrar todos os números impares\n"+
					"11:saída"));



			switch(c) {
			
			case 1: for(i=0; i < vetor.length ; i++) {

					vetor [i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+ (i+1) + "º número"));

					cont++;

					soma=vetor[i]+soma;

					for (b=1; b < vetor.length ; b++) {
						max=Math.max(vetor[a],vetor[b]);
					}
					for (b=1; b < vetor.length ; b++) {
						min=Math.min(vetor[a],vetor[b]);
					}

				}
				
				break;

			case 2:for(i=0; i < vetor.length ; i++) {
				JOptionPane.showMessageDialog(null,"todos os números:" +vetor[i]);
			}
			break;

			case 3:JOptionPane.showMessageDialog(null, "quantidade de números:" +cont);
			break;

			case 4:JOptionPane.showMessageDialog(null, "soma:" +soma);
			break;

			case 5:JOptionPane.showMessageDialog(null, "média aritimética:" +média);
			break;

			case 6:JOptionPane.showMessageDialog(null,"máximo:"  +max);
			break;

			case 7:JOptionPane.showMessageDialog(null, "mínimo:" +min);
			break;

			case 8:       d=Integer.parseInt(JOptionPane.showInputDialog(null, "diga o numero procurado:"));
			for(i=0; i < vetor.length ; i++) { 
				if (d== vetor[i]) {
					JOptionPane.showMessageDialog(null,"sim o número "+ d +" está no vetor, na posição"+ (i+1));
					e=false;
				}

			}

			if (e)  {
				JOptionPane.showMessageDialog(null,"o número "+ d +" não está no vetor");
			}
			break;

			case 9:for(i=0; i < vetor.length ; i++) { 
				if (vetor[i] %2 ==0) {
					JOptionPane.showMessageDialog(null,"o número "+ vetor[i] +" é par");
				}
			}
				
				break;

			case 10:for(i=0; i < vetor.length ; i++) { 
				if (vetor[i] %2 !=0) {
					JOptionPane.showMessageDialog(null,"o número "+ vetor[i] +" é impar");
				}
			}
				
				break;

			case 11:
				
				break;

			case 67:JOptionPane.showMessageDialog(null,"você é tuffo, city boy e farma aura");

			}

		} while (c!=11 && c< 11); 

	}

}

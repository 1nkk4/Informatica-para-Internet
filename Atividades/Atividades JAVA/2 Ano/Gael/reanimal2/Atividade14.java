package reanimal2;

import javax.swing.JOptionPane;

class  Livraria {
	String titulo,nomeA,categoria;
	int paginas;
	double preco;
}

public class Atividade14 {

	public static void main(String[] args) {

		int i=1,j,k=0,m,n;
		boolean achou;
		String l,o;
		Livraria [] livros= new Livraria[100];





		do {
			j = Integer.parseInt(JOptionPane.showInputDialog("escolha oq você quer ver:\n"
					+ "1: Cadastrar um novo livro\n" 
					+ "2: Exibir todos as informações de todos os livros cadastrados\n"
					+ "3: Exibir a quantidade de livros cadastrados\n"
					+ "4: Pesquisar pelo título de um livro, se o mesmo está castrado exibir todos seus dados\n"
					+ "5: Pesquisar pelo autor de um livro e então exibir todos os dados de todos os livros deste autor\n"
					+ "6: Sair\n"));

			switch(j) {

			case 1: {
				livros[k]=new Livraria();
				livros[k].titulo=JOptionPane.showInputDialog(null,"Indique o título do livro:");
				livros[k].nomeA=JOptionPane.showInputDialog(null,"Indique o nome do autor:");
				livros[k].categoria=JOptionPane.showInputDialog(null,"Indique a categoria:");
				livros[k].paginas=Integer.parseInt(JOptionPane.showInputDialog(null,"Indique a quantidade de páginas:"));
				livros[k].preco=Double.parseDouble(JOptionPane.showInputDialog(null,"Indique o preço:"));

				k++;
				break;
			}
			case 2:
				for(i=0; i < k ; i++) {
					JOptionPane.showMessageDialog(null, "titulo:"+livros[i].titulo+"\n" 
							+"nome do Autor:"+livros[i].nomeA+"\n"
							+"categoria do livro:"+livros[i].categoria+ "\n"
							+"quantidade de páginas:"+livros[i].paginas+"\n"
							+"custo do livro:"+livros[i].preco);
				}
				break;

			case 3:JOptionPane.showMessageDialog(null,"quantidade de livros é: "+k);
			break;

			case 4: l=JOptionPane.showInputDialog(null, "diga o título procurado");
			achou=false;
			for(m=0; m < k ; m++) { 
				if (l.equalsIgnoreCase(livros[m].titulo)) {
					JOptionPane.showMessageDialog(null,"sim o título "+livros[m].titulo+" está na nossa livraria"
							+"e todos seus dados são:\n"
							+"nome do Autor:"+livros[i].nomeA+"\n"
							+"categoria do livro:"+livros[i].categoria+ "\n"
							+"quantidade de páginas:"+livros[i].paginas+"\n"
							+"custo do livro:"+livros[i].preco
							);
					achou=true;
				}
			}

			if (!achou)  {
				JOptionPane.showMessageDialog(null,"o título "+ l +" não está na livraria");
			}
			break;


			case 5:o=JOptionPane.showInputDialog(null, "diga o Autor procurado:");
			for (n=0;n<k;n++) {
				if (o.equalsIgnoreCase(livros[n].nomeA)) {

					JOptionPane.showMessageDialog(null,"Todos os títulos do autor "+o
							+"\ntitulo:"+livros[n].titulo+"\n" 
							+"categoria do livro:"+livros[n].categoria+ "\n"
							+"quantidade de páginas:"+livros[n].paginas+"\n"
							+"custo do livro:"+livros[n].preco);
				}
			}
			break;

			case 6:	

			}
		}while(j!=6 && j< 6);

	}

}

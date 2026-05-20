import javax.swing.JOptionPane;

    public class AT20_05 {
        
    

        class Produto {
            int codigo, quant;
            String nome;
            double preco;
        }

        Produto[] produto = new Produto[20];
        
        public void lerDados () {  

            

            for (int c=0; c<produto.length; c++) {
                
                
                produto[c] = new Produto();
                produto[c].codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do "+(c+1)+" Produto"));
                produto[c].nome = JOptionPane.showInputDialog("Digite o nome do "+(c+1)+" Produto");
                produto[c].preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do "+(c+1)+" Produto"));
                produto[c].quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do "+(c+1)+" Produto"));

            }
        }

        public void mostrarDados () {
            for (int c=0; c<produto.length; c++) {
                JOptionPane.showMessageDialog(null, "Produto "+(c+1)+"\nCódigo: "+produto[c].codigo+"\nNome: "+produto[c].nome+"\nPreço: "+produto[c].preco+"\nQuantidade: "+produto[c].quant);
            }
    
    }
        public void mostrarEstoque () {
            double estoque = 0;
            for (int c=0; c<produto.length; c++) {
                estoque += produto[c].quant*produto[c].preco;
            }
            JOptionPane.showMessageDialog(null, "Valor total do estoque: R$"+estoque);
        }

        public void Menu () {
            loja a = new loja();
            int opcao = 9;
            do{
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção\n1: Cadastrar 20 produtos;\n2: Exibir produtos;\n3: Exibir valor total do estoque;\n4: Consultar quantidade total de produtos\n5: Consultar informação de produto\n0: Fechar programa"));
                    switch(opcao) {
                        case 1: { a.lerDados(); break; }
                        case 2: { a.mostrarDados(); break; }
                        case 3: { a.mostrarEstoque(); break; }
                        case 4: { a.Total(); break;}
                        case 5: { a.Informacao(); break;}
                        case 0: {break;}
                        default: {JOptionPane.showMessageDialog(null, "Opção inválida");}
                    }
                

            }while(opcao != 0);
        }

        public void Total () {
            int total = 0;

            for (int c = 0; c<produto.length; c++) {
                if (produto[c].quant > 0) {
                    total += produto[c].quant;
                }
            }

            JOptionPane.showMessageDialog(null, "O total de produtos em estoque é: "+total);
        }
    
        public void Informacao () {
            int opcao = 0;

            do{
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do produto:"));
                JOptionPane.showMessageDialog(null, "Produto Código: "+produto[opcao].codigo+"\nNome: "+produto[opcao].nome+"\nPreço: "+produto[opcao].preco+"\nQuantidade: "+produto[opcao].quant);
            }while(opcao!=0);

            JOptionPane.showMessageDialog(null, "Voltando para o menu...");
        }


    public static void main(String[] args) {
    loja a = new loja();
    a.Menu();
    JOptionPane.showMessageDialog(null, "Programa finalizado");
    }
}
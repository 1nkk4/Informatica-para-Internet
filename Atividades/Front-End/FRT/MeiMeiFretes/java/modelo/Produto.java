
package modelo;

public class Produto {

    public int codigo;
    public String nome;
    public int codFornecedor;
    public double preco;
    public int qtdEstoque;
    public String nomeFornecedor;

    // Construtor vazio ´pra poder criar o produto sem inserir nenhum dado na hora
    public Produto() {
    }

    // Construtor com os dados do produto
    public Produto(String nome, int codFornecedor,
                   double preco, int qtdEstoque) {

        this.nome = nome;
        this.codFornecedor = codFornecedor;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

}

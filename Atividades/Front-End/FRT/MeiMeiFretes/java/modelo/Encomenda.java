package modelo;


public class Encomenda {

    public String nome;
    public String descricao;
    public int idFornecedor;
    public int idOrigem;
    public int idDestino;
    public int idLocalizacaoAtual;
    public String dataCriacao;

    public void Encomendas(
    		String nome,
    		String descricao,
            int idFornecedor, int idOrigem,
            int idDestino, int idLocalizacaoAtual,
            String dataCriacao) {

        this.nome = nome;
        this.descricao = descricao;
        this.idFornecedor = idFornecedor;
        this.idOrigem = idOrigem;
        this.idDestino = idDestino;
        this.idLocalizacaoAtual = idLocalizacaoAtual;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public int getIdOrigem() {
        return idOrigem;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public int getIdLocalizacaoAtual() {
        return idLocalizacaoAtual;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }
}

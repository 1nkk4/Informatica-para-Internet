package modelo;

public class Encomenda {

    private int idEncomenda;
    private long codigoRastreamento;
    private String nome;
    private String descricao;
    private int idFornecedor;
    private int idOrigem;
    private int idDestino;
    private int idLocalizacaoAtual;
    private String dataCriacao;

    public Encomenda(String nome, String descricao,
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

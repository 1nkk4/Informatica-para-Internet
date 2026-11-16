package modelo;


public class Encomenda {

    public int idEncomenda;
    public long codigoRastreamento;
    public String nome;
    public String descricao;
    public int idOrigem;
    public int idDestino;
    public int idLocalizacaoAtual;
    public String dataCriacao;

    public Encomenda() {
    }

    public Encomenda(
    		String nome,
    		String descricao, int idOrigem,
            int idDestino, int idLocalizacaoAtual,
            String dataCriacao) {

        this.nome = nome;
        this.descricao = descricao;
        this.idOrigem = idOrigem;
        this.idDestino = idDestino;
        this.idLocalizacaoAtual = idLocalizacaoAtual;
        this.dataCriacao = dataCriacao;
    }

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public long getCodigoRastreamento() {
        return codigoRastreamento;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
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
public class Historico {

    private int idHistorico;
    private int idEncomenda;
    private int idTipoStatus;
    private int idLocalizacao;
    private String descricao;
    private String data;

    public Historico(int idEncomenda, int idTipoStatus,
            int idLocalizacao, String descricao, String data) {

        this.idEncomenda = idEncomenda;
        this.idTipoStatus = idTipoStatus;
        this.idLocalizacao = idLocalizacao;
        this.descricao = descricao;
        this.data = data;
    }

    public int getIdHistorico() {
        return idHistorico;
    }

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public int getIdTipoStatus() {
        return idTipoStatus;
    }

    public int getIdLocalizacao() {
        return idLocalizacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }
}

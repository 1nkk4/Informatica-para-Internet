package modelo;

public class StatusEncomenda {

    private int idStatus;
    private int idEncomenda;
    private int idTipoStatus;
    private String descricao;
    private String data;

    public StatusEncomenda(int idEncomenda, int idTipoStatus,
            String descricao, String data) {

        this.idEncomenda = idEncomenda;
        this.idTipoStatus = idTipoStatus;
        this.descricao = descricao;
        this.data = data;
    }

    public int getIdStatus() {
        return idStatus;
    }

    public int getIdEncomenda() {
        return idEncomenda;
    }

    public int getIdTipoStatus() {
        return idTipoStatus;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }
}

public class TipoStatus {

    private int idTipoStatus;
    private String nome;
    private String descricao;

    public TipoStatus(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getIdTipoStatus() {
        return idTipoStatus;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}

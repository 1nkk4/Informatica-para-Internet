package model;

public class Localizacao {

    private int idLocalizacao;
    private String cidade;
    private String estado;
    private String codigo;

    public Localizacao(String cidade, String estado, String codigo) {
        this.cidade = cidade;
        this.estado = estado;
        this.codigo = codigo;
    }

    public int getIdLocalizacao() {
        return idLocalizacao;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCodigo() {
        return codigo;
    }
}
